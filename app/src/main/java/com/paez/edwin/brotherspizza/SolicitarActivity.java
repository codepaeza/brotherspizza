package com.paez.edwin.brotherspizza;

import android.Manifest;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBarActivity;
import android.telephony.PhoneNumberUtils;
import android.util.Log;
import android.view.View;

/**
 * Created by PC on 9/12/2017.
 */

public class SolicitarActivity extends ActionBarActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.solicitar_servicio);
    }


    public void llamadaTelefono(View view) {
        Intent intentt=new Intent(Intent.ACTION_CALL, Uri.parse("tel:0317581801"));
        startActivity(intentt);
    }

    public void llamadaCelular(View view){
        Intent intentc=new Intent(Intent.ACTION_CALL, Uri.parse("tel:3012020604"));
        startActivity(intentc);
    }
    public void enviaWhatsapp(View view)
    {
        Intent intentwh = new Intent("android.intent.action.MAIN");
        intentwh.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
        intentwh.putExtra("jid", PhoneNumberUtils.stripSeparators("57" + "3012020604")+"@s.whatsapp.net");
        startActivity(intentwh);
    }

}
