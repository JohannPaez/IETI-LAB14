package com.iet.ieti_mapsapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AddressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_address);
    }

    public void onClickAddAddress(View view) {
        Intent intent = new Intent();
        String latitude = ((TextView)findViewById(R.id.idLat)).getText().toString();
        String longitude = ((TextView)findViewById(R.id.idLon)).getText().toString();
        intent.putExtra("id", new double[]{Double.parseDouble(latitude), Double.parseDouble(longitude)});
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}
