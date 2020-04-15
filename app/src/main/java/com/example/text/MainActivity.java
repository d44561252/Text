package com.example.text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View view) {
        EditText name =findViewById(R.id.ed_name);
        EditText height =findViewById(R.id.ed_height);
        EditText weight =findViewById(R.id.ed_weight);
        TextView show =findViewById(R.id.tv_show);
        TextView bmi =findViewById(R.id.tv_showbmi);
        String b =name.getText().toString();
        String h =height.getText().toString();
        ImageView aa = findViewById(R.id.ccv);
        String w =weight.getText().toString();
        double hw =Double.parseDouble(w)/(Double.parseDouble(h)/100.0*Double.parseDouble(h)/100.0);
        show.setText(b+"你好");
        DecimalFormat dd = new DecimalFormat("#.##");
        String msg = "";
        if(hw<18.5){
           msg = "過輕OAO";
           aa.setImageResource(R.drawable.a1);
        }
        else if(hw>25){
            msg ="過重QAQ" ;
            aa.setImageResource(R.drawable.a2);
        }
        else{
            msg ="正常>.0b";
            aa.setImageResource(R.drawable.a3);
        }
        Toast.makeText(this ,msg ,Toast.LENGTH_LONG).show();
        bmi.setText("你的bmi是"+dd.format(hw) +msg);
    }
}
