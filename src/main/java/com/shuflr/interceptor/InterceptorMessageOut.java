package com.shuflr.interceptor;

/**
 * Copyright (c) 2013 Carel Vosloo <code@bronzegate.com>
 * All rights reserved. No warranty, explicit or implicit, provided.
 * Created: 12/08/2013 18:36 by carel
 */
public interface InterceptorMessageOut extends InterceptorMessageIn {

    public Integer responseHttpStatusCode();

    public String responseBody();

    public String responseContentType();

    public InterceptorMessageOut setContentType(String mimeType);
}
