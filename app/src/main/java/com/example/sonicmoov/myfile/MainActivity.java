package com.example.sonicmoov.myfile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    File dir = new File("/");
    final File[] filelist = dir.listFiles();

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textSetting = (TextView)findViewById(R.id.textView);
        textSetting.setText("Myflie");

        lv = (ListView) findViewById(R.id.listView1);
        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_expandable_list_item_1, filelist);
        lv.setAdapter(adapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(filelist[position].isDirectory()){
                    Toast.makeText(getApplicationContext(), filelist[position].getName() + " directory",
                            Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(MainActivity.this, SubActivity.class);
                    startActivity(intent);

                }
                else if(filelist[position].isFile()){
                    Toast.makeText(getApplicationContext(), filelist[position].getName() + " file",
                            Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(MainActivity.this, txtActivity.class);
                    intent.putExtra("NAME",filelist[position].getName());
                    startActivity(intent);


                }
                else {
                    Toast.makeText(getApplicationContext(), "not directory or file",
                            Toast.LENGTH_LONG).show();
                }



    }
});

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


    private class FileSearch {
    }
}
