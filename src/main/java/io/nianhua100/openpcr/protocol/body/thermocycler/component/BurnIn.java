/*
 * Copyright (c) 2017, CipherGateway and/or its affiliates. All rights  reserved.
 *
 */
package io.nianhua100.openpcr.protocol.body.thermocycler.component;

import io.nianhua100.openpcr.protocol.body.thermocycler.Component;

public class BurnIn extends Component {
  public BurnIn( int seconds, int temperature) {
    super("Burn In", seconds, temperature);
  }
}
