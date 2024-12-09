package com.example.widokprofil;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText imie;
    EditText nazwisko;
    EditText login;
    TextView email;
    TextView ImieWypisz;
    TextView NazwiskoWypisz;
    TextView EmailWypisz;
    TextView LoginWypisz;
    

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imie = findViewById(R.id.editTextImie);
        nazwisko = findViewById(R.id.editTextNazwisko);
        login = findViewById(R.id.editTextLogin);
        email = findViewById(R.id.editTextEmail);
        ImieWypisz = findViewById(R.id.textViewEdycjaImie);
        NazwiskoWypisz = findViewById(R.id.textViewEdycjaNazwisko);
        EmailWypisz = findViewById(R.id.textViewEdycjaEmail);
        LoginWypisz = findViewById(R.id.textViewEdycjaLogin);
        findViewById(R.id.ButtonEdytuj).setOnClickListener(this::onClick);
        findViewById(R.id.ButtonWyswietl).setOnClickListener(this::onClick);

        findViewById(R.id.ButtonWyswietl).setOnClickListener(e -> {
            imie.setEnabled(false);
            nazwisko.setEnabled(false);
            login.setEnabled(false);
            email.setEnabled(false);
            ImieWypisz.setText(imie.getText());
            NazwiskoWypisz.setText(nazwisko.getText());
            LoginWypisz.setText(login.getText());
            EmailWypisz.setText(email.getText());
        });
    }
    private void onClick(View e) {
        imie.setEnabled(true);
        nazwisko.setEnabled(true);
        login.setEnabled(true);
        email.setEnabled(true);

    }
}