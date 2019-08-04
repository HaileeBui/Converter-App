package com.example.asus.converterapp;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import static android.content.Context.MODE_PRIVATE;

public class FavouriteItemsList {

    private static ArrayList<FavouriteItem> items = new ArrayList<>();

    public static void addToFavouriteList (FavouriteItem item) {
        items.add(item);
    }

    public static void saveFavourite(Context context, List<FavouriteItem> item){//saving a favourite to shared preferences

        Gson gson = new Gson();
        String jsonFavorites = gson.toJson(item);
        SharedPreferences prefs = context.getSharedPreferences("prefs", MODE_PRIVATE);

        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("Favourites", jsonFavorites);

        editor.commit();
    }

    public static void removeFavoriteItem (Context context, FavouriteItem item){// to remove from favourites list
        List<FavouriteItem> items = getArray();
        items.remove(item);
        saveFavourite(context, items);

    }

    public static String toJsonString() {//to convert a favourite into json string
        Gson gson = new Gson();
        String json = gson.toJson(items);
        return json;
    }

    public static void fromJsonString(String jsonString) {//to get a favourite back from json string
        Gson gson = new Gson();
        if (jsonString.length() == 0) {
            return;     //early out if string is empty. Crashes otherwise
        }
        TypeToken<ArrayList<FavouriteItem>> token = new TypeToken<ArrayList<FavouriteItem>>() {};// to get an array of items
        items = gson.fromJson(jsonString, token.getType());
    }

    public static ArrayList<FavouriteItem> getArray () {
        return items;
    }
}
