package com.agusoft.actividad5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.util.Log;
import android.widget.Toast;

public class ConexionWifi extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
            boolean connected = intent.getBooleanExtra(WifiManager.EXTRA_SUPPLICANT_CONNECTED, false);
            Log.d("estado",connected+"");
            if (connected) {
                Intent in = new Intent(Intent.ACTION_CALL);
                in.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                in.setData(Uri.parse("tel:2664553747"));
                context.startActivity(in);
            }else{
                Toast.makeText(context, "No esta conectado a wifi", Toast.LENGTH_SHORT).show();
            }

        }
    }

