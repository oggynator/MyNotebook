package com.example.mynotebook;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    Random random = new Random();
    EditText editText;
    String text;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=  findViewById(R.id.textToNewActivity);

    }

    public void changeColor (View view){
        getWindow().getDecorView().setBackgroundColor(Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256)));

    }
    public void sendText(View view){

        text = editText.getText().toString();

        Log.i("all", "saved:" + text);
        Intent intent = new Intent(this, Page2Activity.class);
        intent.putExtra("SENDED_DATA", text);
        startActivity(intent);

        Toast.makeText(this, "Comment saved", Toast.LENGTH_LONG).show();
    }

}
