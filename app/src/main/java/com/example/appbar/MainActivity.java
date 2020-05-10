package com.example.appbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_open_notes) {
            Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(intentNotes);
            return true;
        }

        if (id == R.id.checkbox) {
            Intent intentNotes = new Intent(MainActivity.this, CheckboxActivity.class);
            startActivity(intentNotes);
            return true;
        }

        if (id == R.id.spinner) {
            Intent intentNotes = new Intent(MainActivity.this, SpinnerActivity.class);
            startActivity(intentNotes);
            return true;
        }

        if (id == R.id.forms) {
            Intent intentNotes = new Intent(MainActivity.this, FormsActivity.class);
            startActivity(intentNotes);
            return true;
        }

        if (id == R.id.health) {
            Intent intentNotes = new Intent(MainActivity.this, UserActivity.class);
            startActivity(intentNotes);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
