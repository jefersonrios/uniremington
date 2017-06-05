package com.example.user.uniremington;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText password;
    Button ingresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ingresar = (Button) findViewById(R.id.ingresar);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = ((EditText) findViewById(R.id.email)).getText().toString();
                String password = ((EditText) findViewById(R.id.password)).getText().toString();
                if (email.equals("jriosg@uniremington") && password.equals("1053790188"))
                {
                    Intent Nuevoform = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(Nuevoform);

                    Toast.makeText(ingresar.getContext(),"bienvenido",Toast.LENGTH_SHORT).show();
                }

                else {
                    Toast.makeText(ingresar.getContext(),"usuario y/o contraseña incorrectos",Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}