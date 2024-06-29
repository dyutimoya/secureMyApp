package com.securemyapp.library;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
public class FirebaseVolleyHelper {
    private static final String BASE_URL = "https://projectcontroller-7b37a-default-rtdb.firebaseio.com/";
    private static final String JSON_SUFFIX = ".json";
    private final RequestQueue requestQueue;
    public FirebaseVolleyHelper(RequestQueue requestQueue) {
        this.requestQueue = requestQueue;
    }
    public void getData(String path, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        String url = BASE_URL + path + JSON_SUFFIX;
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, listener, errorListener);
        requestQueue.add(stringRequest);
    }
}
