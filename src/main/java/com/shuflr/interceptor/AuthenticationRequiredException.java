package com.shuflr.interceptor;

/**
 * Copyright (c) 2013 Carel Vosloo <code@bronzegate.com>
 * All rights reserved. No warranty, explicit or implicit, provided.
 * Created: 07/08/2013 15:49 by carel
 */
public class AuthenticationRequiredException extends InterceptorException{

    public AuthenticationRequiredException(String message) {
        super(message);
    }
}
