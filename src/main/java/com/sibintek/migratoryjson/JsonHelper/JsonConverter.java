package com.sibintek.migratoryjson.JsonHelper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.util.Map;

public class JsonConverter {
    private Gson gson = new Gson();

    public Integer getIDByKey(Object object) {
        String jsonObject = gson.toJson(object);
        JsonObject jsonObj = gson.fromJson(jsonObject, JsonObject.class);
        return jsonObj.get("id").getAsInt();
    }

    public String getJsonString(Object object) {
        return gson.toJson(object);
    }

    public Map<String, Object> getJsonObject(String object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(
                new TypeToken<Map<String, Object>>() {}.getType(),
                new com.sibintek.migratoryjson.JsonHelper.MapDeserializerDoubleAsIntFix());
        Gson gsonObj = gsonBuilder.create();
        return gsonObj.fromJson(object, new TypeToken<Map<String, Object>>() {}.getType());
    }


}
