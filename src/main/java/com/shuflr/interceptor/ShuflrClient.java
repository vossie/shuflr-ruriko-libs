package com.shuflr.interceptor;

/**
 * Copyright (c) 2013 Carel Vosloo <code@bronzegate.com>
 * All rights reserved. No warranty, explicit or implicit, provided.
 * Created: 05/08/2013 22:44 by carel
 */
public interface ShuflrClient {

    public String getPlayerId();

    public String getDisplayName();

    public Integer getAccountBalance(final String walletType);

    public boolean debitWallet(final int amount, final String walletType) throws InsufficientFundsException, AuthenticationRequiredException;

    public boolean creditWallet(final int amount, final String walletType) throws AuthenticationRequiredException;


}
