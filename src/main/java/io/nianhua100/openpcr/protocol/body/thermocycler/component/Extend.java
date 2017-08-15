/*
 * Copyright (c) 2017, CipherGateway and/or its affiliates. All rights  reserved.
 *
 */
package io.nianhua100.openpcr.protocol.body.thermocycler.component;

import io.nianhua100.openpcr.protocol.body.thermocycler.Component;

public class Extend extends Component {
  public Extend(int seconds, int temperature) {
    super("Extend", seconds, temperature);
  }
}
