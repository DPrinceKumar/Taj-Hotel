package com.project.taj_hotel.Login_signup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import com.project.taj_hotel.Fragment.CartFragment;
import com.project.taj_hotel.Fragment.HomeFragment;
import com.project.taj_hotel.Fragment.MoreFragment;
import com.project.taj_hotel.R;

public class LoginSignup extends AppCompatActivity {
    TextView loginbtn_frag,signupbtn_frag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_signup);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.lsFragment,new LoginWithPhoneFragment());
        fragmentTransaction.commit();

        getSupportActionBar().hide();

        loginbtn_frag=findViewById(R.id.loginbtn_frag);
        signupbtn_frag=findViewById(R.id.signupbtn_frag);

        signupbtn_frag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.lsFragment,new SignupFragment());
                fragmentTransaction.commit();

            }
        });
        loginbtn_frag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.lsFragment,new LoginWithPhoneFragment());
                fragmentTransaction.commit();

            }
        });
        bottomNavButton();
    }
    public void bottomNavButton() {
        getWindow().setNavigationBarColor(getResources().getColor(R.color.gray));
    }
}