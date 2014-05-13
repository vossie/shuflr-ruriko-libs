package com.shuflr.interceptor;

/**
 * Copyright (c) 2013 Carel Vosloo <code@bronzegate.com>
 * All rights reserved. No warranty, explicit or implicit, provided.
 * Created: 05/08/2013 22:44 by carel
 */
public interface ShuflrHttpInterceptor {

    /**
     * Invoked before the message gets forwarded to the servlet.
     * @param messageIn
     * @throws InterceptorException
     */
    public void messageIn(InterceptorMessageIn messageIn)  throws InterceptorException;

    /**
     * Invoked after the message gets forwarded to the servlet.
     * @param messageOut
     * @throws InterceptorException
     */
    public void messageOut(InterceptorMessageOut messageOut) throws InterceptorException;

    /**
     * Invoked if an exception occurred in the servlet and a valid response was not received from the servlet.
     * @param messageIn
     * @throws InterceptorException
     */
    public void onMessageForwardFailure(InterceptorMessageIn messageIn)  throws InterceptorException;
}
