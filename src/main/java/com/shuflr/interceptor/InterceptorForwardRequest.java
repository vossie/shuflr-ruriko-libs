package com.shuflr.interceptor;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rpatadia on 15/05/2014.
 */
public final class InterceptorForwardRequest {

    public InterceptorForwardRequest(String httpRequestMethod, String requestContentType) {

        this.httpRequestMethod = httpRequestMethod;
        this.requestContentType = requestContentType;
    }

    public InterceptorForwardRequest(String requestBody, String httpRequestMethod, String requestContentType, Map<String, String[]> headerParams, Map<String, String[]> queryParams) {

        this.requestBody = requestBody;
        this.httpRequestMethod = httpRequestMethod;
        this.requestContentType = requestContentType;
        this.headerParams = headerParams;
        this.queryParams = queryParams;
    }

    public String requestBody = "";

    public String httpRequestMethod;

    public String requestContentType;

    public Map<String, String[]> headerParams = new HashMap<>();

    public Map<String,String[]> queryParams = new HashMap<>();

}
