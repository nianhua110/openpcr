/*
 * Copyright (c) 2017, CipherGateway and/or its affiliates. All rights  reserved.
 *
 */
package io.nianhua100.openpcr.protocol.body.thermocycler;

public class Component implements IStreamString {
  private String name;
  private int seconds;
  private int temperature;

  public Component(String name, int seconds, int temperature) {
    this.name = name;
    this.seconds = seconds;
    this.temperature = temperature;
  }

  public String toStreamString() {
    return seconds + "|" + temperature + "|" + name;
  }
}
