package com.project.taj_hotel;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.project.taj_hotel.Fragment.CartFragment;
import com.project.taj_hotel.Fragment.HomeFragment;
import com.project.taj_hotel.Fragment.MoreFragment;

import org.jetbrains.annotations.NotNull;


public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNav);

        fragmentTransaction.replace(R.id.fragment, new HomeFragment());
        fragmentTransaction.commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

                int id=item.getItemId();

                switch (id) {
                    case R.id.navigation_home:
                        fragmentTransaction.replace(R.id.fragment, new HomeFragment());
                        break;
                    case R.id.navigation_cart:
                        fragmentTransaction.replace(R.id.fragment, new CartFragment());
                        break;
                    case R.id.navigation_more:
                        fragmentTransaction.replace(R.id.fragment, new MoreFragment());
                        break;
                }
                fragmentTransaction.commit();
                return true;
            }
        });

        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.custom_app_bar);
        getSupportActionBar().setElevation(20);
        bottomNavButton();

        View view = getSupportActionBar().getCustomView();
    }

    public void bottomNavButton() {
        getWindow().setNavigationBarColor(getResources().getColor(R.color.gray));
    }
}