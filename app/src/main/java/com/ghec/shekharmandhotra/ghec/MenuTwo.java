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
public class MenuTwo extends ListActivity {
    String Classes[]={"Ece","Me"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[]Classes= getResources().getStringArray(R.array.Classes);
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.label, Classes));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String cheese = Classes[position];
        try {
            Class ourClass = Class.forName("com.ghec.shekharmandhotra.ghec." +cheese);
            Intent ourIntent = new Intent(MenuTwo.this, ourClass);
            startActivity(ourIntent);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }



}
