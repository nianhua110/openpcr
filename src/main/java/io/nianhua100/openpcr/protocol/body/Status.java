/*
 * Copyright (c) 2017, CipherGateway and/or its affiliates. All rights  reserved.
 *
 */
package io.nianhua100.openpcr.protocol.body;

import io.nianhua100.openpcr.protocol.OpenPcrProtocolBody;

public class Status extends OpenPcrProtocolBody {
  private  static final byte type = 0x10;
  public Status() {
    super(type);
  }

  protected String toStreamString() {
    return null;
  }
}
