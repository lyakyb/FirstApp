package com.example.lyaky.firstapp;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Young Bin Kim on 2015-03-10.
 */
public class TaskListActivity extends ListActivity{

    TextView selection;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        setListAdapter(new ArrayAdapter<>(this, R.layout.row, R.id.label, Tasks));
        selection=(TextView)findViewById(R.id.selection);
    }

    public void onListItemClick(ListView parent, View v, int position, long id){
        selection.setText(Tasks[position]);
    }

    static final String[] Tasks = new String[]{
            "Assignment", "Appointment" , "FUCK", "GOD DAMN IT"
    };
}
