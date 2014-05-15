package com.shuflr.interceptor;


import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (c) 2013 Carel Vosloo <code@bronzegate.com>
 * All rights reserved. No warranty, explicit or implicit, provided.
 * Created: 12/08/2013 18:36 by carel
 */
public class InterceptorMessageIn {

    public InterceptorMessageIn(ShuflrClient client, String requestURL, String requestBody, String httpRequestMethod, String requestContentType, Map<String, String[]> requestParams, Map<String, String[]> headerParam) {
        this.client = client;
        this.requestURL = requestURL;
        this.requestBody = requestBody;
        this.httpRequestMethod = httpRequestMethod;
        this.requestContentType = requestContentType;
        this.requestParams = requestParams;
        this.headerParam = headerParam;
    }

    public final ShuflrClient client;

    public final String requestURL;

    public final String requestBody;

    public final String httpRequestMethod;

    public final String requestContentType;

    public final Map<String, String[]> requestParams;

    public final Map<String, String[]> headerParam;
}
