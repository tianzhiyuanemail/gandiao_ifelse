/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package com.example.gandiao_ifelse.interfaces;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface HandlerType {

    String value();
}
