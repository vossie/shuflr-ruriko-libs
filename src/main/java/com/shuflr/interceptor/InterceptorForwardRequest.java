package com.shuflr.interceptor;

import java.util.Map;

/**
 * Created by rpatadia on 15/05/2014.
 */
public final class InterceptorForwardRequest {

    public InterceptorForwardRequest(String requestURL, String requestBody, String httpRequestMethod, String requestContentType, Map<String, String[]> requestParams, Map<String, String[]> headerParams, Map<String, String[]> queryParams) {
        this.requestURL = requestURL;
        this.requestBody = requestBody;
        this.httpRequestMethod = httpRequestMethod;
        this.requestContentType = requestContentType;
        this.requestParams = requestParams;
        this.headerParams = headerParams;
        this.queryParams = queryParams;
    }

    public String requestURL;

    public String requestBody;

    public String httpRequestMethod;

    public String requestContentType;

    public Map<String, String[]> requestParams;

    public Map<String, String[]> headerParams;

    public Map<String,String[]> queryParams;
}
