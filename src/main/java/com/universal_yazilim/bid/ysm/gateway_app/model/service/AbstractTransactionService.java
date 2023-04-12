package com.universal_yazilim.bid.ysm.gateway_app.model.service;

import com.google.gson.JsonElement;

import java.util.List;

public abstract class AbstractTransactionService implements EntityService<JsonElement, Integer>
{
    public abstract List<JsonElement> findAllByUserID(Integer userID);
}
