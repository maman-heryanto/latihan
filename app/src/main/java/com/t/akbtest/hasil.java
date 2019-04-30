package com.t.akbtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class hasil extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        Bundle b = getIntent().getExtras();

        //membuat obyek dari widget textview
        TextView nama = (TextView) findViewById(R.id.txtNama);
        TextView nim = (TextView) findViewById(R.id.txtNim);

        //menset nilai dari widget textview
        nama.setText(b.getCharSequence("nama"));
        nim.setText(b.getCharSequence("nim"));

    }
}
