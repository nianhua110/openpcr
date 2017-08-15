/*
 * Copyright (c) 2017, CipherGateway and/or its affiliates. All rights  reserved.
 *
 */
package io.nianhua100.openpcr.protocol;

public class OpenPcrProtocolTail implements IStream{
  public byte[] toStream() {
    return new byte[]{(byte) 0xFF};
  }
}
