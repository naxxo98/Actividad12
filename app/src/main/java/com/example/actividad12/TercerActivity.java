package com.example.actividad12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class TercerActivity extends AppCompatActivity {

    TextView recibe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);
        showme();
        Context context = getApplicationContext();
        CharSequence text = "BUENAS ESTA ES LA PESTAÑA DEL SALUDO (✿◠‿◠)";
        int duracion = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duracion);
        toast.show();
    }

    private void showme() {
        Bundle show = getIntent().getExtras();
        String r1 = show.getString("dato01");
        recibe = (TextView) findViewById(R.id.receptor1);
        recibe.setText("Buenos dias "+r1+" gracias por entrar a este apartado");
    }
}