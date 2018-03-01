package com.example.virgi.thirdtry_fragment.ul.activity;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.virgi.thirdtry_fragment.R;
import com.example.virgi.thirdtry_fragment.ul.Interfacciamoci;
import com.example.virgi.thirdtry_fragment.ul.fragment.FirstFragment;
import com.example.virgi.thirdtry_fragment.ul.fragment.SecondFragment;
import com.example.virgi.thirdtry_fragment.ul.fragment.ThirdFragment;

public class MainActivity extends AppCompatActivity implements Interfacciamoci{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FirstFragment firstFragment = new FirstFragment();
        fragmentTransaction.add(R.id.container, firstFragment).addToBackStack(null).commit();


    }

    @Override
    public void Forward(int position) {
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        if(position == 0)
        {
            SecondFragment secondFragment = new SecondFragment();
            fragmentTransaction.replace(R.id.container, secondFragment).addToBackStack(null).commit();

        }

        if(position == 1)
        {
            ThirdFragment thirdFragment = new ThirdFragment();
            fragmentTransaction.replace(R.id.container, thirdFragment).addToBackStack(null).commit();
        }

    }

    @Override
    public void Back(int position) {

        FragmentManager fragmentManager= getFragmentManager();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();

        if(position == 2)
        {
            fragmentManager.popBackStack();
            /*SecondFragment secondFragment = new SecondFragment();
            fragmentTransaction.replace(R.id.container, secondFragment).addToBackStack(null).commit();*/
        }

        if(position == 1)
        {
            //pop dallo stack

            fragmentManager.popBackStack();

            /*FirstFragment firstFragment = new FirstFragment();
            fragmentTransaction.replace(R.id.container, firstFragment).addToBackStack(null).commit();*/
        }

    }
}
