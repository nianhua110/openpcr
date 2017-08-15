/*
 * Copyright (c) 2017, CipherGateway and/or its affiliates. All rights  reserved.
 *
 */
package io.nianhua100.openpcr.protocol;

public class OpenPcrProtocol implements IStream {
  OpenPcrProtocolHead head;
  OpenPcrProtocolBody body;
  OpenPcrProtocolTail tail;

  public OpenPcrProtocol(OpenPcrProtocolHead head, OpenPcrProtocolBody body, OpenPcrProtocolTail tail) {
    this.head = head;
    this.body = body;
    this.tail = tail;
  }

  public OpenPcrProtocol() {
  }

  public OpenPcrProtocolHead getHead() {
    return head;
  }

  public OpenPcrProtocol setHead(OpenPcrProtocolHead head) {
    this.head = head;
    return this;
  }

  public OpenPcrProtocolBody getBody() {
    return body;
  }

  public OpenPcrProtocol setBody(OpenPcrProtocolBody body) {
    this.body = body;
    return this;
  }

  public OpenPcrProtocolTail getTail() {
    return tail;
  }

  public OpenPcrProtocol setTail(OpenPcrProtocolTail tail) {
    this.tail = tail;
    return this;
  }

  public byte[] toStream() {
    byte[] headBytes = head.toStream();
    byte[] bodyBytes = body.toStream();
    byte[] tailBytes = tail.toStream();
    byte[] packet = new byte[headBytes.length + bodyBytes.length + tailBytes.length];
    System.arraycopy(headBytes, 0, packet, 0, headBytes.length);
    System.arraycopy(bodyBytes, 0, packet, headBytes.length, bodyBytes.length);
    System.arraycopy(tailBytes, 0, packet, headBytes.length + bodyBytes.length, tailBytes.length);
    return packet;
  }
}
