package com.shuflr.interceptor;

/**
 * Copyright (c) 2013 Carel Vosloo <code@bronzegate.com>
 * All rights reserved. No warranty, explicit or implicit, provided.
 * Created: 10/08/2013 20:23 by carel
 */
public class InterceptorException extends Exception {

    Integer httpStatus;

    public InterceptorException(String message) {
        super(message);
    }

    public InterceptorException(String message, Integer httpStatus ) {
        super(message);

        this.httpStatus = httpStatus;
    }

    public Integer getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(Integer httpStatus) {
        this.httpStatus = httpStatus;
    }
}
