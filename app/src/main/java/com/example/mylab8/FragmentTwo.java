package com.example.mylab8;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;


public class FragmentTwo extends Fragment{



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_two, container, false);

        Button b1 = (Button) view.findViewById(R.id.submit);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getActivity(),"Successfully submitted...!!",Toast.LENGTH_LONG).show();
                Intent i=new Intent(getActivity(), Rating.class);
                startActivity(i);
            }
        });
        return view;
    }
}
