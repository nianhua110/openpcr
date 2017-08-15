/*
 * Copyright (c) 2017, CipherGateway and/or its affiliates. All rights  reserved.
 *
 */
package io.nianhua100.openpcr.protocol;

import java.util.Optional;

public abstract class OpenPcrProtocolBody implements IStream {

  protected byte type;

  public OpenPcrProtocolBody(byte type) {
    this.type = type;
  }

  public byte[] toStream() {
    return Optional.ofNullable(toStreamString())
        .map(String::getBytes)
        .map(in -> {
          byte[] bytes = new byte[in.length + 1];
          bytes[0] = type;
          System.arraycopy(in, 0, bytes, 1, in.length);
          return bytes;
        })
        .orElse(new byte[]{type});
  }


  public int getLength() {
    return Optional.of(toStream()).map(in -> in.length).orElse(0);
  }

  protected abstract String toStreamString();
}
