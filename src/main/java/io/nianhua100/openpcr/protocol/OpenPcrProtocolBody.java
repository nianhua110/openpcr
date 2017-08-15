/*
 * Copyright (c) 2017, CipherGateway and/or its affiliates. All rights  reserved.
 *
 */
package io.nianhua100.openpcr.protocol;

public abstract class OpenPcrProtocolBody implements IStream {

  protected byte type;

  public OpenPcrProtocolBody(byte type) {
    this.type = type;
  }

  public byte[] toStream() {
    return new byte[0];
  }

  abstract  protected String toStreamString();
}
