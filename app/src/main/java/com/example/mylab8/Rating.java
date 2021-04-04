package com.example.mylab8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class Rating extends AppCompatActivity {
    RatingBar rb1;
    TextView textView1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
        rb1 = findViewById(R.id.rb1);
        textView1=findViewById(R.id.textView);
        button=findViewById(R.id.button1);
    }

    public void mailus(View view) {
        Intent j=new Intent(Intent.ACTION_SEND);
        j.setData(Uri.parse("email"));
        String[] s={"sonalirathod724@gmail.com"};
        j.putExtra(Intent.EXTRA_EMAIL,s);
        j.putExtra(Intent.EXTRA_SUBJECT,"Complaint register");
        j.putExtra(Intent.EXTRA_TEXT,"");
        j.setType("message/rfc822");
        Intent chooser = Intent.createChooser(j,"Mail Us Via:");
        startActivity(chooser);
    }

    public void starts(View view) {
        String s=String.valueOf(rb1.getRating());
        Toast.makeText(this,s+" Star ",Toast.LENGTH_SHORT).show();
        View v = findViewById(R.id.button1);
        String message = "Your feedback is collected .. Thank you ";
        int duration = Snackbar.LENGTH_SHORT;

        showSnackbar(view, message, duration);
    }

    public void showSnackbar(View view, String message, int duration)
    {
        Snackbar.make(view, message, duration).show();
    }
}