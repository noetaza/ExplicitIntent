package com.example.noe.explicitintent;

import android.content.Intent;
import android.net.Uri;
import android.provider.AlarmClock;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onClick1(View view){
        Uri uri = Uri.parse("https://www.amazon.com/");
        Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent1);
    }

    public void onClick2(View view){
        Intent intent2 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+51976914885"));
        startActivity(intent2);
    }

    public void onClick3(View view){
        Intent intent3 = new Intent(Intent.ACTION_CALL);
        intent3.setData(Uri.parse("tel:555-555-555"));
        startActivity(intent3);

    }

    public void onClick4(View view){
        Intent intent4= new Intent(Intent.ACTION_INSERT);
        intent4.setType(ContactsContract.Contacts.CONTENT_TYPE);
        startActivity(intent4);
    }

    public void onClick5(View view){
        Intent intent= new Intent(AlarmClock.ACTION_SET_ALARM);
        startActivity(intent);
    }

    public void onClick6(View view){
        Intent intent6= new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto", getResources().getString(R.string.mail), null));

        intent6.putExtra(Intent.EXTRA_SUBJECT, getResources().getString(R.string.subject));
        startActivity(Intent.createChooser(intent6, getResources().getString(R.string.envio)));

    }

    public void onClick7(View view){
        Intent intent7= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(intent7);
    }

    public void onClick8(View view){
        Intent intent8= new Intent(MediaStore.INTENT_ACTION_VIDEO_CAMERA);
        startActivity(intent8);
    }

    public void onClick9(View view){
        //GPS
    }

    public void onClick10(View view){
        Intent intent10= new Intent();
        intent10.setAction(Intent.ACTION_SEND);
        intent10.putExtra(Intent.EXTRA_TEXT, getResources().getString(
                R.string.text));
        intent10.setType("text/plain");
        startActivity(intent10);
    }

}
