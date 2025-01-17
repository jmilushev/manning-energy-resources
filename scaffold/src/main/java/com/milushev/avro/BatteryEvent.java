/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.milushev.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class BatteryEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8767525297621654591L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BatteryEvent\",\"namespace\":\"com.milushev.avro\",\"fields\":[{\"name\":\"device_id\",\"type\":\"string\"},{\"name\":\"charging\",\"type\":\"long\"},{\"name\":\"timestamp\",\"type\":\"string\"},{\"name\":\"charging_source\",\"type\":[\"string\",\"null\"]},{\"name\":\"current_capacity\",\"type\":[\"long\",\"null\"]},{\"name\":\"modulel_temp\",\"type\":[\"long\",\"null\"]},{\"name\":\"moduler_temp\",\"type\":[\"long\",\"null\"]},{\"name\":\"processor1_temp\",\"type\":[\"long\",\"null\"]},{\"name\":\"processor2_temp\",\"type\":[\"long\",\"null\"]},{\"name\":\"processor3_temp\",\"type\":[\"long\",\"null\"]},{\"name\":\"processor4_temp\",\"type\":[\"long\",\"null\"]},{\"name\":\"inverter_state\",\"type\":[\"long\",\"null\"]},{\"name\":\"soc_regulator\",\"type\":[\"float\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence device_id;
  @Deprecated public long charging;
  @Deprecated public java.lang.CharSequence timestamp;
  @Deprecated public java.lang.CharSequence charging_source;
  @Deprecated public java.lang.Long current_capacity;
  @Deprecated public java.lang.Long modulel_temp;
  @Deprecated public java.lang.Long moduler_temp;
  @Deprecated public java.lang.Long processor1_temp;
  @Deprecated public java.lang.Long processor2_temp;
  @Deprecated public java.lang.Long processor3_temp;
  @Deprecated public java.lang.Long processor4_temp;
  @Deprecated public java.lang.Long inverter_state;
  @Deprecated public java.lang.Float soc_regulator;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public BatteryEvent() {}

  /**
   * All-args constructor.
   */
  public BatteryEvent(java.lang.CharSequence device_id, java.lang.Long charging, java.lang.CharSequence timestamp, java.lang.CharSequence charging_source, java.lang.Long current_capacity, java.lang.Long modulel_temp, java.lang.Long moduler_temp, java.lang.Long processor1_temp, java.lang.Long processor2_temp, java.lang.Long processor3_temp, java.lang.Long processor4_temp, java.lang.Long inverter_state, java.lang.Float soc_regulator) {
    this.device_id = device_id;
    this.charging = charging;
    this.timestamp = timestamp;
    this.charging_source = charging_source;
    this.current_capacity = current_capacity;
    this.modulel_temp = modulel_temp;
    this.moduler_temp = moduler_temp;
    this.processor1_temp = processor1_temp;
    this.processor2_temp = processor2_temp;
    this.processor3_temp = processor3_temp;
    this.processor4_temp = processor4_temp;
    this.inverter_state = inverter_state;
    this.soc_regulator = soc_regulator;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return device_id;
    case 1: return charging;
    case 2: return timestamp;
    case 3: return charging_source;
    case 4: return current_capacity;
    case 5: return modulel_temp;
    case 6: return moduler_temp;
    case 7: return processor1_temp;
    case 8: return processor2_temp;
    case 9: return processor3_temp;
    case 10: return processor4_temp;
    case 11: return inverter_state;
    case 12: return soc_regulator;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: device_id = (java.lang.CharSequence)value$; break;
    case 1: charging = (java.lang.Long)value$; break;
    case 2: timestamp = (java.lang.CharSequence)value$; break;
    case 3: charging_source = (java.lang.CharSequence)value$; break;
    case 4: current_capacity = (java.lang.Long)value$; break;
    case 5: modulel_temp = (java.lang.Long)value$; break;
    case 6: moduler_temp = (java.lang.Long)value$; break;
    case 7: processor1_temp = (java.lang.Long)value$; break;
    case 8: processor2_temp = (java.lang.Long)value$; break;
    case 9: processor3_temp = (java.lang.Long)value$; break;
    case 10: processor4_temp = (java.lang.Long)value$; break;
    case 11: inverter_state = (java.lang.Long)value$; break;
    case 12: soc_regulator = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'device_id' field.
   */
  public java.lang.CharSequence getDeviceId() {
    return device_id;
  }

  /**
   * Sets the value of the 'device_id' field.
   * @param value the value to set.
   */
  public void setDeviceId(java.lang.CharSequence value) {
    this.device_id = value;
  }

  /**
   * Gets the value of the 'charging' field.
   */
  public java.lang.Long getCharging() {
    return charging;
  }

  /**
   * Sets the value of the 'charging' field.
   * @param value the value to set.
   */
  public void setCharging(java.lang.Long value) {
    this.charging = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   */
  public java.lang.CharSequence getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.CharSequence value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'charging_source' field.
   */
  public java.lang.CharSequence getChargingSource() {
    return charging_source;
  }

  /**
   * Sets the value of the 'charging_source' field.
   * @param value the value to set.
   */
  public void setChargingSource(java.lang.CharSequence value) {
    this.charging_source = value;
  }

  /**
   * Gets the value of the 'current_capacity' field.
   */
  public java.lang.Long getCurrentCapacity() {
    return current_capacity;
  }

  /**
   * Sets the value of the 'current_capacity' field.
   * @param value the value to set.
   */
  public void setCurrentCapacity(java.lang.Long value) {
    this.current_capacity = value;
  }

  /**
   * Gets the value of the 'modulel_temp' field.
   */
  public java.lang.Long getModulelTemp() {
    return modulel_temp;
  }

  /**
   * Sets the value of the 'modulel_temp' field.
   * @param value the value to set.
   */
  public void setModulelTemp(java.lang.Long value) {
    this.modulel_temp = value;
  }

  /**
   * Gets the value of the 'moduler_temp' field.
   */
  public java.lang.Long getModulerTemp() {
    return moduler_temp;
  }

  /**
   * Sets the value of the 'moduler_temp' field.
   * @param value the value to set.
   */
  public void setModulerTemp(java.lang.Long value) {
    this.moduler_temp = value;
  }

  /**
   * Gets the value of the 'processor1_temp' field.
   */
  public java.lang.Long getProcessor1Temp() {
    return processor1_temp;
  }

  /**
   * Sets the value of the 'processor1_temp' field.
   * @param value the value to set.
   */
  public void setProcessor1Temp(java.lang.Long value) {
    this.processor1_temp = value;
  }

  /**
   * Gets the value of the 'processor2_temp' field.
   */
  public java.lang.Long getProcessor2Temp() {
    return processor2_temp;
  }

  /**
   * Sets the value of the 'processor2_temp' field.
   * @param value the value to set.
   */
  public void setProcessor2Temp(java.lang.Long value) {
    this.processor2_temp = value;
  }

  /**
   * Gets the value of the 'processor3_temp' field.
   */
  public java.lang.Long getProcessor3Temp() {
    return processor3_temp;
  }

  /**
   * Sets the value of the 'processor3_temp' field.
   * @param value the value to set.
   */
  public void setProcessor3Temp(java.lang.Long value) {
    this.processor3_temp = value;
  }

  /**
   * Gets the value of the 'processor4_temp' field.
   */
  public java.lang.Long getProcessor4Temp() {
    return processor4_temp;
  }

  /**
   * Sets the value of the 'processor4_temp' field.
   * @param value the value to set.
   */
  public void setProcessor4Temp(java.lang.Long value) {
    this.processor4_temp = value;
  }

  /**
   * Gets the value of the 'inverter_state' field.
   */
  public java.lang.Long getInverterState() {
    return inverter_state;
  }

  /**
   * Sets the value of the 'inverter_state' field.
   * @param value the value to set.
   */
  public void setInverterState(java.lang.Long value) {
    this.inverter_state = value;
  }

  /**
   * Gets the value of the 'soc_regulator' field.
   */
  public java.lang.Float getSocRegulator() {
    return soc_regulator;
  }

  /**
   * Sets the value of the 'soc_regulator' field.
   * @param value the value to set.
   */
  public void setSocRegulator(java.lang.Float value) {
    this.soc_regulator = value;
  }

  /**
   * Creates a new BatteryEvent RecordBuilder.
   * @return A new BatteryEvent RecordBuilder
   */
  public static com.milushev.avro.BatteryEvent.Builder newBuilder() {
    return new com.milushev.avro.BatteryEvent.Builder();
  }
  
  /**
   * Creates a new BatteryEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new BatteryEvent RecordBuilder
   */
  public static com.milushev.avro.BatteryEvent.Builder newBuilder(com.milushev.avro.BatteryEvent.Builder other) {
    return new com.milushev.avro.BatteryEvent.Builder(other);
  }
  
  /**
   * Creates a new BatteryEvent RecordBuilder by copying an existing BatteryEvent instance.
   * @param other The existing instance to copy.
   * @return A new BatteryEvent RecordBuilder
   */
  public static com.milushev.avro.BatteryEvent.Builder newBuilder(com.milushev.avro.BatteryEvent other) {
    return new com.milushev.avro.BatteryEvent.Builder(other);
  }
  
  /**
   * RecordBuilder for BatteryEvent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BatteryEvent>
    implements org.apache.avro.data.RecordBuilder<BatteryEvent> {

    private java.lang.CharSequence device_id;
    private long charging;
    private java.lang.CharSequence timestamp;
    private java.lang.CharSequence charging_source;
    private java.lang.Long current_capacity;
    private java.lang.Long modulel_temp;
    private java.lang.Long moduler_temp;
    private java.lang.Long processor1_temp;
    private java.lang.Long processor2_temp;
    private java.lang.Long processor3_temp;
    private java.lang.Long processor4_temp;
    private java.lang.Long inverter_state;
    private java.lang.Float soc_regulator;

    /** Creates a new Builder */
    private Builder() {
      super(com.milushev.avro.BatteryEvent.SCHEMA$);
    }
    
    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.milushev.avro.BatteryEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.device_id)) {
        this.device_id = data().deepCopy(fields()[0].schema(), other.device_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.charging)) {
        this.charging = data().deepCopy(fields()[1].schema(), other.charging);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.charging_source)) {
        this.charging_source = data().deepCopy(fields()[3].schema(), other.charging_source);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.current_capacity)) {
        this.current_capacity = data().deepCopy(fields()[4].schema(), other.current_capacity);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.modulel_temp)) {
        this.modulel_temp = data().deepCopy(fields()[5].schema(), other.modulel_temp);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.moduler_temp)) {
        this.moduler_temp = data().deepCopy(fields()[6].schema(), other.moduler_temp);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.processor1_temp)) {
        this.processor1_temp = data().deepCopy(fields()[7].schema(), other.processor1_temp);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.processor2_temp)) {
        this.processor2_temp = data().deepCopy(fields()[8].schema(), other.processor2_temp);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.processor3_temp)) {
        this.processor3_temp = data().deepCopy(fields()[9].schema(), other.processor3_temp);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.processor4_temp)) {
        this.processor4_temp = data().deepCopy(fields()[10].schema(), other.processor4_temp);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.inverter_state)) {
        this.inverter_state = data().deepCopy(fields()[11].schema(), other.inverter_state);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.soc_regulator)) {
        this.soc_regulator = data().deepCopy(fields()[12].schema(), other.soc_regulator);
        fieldSetFlags()[12] = true;
      }
    }
    
    /**
     * Creates a Builder by copying an existing BatteryEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.milushev.avro.BatteryEvent other) {
            super(com.milushev.avro.BatteryEvent.SCHEMA$);
      if (isValidValue(fields()[0], other.device_id)) {
        this.device_id = data().deepCopy(fields()[0].schema(), other.device_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.charging)) {
        this.charging = data().deepCopy(fields()[1].schema(), other.charging);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.charging_source)) {
        this.charging_source = data().deepCopy(fields()[3].schema(), other.charging_source);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.current_capacity)) {
        this.current_capacity = data().deepCopy(fields()[4].schema(), other.current_capacity);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.modulel_temp)) {
        this.modulel_temp = data().deepCopy(fields()[5].schema(), other.modulel_temp);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.moduler_temp)) {
        this.moduler_temp = data().deepCopy(fields()[6].schema(), other.moduler_temp);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.processor1_temp)) {
        this.processor1_temp = data().deepCopy(fields()[7].schema(), other.processor1_temp);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.processor2_temp)) {
        this.processor2_temp = data().deepCopy(fields()[8].schema(), other.processor2_temp);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.processor3_temp)) {
        this.processor3_temp = data().deepCopy(fields()[9].schema(), other.processor3_temp);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.processor4_temp)) {
        this.processor4_temp = data().deepCopy(fields()[10].schema(), other.processor4_temp);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.inverter_state)) {
        this.inverter_state = data().deepCopy(fields()[11].schema(), other.inverter_state);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.soc_regulator)) {
        this.soc_regulator = data().deepCopy(fields()[12].schema(), other.soc_regulator);
        fieldSetFlags()[12] = true;
      }
    }

    /**
      * Gets the value of the 'device_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getDeviceId() {
      return device_id;
    }

    /**
      * Sets the value of the 'device_id' field.
      * @param value The value of 'device_id'.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder setDeviceId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.device_id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }

    /**
      * Checks whether the 'device_id' field has been set.
      * @return True if the 'device_id' field has been set, false otherwise.
      */
    public boolean hasDeviceId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'device_id' field.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder clearDeviceId() {
      device_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'charging' field.
      * @return The value.
      */
    public java.lang.Long getCharging() {
      return charging;
    }

    /**
      * Sets the value of the 'charging' field.
      * @param value The value of 'charging'.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder setCharging(long value) {
      validate(fields()[1], value);
      this.charging = value;
      fieldSetFlags()[1] = true;
      return this; 
    }

    /**
      * Checks whether the 'charging' field has been set.
      * @return True if the 'charging' field has been set, false otherwise.
      */
    public boolean hasCharging() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'charging' field.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder clearCharging() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public java.lang.CharSequence getTimestamp() {
      return timestamp;
    }

    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder setTimestamp(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.timestamp = value;
      fieldSetFlags()[2] = true;
      return this; 
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder clearTimestamp() {
      timestamp = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'charging_source' field.
      * @return The value.
      */
    public java.lang.CharSequence getChargingSource() {
      return charging_source;
    }

    /**
      * Sets the value of the 'charging_source' field.
      * @param value The value of 'charging_source'.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder setChargingSource(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.charging_source = value;
      fieldSetFlags()[3] = true;
      return this; 
    }

    /**
      * Checks whether the 'charging_source' field has been set.
      * @return True if the 'charging_source' field has been set, false otherwise.
      */
    public boolean hasChargingSource() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'charging_source' field.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder clearChargingSource() {
      charging_source = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'current_capacity' field.
      * @return The value.
      */
    public java.lang.Long getCurrentCapacity() {
      return current_capacity;
    }

    /**
      * Sets the value of the 'current_capacity' field.
      * @param value The value of 'current_capacity'.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder setCurrentCapacity(java.lang.Long value) {
      validate(fields()[4], value);
      this.current_capacity = value;
      fieldSetFlags()[4] = true;
      return this; 
    }

    /**
      * Checks whether the 'current_capacity' field has been set.
      * @return True if the 'current_capacity' field has been set, false otherwise.
      */
    public boolean hasCurrentCapacity() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'current_capacity' field.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder clearCurrentCapacity() {
      current_capacity = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'modulel_temp' field.
      * @return The value.
      */
    public java.lang.Long getModulelTemp() {
      return modulel_temp;
    }

    /**
      * Sets the value of the 'modulel_temp' field.
      * @param value The value of 'modulel_temp'.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder setModulelTemp(java.lang.Long value) {
      validate(fields()[5], value);
      this.modulel_temp = value;
      fieldSetFlags()[5] = true;
      return this; 
    }

    /**
      * Checks whether the 'modulel_temp' field has been set.
      * @return True if the 'modulel_temp' field has been set, false otherwise.
      */
    public boolean hasModulelTemp() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'modulel_temp' field.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder clearModulelTemp() {
      modulel_temp = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'moduler_temp' field.
      * @return The value.
      */
    public java.lang.Long getModulerTemp() {
      return moduler_temp;
    }

    /**
      * Sets the value of the 'moduler_temp' field.
      * @param value The value of 'moduler_temp'.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder setModulerTemp(java.lang.Long value) {
      validate(fields()[6], value);
      this.moduler_temp = value;
      fieldSetFlags()[6] = true;
      return this; 
    }

    /**
      * Checks whether the 'moduler_temp' field has been set.
      * @return True if the 'moduler_temp' field has been set, false otherwise.
      */
    public boolean hasModulerTemp() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'moduler_temp' field.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder clearModulerTemp() {
      moduler_temp = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'processor1_temp' field.
      * @return The value.
      */
    public java.lang.Long getProcessor1Temp() {
      return processor1_temp;
    }

    /**
      * Sets the value of the 'processor1_temp' field.
      * @param value The value of 'processor1_temp'.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder setProcessor1Temp(java.lang.Long value) {
      validate(fields()[7], value);
      this.processor1_temp = value;
      fieldSetFlags()[7] = true;
      return this; 
    }

    /**
      * Checks whether the 'processor1_temp' field has been set.
      * @return True if the 'processor1_temp' field has been set, false otherwise.
      */
    public boolean hasProcessor1Temp() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'processor1_temp' field.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder clearProcessor1Temp() {
      processor1_temp = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'processor2_temp' field.
      * @return The value.
      */
    public java.lang.Long getProcessor2Temp() {
      return processor2_temp;
    }

    /**
      * Sets the value of the 'processor2_temp' field.
      * @param value The value of 'processor2_temp'.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder setProcessor2Temp(java.lang.Long value) {
      validate(fields()[8], value);
      this.processor2_temp = value;
      fieldSetFlags()[8] = true;
      return this; 
    }

    /**
      * Checks whether the 'processor2_temp' field has been set.
      * @return True if the 'processor2_temp' field has been set, false otherwise.
      */
    public boolean hasProcessor2Temp() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'processor2_temp' field.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder clearProcessor2Temp() {
      processor2_temp = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'processor3_temp' field.
      * @return The value.
      */
    public java.lang.Long getProcessor3Temp() {
      return processor3_temp;
    }

    /**
      * Sets the value of the 'processor3_temp' field.
      * @param value The value of 'processor3_temp'.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder setProcessor3Temp(java.lang.Long value) {
      validate(fields()[9], value);
      this.processor3_temp = value;
      fieldSetFlags()[9] = true;
      return this; 
    }

    /**
      * Checks whether the 'processor3_temp' field has been set.
      * @return True if the 'processor3_temp' field has been set, false otherwise.
      */
    public boolean hasProcessor3Temp() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'processor3_temp' field.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder clearProcessor3Temp() {
      processor3_temp = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'processor4_temp' field.
      * @return The value.
      */
    public java.lang.Long getProcessor4Temp() {
      return processor4_temp;
    }

    /**
      * Sets the value of the 'processor4_temp' field.
      * @param value The value of 'processor4_temp'.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder setProcessor4Temp(java.lang.Long value) {
      validate(fields()[10], value);
      this.processor4_temp = value;
      fieldSetFlags()[10] = true;
      return this; 
    }

    /**
      * Checks whether the 'processor4_temp' field has been set.
      * @return True if the 'processor4_temp' field has been set, false otherwise.
      */
    public boolean hasProcessor4Temp() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'processor4_temp' field.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder clearProcessor4Temp() {
      processor4_temp = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'inverter_state' field.
      * @return The value.
      */
    public java.lang.Long getInverterState() {
      return inverter_state;
    }

    /**
      * Sets the value of the 'inverter_state' field.
      * @param value The value of 'inverter_state'.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder setInverterState(java.lang.Long value) {
      validate(fields()[11], value);
      this.inverter_state = value;
      fieldSetFlags()[11] = true;
      return this; 
    }

    /**
      * Checks whether the 'inverter_state' field has been set.
      * @return True if the 'inverter_state' field has been set, false otherwise.
      */
    public boolean hasInverterState() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'inverter_state' field.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder clearInverterState() {
      inverter_state = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /**
      * Gets the value of the 'soc_regulator' field.
      * @return The value.
      */
    public java.lang.Float getSocRegulator() {
      return soc_regulator;
    }

    /**
      * Sets the value of the 'soc_regulator' field.
      * @param value The value of 'soc_regulator'.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder setSocRegulator(java.lang.Float value) {
      validate(fields()[12], value);
      this.soc_regulator = value;
      fieldSetFlags()[12] = true;
      return this; 
    }

    /**
      * Checks whether the 'soc_regulator' field has been set.
      * @return True if the 'soc_regulator' field has been set, false otherwise.
      */
    public boolean hasSocRegulator() {
      return fieldSetFlags()[12];
    }


    /**
      * Clears the value of the 'soc_regulator' field.
      * @return This builder.
      */
    public com.milushev.avro.BatteryEvent.Builder clearSocRegulator() {
      soc_regulator = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    @Override
    public BatteryEvent build() {
      try {
        BatteryEvent record = new BatteryEvent();
        record.device_id = fieldSetFlags()[0] ? this.device_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.charging = fieldSetFlags()[1] ? this.charging : (java.lang.Long) defaultValue(fields()[1]);
        record.timestamp = fieldSetFlags()[2] ? this.timestamp : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.charging_source = fieldSetFlags()[3] ? this.charging_source : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.current_capacity = fieldSetFlags()[4] ? this.current_capacity : (java.lang.Long) defaultValue(fields()[4]);
        record.modulel_temp = fieldSetFlags()[5] ? this.modulel_temp : (java.lang.Long) defaultValue(fields()[5]);
        record.moduler_temp = fieldSetFlags()[6] ? this.moduler_temp : (java.lang.Long) defaultValue(fields()[6]);
        record.processor1_temp = fieldSetFlags()[7] ? this.processor1_temp : (java.lang.Long) defaultValue(fields()[7]);
        record.processor2_temp = fieldSetFlags()[8] ? this.processor2_temp : (java.lang.Long) defaultValue(fields()[8]);
        record.processor3_temp = fieldSetFlags()[9] ? this.processor3_temp : (java.lang.Long) defaultValue(fields()[9]);
        record.processor4_temp = fieldSetFlags()[10] ? this.processor4_temp : (java.lang.Long) defaultValue(fields()[10]);
        record.inverter_state = fieldSetFlags()[11] ? this.inverter_state : (java.lang.Long) defaultValue(fields()[11]);
        record.soc_regulator = fieldSetFlags()[12] ? this.soc_regulator : (java.lang.Float) defaultValue(fields()[12]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);  

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, org.apache.avro.specific.SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);  

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, org.apache.avro.specific.SpecificData.getDecoder(in));
  }

}
