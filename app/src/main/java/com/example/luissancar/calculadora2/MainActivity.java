package com.example.luissancar.calculadora2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void pulsado(View view) {

        TextView tv=(TextView)findViewById(view.getId());
        Toast.makeText(this,tv.getText().toString(),Toast.LENGTH_SHORT).show();
    }
}
