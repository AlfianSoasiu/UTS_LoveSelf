package com.example.uts_loveself;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
   BottomNavigationView bottomNavigationView;
    private BottomNavigationView.OnNavigationItemSelectedListener navigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected( MenuItem item) {
            Fragment f = null;
            switch (item.getItemId()){
                case R.id.menu_home:
                    f = new FragmentHome();
                    break;
                case R.id.menu_daily:
                    f = new FragmentDaily();
                    break;
                case R.id.menu_galeri:
                    f = new FragmentGaleri();
                    break;
                case R.id.menu_musik:
                    f = new FragmentMusik();
                    break;
                case R.id.menu_profile:
                    f = new FragmentProfile();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,f).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottom_navigation_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);
    }

    public void friendslist (View view){
        Intent intent = new Intent(this,FriendsList.class);
        startActivity(intent);
    }

    public void video (View view){
        Intent intent = new Intent(this,VideoActivity.class);
        startActivity(intent);
    }

    public void findme (View view){
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }
}