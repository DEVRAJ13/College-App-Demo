package com.ghec.shekharmandhotra.ghec;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Shekhar Mandhotra on 02-04-2016.
 */
public class Menu extends ListActivity {
    String Departments[]={"ComputerScience","Mechanical","InformationTechnology","Civil","Electronics","Electrical"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[]Departments= getResources().getStringArray(R.array.Departments);
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.label, Departments));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String cheese = Departments[position];
        try {
            Class ourClass = Class.forName("com.ghec.shekharmandhotra.ghec." +cheese);
            Intent ourIntent = new Intent(Menu.this, ourClass);
            startActivity(ourIntent);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }


}
