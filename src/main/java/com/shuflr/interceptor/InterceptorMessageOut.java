package com.shuflr.interceptor;

/**
 * Copyright (c) 2013 Carel Vosloo <code@bronzegate.com>
 * All rights reserved. No warranty, explicit or implicit, provided.
 * Created: 12/08/2013 18:36 by carel
 */
public abstract class InterceptorMessageOut {

    public InterceptorMessageOut(InterceptorMessageIn messageIn, Integer responseHttpStatusCode, String responseBody, String responseContentType) {
        this.messageIn = messageIn;
        this.responseHttpStatusCode = responseHttpStatusCode;
        this.responseBody = responseBody;
        this.responseContentType = responseContentType;
    }

    public final InterceptorMessageIn messageIn;

    public final Integer responseHttpStatusCode;

    public final String responseBody;

    public final String responseContentType;
}
