package com.shuflr.interceptor;

import java.util.Map;

/**
 * Copyright (c) 2013 Carel Vosloo <code@bronzegate.com>
 * All rights reserved. No warranty, explicit or implicit, provided.
 * Created: 12/08/2013 18:36 by carel
 */
public interface InterceptorMessageIn {

    public ShuflrClient client();

    public String requestURL();

    public String requestBody();

    public String httpRequestMethod();

    public String requestContentType();

    public Map<String, String[]> requestParams();

    public void addForwardRequestHeaderParam(String key, String value);
}
