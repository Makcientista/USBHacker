package com.example.erickwendel.droidhacker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Vibrator;
import android.view.KeyEvent;
import android.widget.Toast;

/**
 * Created by erickwendel on 11/26/17.
 */

public class DetectUSB extends BroadcastReceiver {
    private String TAG = "status....";

    @Override
    public void onReceive(Context context, Intent intent) {

        Intent i = new Intent(context, Main2Activity.class);
        context.startActivity(i);
    }
}
