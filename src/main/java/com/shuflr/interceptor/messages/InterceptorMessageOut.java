package com.shuflr.interceptor.messages;

import com.fasterxml.jackson.databind.JsonNode;
import com.shuflr.interceptor.common.ShuflrClient;

/**
 * Copyright (c) 2013 Carel Vosloo <code@bronzegate.com>
 * All rights reserved. No warranty, explicit or implicit, provided.
 * Created: 12/08/2013 18:36 by carel
 */
public class InterceptorMessageOut {

    public InterceptorMessageOut(InterceptorMessageIn messageIn, Integer responseHttpStatusCode, String responseBody, String responseContentType) {
        this(messageIn, responseHttpStatusCode, responseBody, null, responseContentType);
    }

    public InterceptorMessageOut(InterceptorMessageIn messageIn, Integer responseHttpStatusCode, String responseBody, JsonNode requestBodyAsJson, String responseContentType) {
        this.messageIn = messageIn;
        this.responseHttpStatusCode = responseHttpStatusCode;
        this.responseBody = responseBody;
        this.requestBodyAsJson = requestBodyAsJson;
        this.responseContentType = responseContentType;
        this.client = messageIn.client;
    }

    public final ShuflrClient client;

    public final InterceptorMessageIn messageIn;

    public final Integer responseHttpStatusCode;

    public final String responseBody;

    public final JsonNode requestBodyAsJson;

    public final String responseContentType;
}
