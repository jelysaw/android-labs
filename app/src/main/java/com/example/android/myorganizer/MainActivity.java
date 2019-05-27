package com.example.android.myorganizer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.ListView;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    LinkedList<TodayTask> list;
    TodayTaskAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new LinkedList<TodayTask>();
        listView = (ListView) findViewById(R.id.main_list);
        list.add(new TodayTask("Get up, Liza!", "Morning....", new GregorianCalendar(2019, 05, 26, 6, 55)));
        list.add(new TodayTask("Take care of your teeth", "Brushing", new GregorianCalendar(2019, 05, 26, 7, 0)));
        list.add(new TodayTask("Breakfast", "Eat breakfast", new GregorianCalendar(2019, 05, 26, 7, 10)));
        list.add(new TodayTask("Prepare for University", "Don't forget anything", new GregorianCalendar(2019, 05, 26, 7, 30)));
        list.add(new TodayTask("Shower", "You have to be clean", new GregorianCalendar(2019, 05, 26, 7, 45)));
        list.add(new TodayTask("NULP", "Study hard!", new GregorianCalendar(2019, 05, 26, 8, 0)));
        adapter = new TodayTaskAdapter(this, list);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu_app,menu);
        return true;
    }
}

