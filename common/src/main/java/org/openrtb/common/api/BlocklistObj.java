/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.openrtb.common.api;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class BlocklistObj extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BlocklistObj\",\"namespace\":\"org.openrtb.common.api\",\"fields\":[{\"name\":\"publisherID\",\"type\":[\"string\",\"null\"]},{\"name\":\"publisherName\",\"type\":[\"string\",\"null\"]},{\"name\":\"sideID\",\"type\":[\"string\",\"null\"]},{\"name\":\"siteName\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   public java.lang.CharSequence publisherID;
   public java.lang.CharSequence publisherName;
   public java.lang.CharSequence sideID;
   public java.lang.CharSequence siteName;

  /**
   * Default constructor.
   */
  public BlocklistObj() {}

  /**
   * All-args constructor.
   */
  public BlocklistObj(java.lang.CharSequence publisherID, java.lang.CharSequence publisherName, java.lang.CharSequence sideID, java.lang.CharSequence siteName) {
    this.publisherID = publisherID;
    this.publisherName = publisherName;
    this.sideID = sideID;
    this.siteName = siteName;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return publisherID;
    case 1: return publisherName;
    case 2: return sideID;
    case 3: return siteName;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: publisherID = (java.lang.CharSequence)value$; break;
    case 1: publisherName = (java.lang.CharSequence)value$; break;
    case 2: sideID = (java.lang.CharSequence)value$; break;
    case 3: siteName = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'publisherID' field.
   */
  public java.lang.CharSequence getPublisherID() {
    return publisherID;
  }

  /**
   * Sets the value of the 'publisherID' field.
   * @param value the value to set.
   */
  public void setPublisherID(java.lang.CharSequence value) {
    this.publisherID = value;
  }

  /**
   * Gets the value of the 'publisherName' field.
   */
  public java.lang.CharSequence getPublisherName() {
    return publisherName;
  }

  /**
   * Sets the value of the 'publisherName' field.
   * @param value the value to set.
   */
  public void setPublisherName(java.lang.CharSequence value) {
    this.publisherName = value;
  }

  /**
   * Gets the value of the 'sideID' field.
   */
  public java.lang.CharSequence getSideID() {
    return sideID;
  }

  /**
   * Sets the value of the 'sideID' field.
   * @param value the value to set.
   */
  public void setSideID(java.lang.CharSequence value) {
    this.sideID = value;
  }

  /**
   * Gets the value of the 'siteName' field.
   */
  public java.lang.CharSequence getSiteName() {
    return siteName;
  }

  /**
   * Sets the value of the 'siteName' field.
   * @param value the value to set.
   */
  public void setSiteName(java.lang.CharSequence value) {
    this.siteName = value;
  }

  /** Creates a new BlocklistObj RecordBuilder */
  public static org.openrtb.common.api.BlocklistObj.Builder newBuilder() {
    return new org.openrtb.common.api.BlocklistObj.Builder();
  }
  
  /** Creates a new BlocklistObj RecordBuilder by copying an existing Builder */
  public static org.openrtb.common.api.BlocklistObj.Builder newBuilder(org.openrtb.common.api.BlocklistObj.Builder other) {
    return new org.openrtb.common.api.BlocklistObj.Builder(other);
  }
  
  /** Creates a new BlocklistObj RecordBuilder by copying an existing BlocklistObj instance */
  public static org.openrtb.common.api.BlocklistObj.Builder newBuilder(org.openrtb.common.api.BlocklistObj other) {
    return new org.openrtb.common.api.BlocklistObj.Builder(other);
  }
  
  /**
   * RecordBuilder for BlocklistObj instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BlocklistObj>
    implements org.apache.avro.data.RecordBuilder<BlocklistObj> {

    private java.lang.CharSequence publisherID;
    private java.lang.CharSequence publisherName;
    private java.lang.CharSequence sideID;
    private java.lang.CharSequence siteName;

    /** Creates a new Builder */
    private Builder() {
      super(org.openrtb.common.api.BlocklistObj.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.openrtb.common.api.BlocklistObj.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing BlocklistObj instance */
    private Builder(org.openrtb.common.api.BlocklistObj other) {
            super(org.openrtb.common.api.BlocklistObj.SCHEMA$);
      if (isValidValue(fields()[0], other.publisherID)) {
        this.publisherID = data().deepCopy(fields()[0].schema(), other.publisherID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.publisherName)) {
        this.publisherName = data().deepCopy(fields()[1].schema(), other.publisherName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.sideID)) {
        this.sideID = data().deepCopy(fields()[2].schema(), other.sideID);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.siteName)) {
        this.siteName = data().deepCopy(fields()[3].schema(), other.siteName);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'publisherID' field */
    public java.lang.CharSequence getPublisherID() {
      return publisherID;
    }
    
    /** Sets the value of the 'publisherID' field */
    public org.openrtb.common.api.BlocklistObj.Builder setPublisherID(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.publisherID = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'publisherID' field has been set */
    public boolean hasPublisherID() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'publisherID' field */
    public org.openrtb.common.api.BlocklistObj.Builder clearPublisherID() {
      publisherID = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'publisherName' field */
    public java.lang.CharSequence getPublisherName() {
      return publisherName;
    }
    
    /** Sets the value of the 'publisherName' field */
    public org.openrtb.common.api.BlocklistObj.Builder setPublisherName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.publisherName = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'publisherName' field has been set */
    public boolean hasPublisherName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'publisherName' field */
    public org.openrtb.common.api.BlocklistObj.Builder clearPublisherName() {
      publisherName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'sideID' field */
    public java.lang.CharSequence getSideID() {
      return sideID;
    }
    
    /** Sets the value of the 'sideID' field */
    public org.openrtb.common.api.BlocklistObj.Builder setSideID(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.sideID = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'sideID' field has been set */
    public boolean hasSideID() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'sideID' field */
    public org.openrtb.common.api.BlocklistObj.Builder clearSideID() {
      sideID = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'siteName' field */
    public java.lang.CharSequence getSiteName() {
      return siteName;
    }
    
    /** Sets the value of the 'siteName' field */
    public org.openrtb.common.api.BlocklistObj.Builder setSiteName(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.siteName = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'siteName' field has been set */
    public boolean hasSiteName() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'siteName' field */
    public org.openrtb.common.api.BlocklistObj.Builder clearSiteName() {
      siteName = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public BlocklistObj build() {
      try {
        BlocklistObj record = new BlocklistObj();
        record.publisherID = fieldSetFlags()[0] ? this.publisherID : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.publisherName = fieldSetFlags()[1] ? this.publisherName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.sideID = fieldSetFlags()[2] ? this.sideID : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.siteName = fieldSetFlags()[3] ? this.siteName : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}