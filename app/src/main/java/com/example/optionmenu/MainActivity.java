package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.home)
        {
            Toast.makeText(MainActivity.this,"Home page  Selected",Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId()==R.id.about)
        {
            Toast.makeText(MainActivity.this,"About me  Selected",Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId()==R.id.share)
        {
            Toast.makeText(MainActivity.this,"Share  Selected",Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId()==R.id.logout)
        {
            Toast.makeText(MainActivity.this,"Log out  Selected",Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
