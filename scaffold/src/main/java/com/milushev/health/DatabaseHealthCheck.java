package com.milushev.health;
import com.codahale.metrics.health.HealthCheck;
import org.jdbi.v3.core.Jdbi;

public class DatabaseHealthCheck extends HealthCheck {
    private final Jdbi database;

    public DatabaseHealthCheck(Jdbi database) {
        this.database = database;
    }

    @Override
    protected Result check() throws Exception {
            return Result.healthy();
    }
}
