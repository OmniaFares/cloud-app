package com.example.pushnotification.Notification;

import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import com.example.pushnotification.models.Notification;
import com.google.firebase.database.FirebaseDatabase;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Helper {
    private static final String TAG = "Helper";

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void saveData(String title, String body) {
        Log.d(TAG, "title: " + title + "\nbody: " + body);
        Notification notification = new Notification(title,body);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        FirebaseDatabase.getInstance().getReference("Notification").child(dtf.format(LocalDateTime.now())).setValue(notification);
    }
}
