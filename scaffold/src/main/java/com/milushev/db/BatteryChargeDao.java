package com.milushev.db;

import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

public interface BatteryChargeDao {
    @SqlUpdate("INSERT INTO energy.devices (uuid, capacity) " +
               "VALUES(:uuid,:capacity) " +
               "ON CONFLICT (uuid) DO UPDATE SET capacity = :capacity")
    void insert(@Bind("uuid") String deviceId, @Bind("capacity") long capacity);

    @SqlQuery("select capacity from energy.devices where uuid = :uuid")
    Long getCapacityByDeviceId(@Bind("uuid") String deviceId);

}
