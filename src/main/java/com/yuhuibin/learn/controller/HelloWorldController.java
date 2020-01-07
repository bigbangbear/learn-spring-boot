/**
 * @(#)HelloWorldController.java, 2020/1/7.
 *
 * <p>Copyright 2020 Netease, Inc. All rights reserved. NETEASE PROPRIETARY/CONFIDENTIAL. Use is
 * subject to license terms.
 */
package com.yuhuibin.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** @author 余慧斌(hzyuhuibin @ corp.netease.com) */
@RestController
@RequestMapping("/hello")
public class HelloWorldController {

  /**
   * 第一个接口
   *
   * @return
   */
  @GetMapping("/get")
  public String get() {
    return "hello world";
  }
}
