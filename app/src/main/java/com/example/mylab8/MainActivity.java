package com.example.mylab8;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
ImageButton firstFragment, secondFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectFrag(View view) {


        Fragment fr;

        if(view == findViewById(R.id.imageButton)) {
            fr = new FragmentOne();
        }
        else {
            fr = new FragmentTwo();
        }

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_place, fr);
        fragmentTransaction.commit();
    }


    public void showmsg(View view) {
        View v = findViewById(R.id.imageButton1);
        String message = "Add to your cart..!!";
        int duration = Snackbar.LENGTH_SHORT;
        showSnackbar(view, message, duration);
    }
    public void showSnackbar(View view, String message, int duration)
    {
        Snackbar.make(view, message, duration).show();
    }
}