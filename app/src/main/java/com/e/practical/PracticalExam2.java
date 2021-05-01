package com.e.practical;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PracticalExam2 extends AppCompatActivity
{
        ListView listView;
        String color[]={"Colors"};
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.practical_exam2);
            listView=(ListView)findViewById(R.id.listView);
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,color);
            listView.setAdapter(adapter);
            // Register the ListView  for Context menu
            registerForContextMenu(listView);
        }
        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
        {
            super.onCreateContextMenu(menu, v, menuInfo);
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.main_menu, menu);
            menu.setHeaderTitle("Select The Color");
        }
        @Override
        public boolean onContextItemSelected(MenuItem item){
            if(item.getItemId()==R.id.red){
                getWindow().getDecorView().setBackgroundColor(Color.rgb(255,0,0));
            }
            else if(item.getItemId()==R.id.blue){
                getWindow().getDecorView().setBackgroundColor(Color.rgb(0,0,255));
            }else if(item.getItemId()==R.id.green){
                getWindow().getDecorView().setBackgroundColor(Color.rgb(0,255,0));
            }
            return true;
        }
}