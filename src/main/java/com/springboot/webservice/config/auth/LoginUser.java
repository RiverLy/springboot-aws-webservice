package com.springboot.webservice.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public @interface LoginUser {
    @Target(ElementType.PARAMETER)
    @Retention(RetentionPolicy.RUNTIME)
}
