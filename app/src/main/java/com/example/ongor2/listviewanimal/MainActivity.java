package com.example.ongor2.listviewanimal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    //String [ ] dataA;
    private List<Data> datas = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Data item = new Data("Cat","แมว",R.mipmap.cat);
        datas.add(item);

        datas.add(new Data("Dog","หมา",R.mipmap.dog));
        datas.add(new Data("Elephat","ช้าง",R.mipmap.ele));
        datas.add(new Data("Pig","หมู",R.mipmap.pig));
        datas.add(new Data("bird","นก",R.mipmap.bird));
        datas.add(new Data("Fish","ปลา",R.mipmap.fish));

        MyAdapter adapter = new MyAdapter(this,datas);

        ListView lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);

//        dataA = new String[]{
//                "Cat",
//                "Dog",
//                "Elephant",
//                "Pig",
//                "Bird",
//                "Fish"
//        };
//        ListAdapter adapter = new ArrayAdapter<String>( this,android.R.layout.simple_list_item_1, dataA);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,"You Click" + String.valueOf(position)+ " " + dataA[position],Toast.LENGTH_SHORT).show();
    }
}
