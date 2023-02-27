package com.example.personal.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {

        EditText dollar = (EditText) findViewById(R.id.dollar);
        Double dollarAmount = Double.parseDouble(dollar.getText().toString());
        Double takaAmount = dollarAmount * 84.17;
//        Log.i("dollar",dollarAmount.toString());
        Toast.makeText(getApplicationContext(),"৳" + takaAmount.toString(),Toast.LENGTH_LONG).show();
    }

    public void convert1(View view) {

        EditText euro = (EditText) findViewById(R.id.euro);
        Double euroAmount = Double.parseDouble(euro.getText().toString());
        Double takaAmount = euroAmount * 98.12;
//        Log.i("dollar",dollarAmount.toString());
        Toast.makeText(getApplicationContext(),"৳" + takaAmount.toString(),Toast.LENGTH_LONG).show();
    }

    public void convert2(View view) {

        EditText pound = (EditText) findViewById(R.id.pound);
        Double poundAmount = Double.parseDouble(pound.getText().toString());
        Double takaAmount = poundAmount * 111.37;
//        Log.i("dollar",dollarAmount.toString());
        Toast.makeText(getApplicationContext(),"৳" + takaAmount.toString(),Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
    }


}
