package com.example.edo.weatherapp.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Edo on 2/8/2018.
 */

public class ToastUtils {
    public static void showToast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
