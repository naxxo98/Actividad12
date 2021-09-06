package com.example.actividad12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {

    private Button btn_suma;
    private Button btn_resta;
    private Button btn_multp;
    private Button btn_divi;

    private TextView txt_respuesta;

    private EditText editn1;
    private EditText editn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);




        Context context = getApplicationContext();
        CharSequence text = "BIENVENIDO ";
        CharSequence text2 = " ESTAMOS EN LA CALCULADORA";
        int duracion = Toast.LENGTH_SHORT;

        Bundle show = getIntent().getExtras();
        String r1 = show.getString("dato01");

        Toast toast = Toast.makeText(context, text + r1 + text2, duracion);
        toast.show();

        txt_respuesta = findViewById(R.id.respuesta);



        editn1 = findViewById(R.id.n);
        editn2 = findViewById(R.id.n2);


        btn_suma = findViewById(R.id.btnsuma);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_respuesta.setText((suma(Integer.parseInt(editn1.getText().toString()),Integer.parseInt(editn2.getText().toString())))+"");

            }
        });


        btn_resta = findViewById(R.id.btnresta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_respuesta.setText((resta(Integer.parseInt(editn1.getText().toString()),Integer.parseInt(editn2.getText().toString())))+"");

            }
        });


        btn_multp = findViewById(R.id.btnmult);
        btn_multp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_respuesta.setText((multip(Integer.parseInt(editn1.getText().toString()),Integer.parseInt(editn2.getText().toString())))+"");

            }
        });


        btn_divi = findViewById(R.id.btndiv);
        btn_divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_respuesta.setText((divi(Integer.parseInt(editn1.getText().toString()),Integer.parseInt(editn2.getText().toString())))+"");

            }
        });
    }
    public int suma(int n1, int n2){
        return n1 + n2;
    }
    public int resta(int n1, int n2){
        return n1 - n2;
    }
    public int multip(int n1, int n2){
        return n1 * n2;
    }
    public int divi(int n1, int n2){
        return n1 / n2;
    }
}