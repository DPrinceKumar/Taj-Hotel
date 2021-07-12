package com.project.taj_hotel.Fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.project.taj_hotel.Login_signup.VerificationOtpFragment;
import com.project.taj_hotel.R;

public class HomeFragment extends Fragment {
View view;
Button button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_home,container,false);
        button=(Button)view.findViewById(R.id.home_btn);

        button.setOnClickListener(new View.OnClickListener() {
            int flag=0;

            @Override
            public void onClick(View v) {
                flag=1;
                CartFragment cf=new CartFragment();
                if(flag==1){

                    FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment, new CartFragment());
                    fragmentTransaction.commit();
                }
//                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment,cf).commit();

            }
        });

        return view;
    }
}