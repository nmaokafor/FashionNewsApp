package com.nmaokafor.android.fashionnews;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;

import java.io.IOException;
import java.net.URL;
import java.util.List;


public class FashionLoader extends AsyncTaskLoader<List<Fashion>> {

    public FashionLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    @Override
    public List<Fashion> loadInBackground() {
        List<Fashion> listOfFashionNews = null;
        try {
            URL url = QueryUtils.createUrl();
            String jsonResponse = QueryUtils.makeHttpRequest(url);
            listOfFashionNews = QueryUtils.parseJson(jsonResponse);
        } catch (IOException e) {
            Log.e("Queryutils", "Error Loader LoadInBackground: ", e);
        }
        return listOfFashionNews;
    }
}