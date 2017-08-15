/*
 * Copyright (c) 2017, CipherGateway and/or its affiliates. All rights  reserved.
 *
 */
package io.nianhua100.openpcr.protocol.body.thermocycler;

import java.util.ArrayList;
import java.util.List;

public class Array implements IStreamString {
  private List<Component> components = new ArrayList<Component>();

  public String toStreamString() {
    return components.stream()
        .map(in -> "(" + in.toStreamString() + ")")
        .reduce((a, b) -> a + b)
        .orElse("")
        ;
  }

  public Array add(Component component) {
    components.add(component);
    return this;
  }

  public Array remove(Component component) {
    components.remove(component);
    return this;
  }
}
