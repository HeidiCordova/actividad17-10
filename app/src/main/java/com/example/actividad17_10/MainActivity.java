package com.example.actividad17_10;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showFragmentButton = findViewById(R.id.btn_circle);
        showFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new instance of OvalButtonFragment
                OvalButtonFragment ovalButtonFragment = new OvalButtonFragment();

                // Get the FragmentManager and start a transaction
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                // Replace the current fragment with OvalButtonFragment
                fragmentTransaction.replace(R.id.fragment_container, ovalButtonFragment);
                fragmentTransaction.addToBackStack(null); // Optional: add to back stack
                fragmentTransaction.commit();
            }
        });
    }
}