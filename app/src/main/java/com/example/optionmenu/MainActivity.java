package com.example.optionmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menusatu) {
            startActivity(new Intent(this, MenusatuActivity.class));
        } else if (item.getItemId() == R.id.menudua) {
            startActivity(new Intent(this, MenuduaActivity.class));
        } else  if (item.getItemId() == R.id.menutiga) {
            startActivity(new Intent(this, MenutigaActivity.class));
        }
        return  true;
    }

}
