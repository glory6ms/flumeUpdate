/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.flume.thrift;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThriftFlumeEvent implements org.apache.thrift.TBase<ThriftFlumeEvent, ThriftFlumeEvent._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftFlumeEvent");

  private static final org.apache.thrift.protocol.TField HEADERS_FIELD_DESC = new org.apache.thrift.protocol.TField("headers", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField BODY_FIELD_DESC = new org.apache.thrift.protocol.TField("body", org.apache.thrift.protocol.TType.STRING, (short)2);

  public Map<String,String> headers; // required
  public ByteBuffer body; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HEADERS((short)1, "headers"),
    BODY((short)2, "body");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // HEADERS
          return HEADERS;
        case 2: // BODY
          return BODY;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HEADERS, new org.apache.thrift.meta_data.FieldMetaData("headers", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.BODY, new org.apache.thrift.meta_data.FieldMetaData("body", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftFlumeEvent.class, metaDataMap);
  }

  public ThriftFlumeEvent() {
  }

  public ThriftFlumeEvent(
    Map<String,String> headers,
    ByteBuffer body)
  {
    this();
    this.headers = headers;
    this.body = body;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftFlumeEvent(ThriftFlumeEvent other) {
    if (other.isSetHeaders()) {
      Map<String,String> __this__headers = new HashMap<String,String>();
      for (Map.Entry<String, String> other_element : other.headers.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__headers_copy_key = other_element_key;

        String __this__headers_copy_value = other_element_value;

        __this__headers.put(__this__headers_copy_key, __this__headers_copy_value);
      }
      this.headers = __this__headers;
    }
    if (other.isSetBody()) {
      this.body = org.apache.thrift.TBaseHelper.copyBinary(other.body);
;
    }
  }

  public ThriftFlumeEvent deepCopy() {
    return new ThriftFlumeEvent(this);
  }

  @Override
  public void clear() {
    this.headers = null;
    this.body = null;
  }

  public int getHeadersSize() {
    return (this.headers == null) ? 0 : this.headers.size();
  }

  public void putToHeaders(String key, String val) {
    if (this.headers == null) {
      this.headers = new HashMap<String,String>();
    }
    this.headers.put(key, val);
  }

  public Map<String,String> getHeaders() {
    return this.headers;
  }

  public ThriftFlumeEvent setHeaders(Map<String,String> headers) {
    this.headers = headers;
    return this;
  }

  public void unsetHeaders() {
    this.headers = null;
  }

  /** Returns true if field headers is set (has been assigned a value) and false otherwise */
  public boolean isSetHeaders() {
    return this.headers != null;
  }

  public void setHeadersIsSet(boolean value) {
    if (!value) {
      this.headers = null;
    }
  }

  public byte[] getBody() {
    setBody(org.apache.thrift.TBaseHelper.rightSize(body));
    return body == null ? null : body.array();
  }

  public ByteBuffer bufferForBody() {
    return body;
  }

  public ThriftFlumeEvent setBody(byte[] body) {
    setBody(body == null ? (ByteBuffer)null : ByteBuffer.wrap(body));
    return this;
  }

  public ThriftFlumeEvent setBody(ByteBuffer body) {
    this.body = body;
    return this;
  }

  public void unsetBody() {
    this.body = null;
  }

  /** Returns true if field body is set (has been assigned a value) and false otherwise */
  public boolean isSetBody() {
    return this.body != null;
  }

  public void setBodyIsSet(boolean value) {
    if (!value) {
      this.body = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HEADERS:
      if (value == null) {
        unsetHeaders();
      } else {
        setHeaders((Map<String,String>)value);
      }
      break;

    case BODY:
      if (value == null) {
        unsetBody();
      } else {
        setBody((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HEADERS:
      return getHeaders();

    case BODY:
      return getBody();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HEADERS:
      return isSetHeaders();
    case BODY:
      return isSetBody();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftFlumeEvent)
      return this.equals((ThriftFlumeEvent)that);
    return false;
  }

  public boolean equals(ThriftFlumeEvent that) {
    if (that == null)
      return false;

    boolean this_present_headers = true && this.isSetHeaders();
    boolean that_present_headers = true && that.isSetHeaders();
    if (this_present_headers || that_present_headers) {
      if (!(this_present_headers && that_present_headers))
        return false;
      if (!this.headers.equals(that.headers))
        return false;
    }

    boolean this_present_body = true && this.isSetBody();
    boolean that_present_body = true && that.isSetBody();
    if (this_present_body || that_present_body) {
      if (!(this_present_body && that_present_body))
        return false;
      if (!this.body.equals(that.body))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_headers = true && (isSetHeaders());
    builder.append(present_headers);
    if (present_headers)
      builder.append(headers);

    boolean present_body = true && (isSetBody());
    builder.append(present_body);
    if (present_body)
      builder.append(body);

    return builder.toHashCode();
  }

  public int compareTo(ThriftFlumeEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ThriftFlumeEvent typedOther = (ThriftFlumeEvent)other;

    lastComparison = Boolean.valueOf(isSetHeaders()).compareTo(typedOther.isSetHeaders());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeaders()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.headers, typedOther.headers);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBody()).compareTo(typedOther.isSetBody());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBody()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.body, typedOther.body);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // HEADERS
          if (field.type == org.apache.thrift.protocol.TType.MAP) {
            {
              org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
              this.headers = new HashMap<String,String>(2*_map0.size);
              for (int _i1 = 0; _i1 < _map0.size; ++_i1)
              {
                String _key2; // required
                String _val3; // required
                _key2 = iprot.readString();
                _val3 = iprot.readString();
                this.headers.put(_key2, _val3);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // BODY
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.body = iprot.readBinary();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.headers != null) {
      oprot.writeFieldBegin(HEADERS_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, this.headers.size()));
        for (Map.Entry<String, String> _iter4 : this.headers.entrySet())
        {
          oprot.writeString(_iter4.getKey());
          oprot.writeString(_iter4.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.body != null) {
      oprot.writeFieldBegin(BODY_FIELD_DESC);
      oprot.writeBinary(this.body);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftFlumeEvent(");
    boolean first = true;

    sb.append("headers:");
    if (this.headers == null) {
      sb.append("null");
    } else {
      sb.append(this.headers);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("body:");
    if (this.body == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.body, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (headers == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'headers' was not present! Struct: " + toString());
    }
    if (body == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'body' was not present! Struct: " + toString());
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

