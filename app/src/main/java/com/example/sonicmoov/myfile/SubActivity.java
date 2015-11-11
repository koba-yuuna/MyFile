package com.example.sonicmoov.myfile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class SubActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        TextView textSetting = (TextView)findViewById(R.id.textView2);
        textSetting.setText("Directory");



    }
}

/*
    private class Person {

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    private static class ViewHolder {
        TextView tvName;
        TextView tvAge;
    }


    private class ListPersonAdapter extends BaseAdapter {
        private Context context;

        private List<Person> list;

        public ListPersonAdapter(Context context) {

            super();

            this.context = context;

            list = new ArrayList<Person>();

            list.add(new Person("本田 圭佑", 24));
            list.add(new Person("遠藤 保仁", 30));
            list.add(new Person("松井 大輔", 29));
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return list.get(position);

        }
        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            Person person = (Person) getItem(position);

            ViewHolder holder;

            if (convertView == null) {
                LinearLayout layout = new LinearLayout(context);
                layout.setOrientation(LinearLayout.VERTICAL);
                convertView = layout;

                holder = new ViewHolder();
                holder.tvName = new TextView(context);
                holder.tvAge = new TextView(context);
                layout.addView(holder.tvName);
                layout.addView(holder.tvAge);

                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }
            holder.tvName.setText(person.getName());
            holder.tvAge.setText(String.format("%d 才", person.getAge()));

            return convertView;

        }
    }

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        ListView lv = new ListView(this);
        setContentView(lv);

        lv.setAdapter(new ListPersonAdapter(this));


    }
 */