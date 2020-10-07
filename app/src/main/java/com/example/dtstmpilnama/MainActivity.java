package com.example.dtstmpilnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText TxtNama;
    TextView Hsl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TxtNama=(EditText)findViewById(R.id.txtNama);
        Hsl=(TextView)findViewById(R.id.inptNama);

    }

    public void TampilNm(View view) {
        Hsl.setText("Nama anda : "+TxtNama.getText());
    }
}