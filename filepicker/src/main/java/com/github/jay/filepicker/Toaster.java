package com.github.jay.filepicker;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static void show(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
