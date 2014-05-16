package com.shuflr.interceptor;

import com.shuflr.interceptor.exceptions.InterceptorException;
import com.shuflr.interceptor.messages.InterceptorMessageIn;
import com.shuflr.interceptor.messages.InterceptorMessageOut;
import com.shuflr.interceptor.messages.InterceptorForwardRequest;

/**
 * Copyright (c) 2013 Carel Vosloo <code@bronzegate.com>
 * All rights reserved. No warranty, explicit or implicit, provided.
 * Created: 05/08/2013 22:44 by carel
 */
public interface ShuflrHttpInterceptor {

    /**
     * Invoked before the message gets forwarded to the servlet.
     * @param messageIn
     * @throws com.shuflr.interceptor.exceptions.InterceptorException
     */
    public InterceptorForwardRequest messageIn(InterceptorMessageIn messageIn)  throws InterceptorException;

    /**
     * Invoked after the message gets forwarded to the servlet.
     * @param messageOut
     * @throws InterceptorException
     */
    public void messageOut(InterceptorMessageOut messageOut) throws InterceptorException;

    /**
     * Invoked if an exception occurred in the servlet and a valid response was not received from the servlet.
     * @param messageOut
     * @throws InterceptorException
     */
    public void onMessageForwardFailure(InterceptorMessageOut messageOut)  throws InterceptorException;
}
