package com.universal_yazilim.bid.ysm.gateway_app.model.service;

import com.google.gson.JsonElement;
import com.universal_yazilim.bid.ysm.gateway_app.channel.utility.RetrofitUtil;
import retrofit2.Call;

import java.util.List;

public class ProductService extends AbstractProductService
{

    @Override
    public List<JsonElement> getAll()
    {
        Call<List<JsonElement>> requestGetAll = productCallable.getAll();

        return RetrofitUtil.callGenericBlock(requestGetAll);
    }

    @Override
    public void deleteByID(Integer id)
    {
        Call<Void> requestDeletedEntity = productCallable.deleteByID(id);

        RetrofitUtil.callGenericBlock(requestDeletedEntity);
    }

    @Override
    public JsonElement save(JsonElement entity)
    {
        Call<JsonElement> requestSavedEntity = productCallable.save(entity);

        return RetrofitUtil.callGenericBlock(requestSavedEntity);
    }
}
