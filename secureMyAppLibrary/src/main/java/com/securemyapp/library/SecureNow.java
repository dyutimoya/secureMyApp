package com.securemyapp.library;

import android.app.Activity;
import android.app.AlertDialog;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class SecureNow {
    public static void secure(Activity activity, String s) {
        RequestQueue requestQueue = Volley.newRequestQueue(activity);
        FirebaseVolleyHelper firebaseVolleyHelper = new FirebaseVolleyHelper(requestQueue);
        firebaseVolleyHelper.getData(s, response -> {
            if (response.equalsIgnoreCase("true")){
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setTitle("Alert");
                builder.setMessage("You can't use this app. Contact your developer !");
                builder.setCancelable(false);
                builder.create().show();
            }
        }, error -> {});
    }
}
