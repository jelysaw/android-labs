package com.example.android.myorganizer;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.LinkedList;



public class TodayTaskAdapter extends BaseAdapter {
    LinkedList<TodayTask> list;
    LayoutInflater inflater;

    TodayTaskAdapter(Context context, LinkedList<TodayTask> list) {
        super();
        this.list = list;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public TodayTask getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void remove(int position) {
        list.remove(position);
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        View rowView = inflater.inflate(R.layout.list_view, parent, false);
        TextView taskName = (TextView) rowView.findViewById(R.id.taskName);
        TextView taskDescription = (TextView) rowView.findViewById(R.id.taskDescription);
        ImageButton button = (ImageButton) rowView.findViewById(R.id.deleteButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                AlertDialog.Builder adb = new AlertDialog.Builder(v.getContext());
                adb.setTitle("Delete?");
                adb.setMessage("Are you sure you want to delete ");
                adb.setNegativeButton("Cancel", null);
                adb.setPositiveButton("Ok", new AlertDialog.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    list.remove(position);
                    notifyDataSetChanged();
                    }
                });
                adb.show();

            }
        });
        TodayTask task = getItem(position);
        taskName.setText(task.getTaskName());
        taskDescription.setText(task.getTaskDescription());
        return rowView;
    }
}
