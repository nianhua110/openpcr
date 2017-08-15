/*
 * Copyright (c) 2017, CipherGateway and/or its affiliates. All rights  reserved.
 *
 */
package io.nianhua100.openpcr.protocol;

public class OpenPcrProtocolHead implements IStream {

  private short len;

  public OpenPcrProtocolHead(short len) {
    this.len = len;
  }

  public short getLen() {
    return len;
  }

  public OpenPcrProtocolHead setLen(short len) {

    this.len = len;
    return this;
  }

  public byte[] toStream() {
    byte[] bytes = new byte[3];
    bytes[0] = (byte) 0xFE;
    bytes[1] = (byte) (len >> 8);
    bytes[2] = (byte) len;
    return bytes;
  }
}
