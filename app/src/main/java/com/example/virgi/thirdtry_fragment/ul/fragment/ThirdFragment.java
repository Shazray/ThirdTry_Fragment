package com.example.virgi.thirdtry_fragment.ul.fragment;


import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.virgi.thirdtry_fragment.R;
import com.example.virgi.thirdtry_fragment.ul.Interfacciamoci;

public class ThirdFragment extends Fragment {

    Interfacciamoci comeVuoi;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.third_fragment, container, false);
    }



    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView testo = (TextView) view.findViewById(R.id.text);
        testo.setText("TERZO FRAGMENT");


        Button back = (Button) view.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comeVuoi.Back(2);
            }
        });

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            comeVuoi = (Interfacciamoci) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement interfacciamoci");
        }
    }
}
