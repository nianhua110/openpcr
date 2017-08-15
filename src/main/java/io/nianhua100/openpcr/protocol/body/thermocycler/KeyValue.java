/*
 * Copyright (c) 2017, CipherGateway and/or its affiliates. All rights  reserved.
 *
 */
package io.nianhua100.openpcr.protocol.body.thermocycler;

public class KeyValue implements IStreamString {
  private String key;
  private Object value;

  public KeyValue(String key, Object value) {
    this.key = key;
    this.value = value;
  }

  public String getKey() {
    return key;
  }

  public KeyValue setKey(String key) {
    this.key = key;
    return this;
  }

  public Object getValue() {
    return value;
  }

  public KeyValue setValue(Object value) {
    this.value = value;
    return this;
  }

  public String toStreamString() {
    return key + "=" + value;
  }
}
