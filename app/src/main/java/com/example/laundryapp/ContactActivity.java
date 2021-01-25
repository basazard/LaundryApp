package com.example.laundryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ContactActivity extends AppCompatActivity {
    Button button;
    EditText EdtNama, EdtEmail, EdtNomor, EdtPesan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        EdtNama = findViewById(R.id.edit_nama);
        EdtEmail = findViewById(R.id.edit_email);
        EdtNomor = findViewById(R.id.edit_nomor);
        EdtPesan = findViewById(R.id.edit_pesan);

        button = findViewById(R.id.btn_kirim);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pesan1 = EdtNama.getText().toString();
                String pesan2 = EdtEmail.getText().toString();
                String pesan3 = EdtNomor.getText().toString();
                String pesan4 = EdtPesan.getText().toString();

                String semuapesan = "Nama :" + pesan1 + "\n" + "Email :" + pesan2 + "\n" + "No HP : " + pesan3 + "\n" + "Pesan : " + pesan4;

                Intent kirimWA = new Intent(Intent.ACTION_SEND);
                kirimWA.setType("text/plain");
                kirimWA.putExtra(Intent.EXTRA_TEXT, semuapesan);
                kirimWA.putExtra("jid", "6281290832701" + "@s.whatsapp.net");
                kirimWA.setPackage("com.whatsapp");

                startActivity(kirimWA);
            }
        });
    }
}