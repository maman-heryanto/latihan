package com.t.akbtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText nama;
    EditText nim;
    Button button;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menampilkan semua tampilan id
        findAllViewsId();

        button.setOnClickListener(this);
    }

    private void findAllViewsId() {
        button = (Button) findViewById(R.id.button);
        nama = (EditText) findViewById(R.id.edtNama);
        nim = (EditText) findViewById(R.id.edtNim);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(getApplicationContext(), hasil.class);

        //Membuat obyek bundle
        Bundle b = new Bundle();

        //Menyisipkan tipe data String ke dalam obyek bundle
        b.putString("nama", nama.getText().toString());
        b.putString("nim", nim.getText().toString());


        //Menambahkan bundle intent
        intent.putExtras(b);

        //memulai Activity kedua
        startActivity(intent);
    }

}
