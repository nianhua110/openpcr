/*
 * Copyright (c) 2017, CipherGateway and/or its affiliates. All rights  reserved.
 *
 */
package io.nianhua100.openpcr.protocol.body;

import io.nianhua100.openpcr.protocol.OpenPcrProtocolBody;
import io.nianhua100.openpcr.protocol.body.thermocycler.Array;
import io.nianhua100.openpcr.protocol.body.thermocycler.Lid;
import io.nianhua100.openpcr.protocol.body.thermocycler.Title;

public class Thermocycler extends OpenPcrProtocolBody {
  private static final byte type = 0x10;

  private Title title;
  private Lid lid;
  private Array components;

  public Thermocycler() {
    super(type);
  }

  protected String toStreamString() {
    return title.toStreamString() + "&"
        + lid.toStreamString() + "&"
        + components.toStreamString();
  }
}
