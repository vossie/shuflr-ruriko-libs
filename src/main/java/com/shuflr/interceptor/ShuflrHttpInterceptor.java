package com.shuflr.interceptor;

/**
 * Copyright (c) 2013 Carel Vosloo <code@bronzegate.com>
 * All rights reserved. No warranty, explicit or implicit, provided.
 * Created: 05/08/2013 22:44 by carel
 */
public abstract class ShuflrHttpInterceptor {

    /**
     * All data will be placed under this element name in the response object.
     * @return The entity root node.
     */
    public final String entityRootNode;

    /**
     * The location of the resource
     * Example http://some.uri.local:8080/xyz
     * @return
     */
    public final String targetAddress;


    protected ShuflrHttpInterceptor(String entityRootNode, String targetAddress) {

        this.entityRootNode = entityRootNode;
        this.targetAddress = targetAddress;
    }

    /**
     * Invoked before the message gets forwarded to the servlet.
     * @param messageIn
     * @throws InterceptorException
     */
    public abstract InterceptorForwardRequest messageIn(InterceptorMessageIn messageIn)  throws InterceptorException;

    /**
     * Invoked after the message gets forwarded to the servlet.
     * @param messageOut
     * @throws InterceptorException
     */
    public abstract void messageOut(InterceptorMessageOut messageOut) throws InterceptorException;

    /**
     * Invoked if an exception occurred in the servlet and a valid response was not received from the servlet.
     * @param messageIn
     * @throws InterceptorException
     */
    public abstract void onMessageForwardFailure(InterceptorMessageIn messageIn)  throws InterceptorException;
}
