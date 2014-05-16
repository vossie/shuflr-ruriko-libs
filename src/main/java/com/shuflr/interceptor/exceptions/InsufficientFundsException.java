package com.shuflr.interceptor.exceptions;

/**
 * Copyright (c) 2013 Carel Vosloo <code@bronzegate.com>
 * All rights reserved. No warranty, explicit or implicit, provided.
 * Created: 07/08/2013 15:49 by carel
 */
public class InsufficientFundsException extends InterceptorException{

    public InsufficientFundsException(String message) {
        super(message);
    }
}
