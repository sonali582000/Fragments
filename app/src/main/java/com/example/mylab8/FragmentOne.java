package com.example.mylab8;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.google.android.material.snackbar.Snackbar;

public class FragmentOne extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_one, container, false);
        //Inflate the layout for this fragment
        ImageButton b1 = (ImageButton) view.findViewById(R.id.b1);
        ImageButton b2 = (ImageButton) view.findViewById(R.id.b2);
        ImageButton b3 = (ImageButton) view.findViewById(R.id.b3);
        ImageButton b4 = (ImageButton) view.findViewById(R.id.b4);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Snackbar sb = Snackbar.make(view,"Location : Dharmapuri, Forest Colony, Tajganj, Agra, Uttar Pradesh 282001",Snackbar.LENGTH_LONG);
                sb.show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Snackbar sb = Snackbar.make(view,"Location : Noida Mor, Pandav Nagar, New Delhi, Delhi 110092",Snackbar.LENGTH_LONG);
                sb.show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Snackbar sb = Snackbar.make(view,"Location : Golden Temple Rd, Atta Mandi, Katra Ahluwalia, Amritsar, Punjab 143006",Snackbar.LENGTH_LONG);
                sb.show();
            }
        });

        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Snackbar sb = Snackbar.make(view,"Location : Hawa Mahal Rd, Badi Choupad, J.D.A. Market, Pink City, Jaipur, Rajasthan 302002",Snackbar.LENGTH_LONG);
                sb.show();
            }
        });

        return view;
    }
}