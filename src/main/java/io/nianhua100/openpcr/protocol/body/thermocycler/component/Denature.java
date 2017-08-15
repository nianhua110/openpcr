/*
 * Copyright (c) 2017, CipherGateway and/or its affiliates. All rights  reserved.
 *
 */
package io.nianhua100.openpcr.protocol.body.thermocycler.component;

import io.nianhua100.openpcr.protocol.body.thermocycler.Component;

public class Denature extends Component {
  public Denature( int seconds, int temperature) {
    super("Denature", seconds, temperature);
  }
}
