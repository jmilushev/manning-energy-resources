package com.milushev;

import com.milushev.cli.EventProcessor;
import com.milushev.db.BatteryChargeDao;
import com.milushev.health.DatabaseHealthCheck;
import com.milushev.kafka.BatteryEventProducer;
import com.milushev.kafka.KafkaStreamManager;
import com.milushev.resources.BatteryEventResource;
import io.dropwizard.Application;
import io.dropwizard.jdbi3.JdbiFactory;
import io.dropwizard.jdbi3.bundles.JdbiExceptionsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.jdbi.v3.core.Jdbi;

public class IngestService  extends Application<IngestConfiguration> {
    public static void main(String[] args) throws Exception {
        new IngestService().run(args);
    }

    @Override
    public String getName() {return "energy-kafka"; }

    @Override
    public void initialize(Bootstrap<IngestConfiguration> bootstrap) {
        bootstrap.addBundle(new JdbiExceptionsBundle());
 //       bootstrap.addCommand(new EventProcessor());

    }

    @Override
    public void run(IngestConfiguration config,
                    Environment environment) {
        final JdbiFactory factory = new JdbiFactory();
        final Jdbi jdbi = factory.build(environment, config.getDataSourceFactory(), "postgresql");
        final BatteryChargeDao batteryChargeDao = jdbi.onDemand(BatteryChargeDao.class);
 //       config.setBatteryChargeDao(batteryChargeDao);

        final BatteryEventProducer batteryEventProducer =
                new BatteryEventProducer(config.getKafkaBroker(),
                        config.getSchemaRegistryUrl(),
                        config.getBatteryEventTopic());

        KafkaStreamManager kafkaStreamManager = new KafkaStreamManager(config, batteryChargeDao);
        environment.lifecycle().manage(kafkaStreamManager);

        final BatteryEventResource resource = new BatteryEventResource(batteryEventProducer, batteryChargeDao);
//        final DatabaseHealthCheck healthCheck = new DatabaseHealthCheck(jdbi);
//        environment.healthChecks().register("mydb", healthCheck);
        environment.jersey().register(resource);
    }

}
