package com.example.sonicmoov.myfile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import java.io.FileReader;
import java.io.IOException;

public class txtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_txt);

        Intent intent = getIntent();
        String position= intent.getStringExtra("NAME");

        EditText editText = (EditText) findViewById(R.id.editText);
        TextView textSetting = (TextView)findViewById(R.id.textView3);


        try {
            FileReader stream = new FileReader(position);
            char buffer[]=new char[1000];
            stream.read(buffer);
            editText.setText(new String(buffer).trim());
            stream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

            textSetting.setText(position);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_txt, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
