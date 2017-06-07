package com.example.user.uniremington;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText password;
    Button ingresar;
    private CheckBox opcionMostrar;
    private EditText campoContrasena;
    private RadioGroup Radio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opcionMostrar = (CheckBox) findViewById(R.id.Email);
        campoContrasena = (EditText) findViewById(R.id.email);
        ingresar = (Button) findViewById(R.id.ingresar);
        Radio = (RadioGroup) findViewById(R.id.Radio);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = ((EditText) findViewById(R.id.email)).getText().toString();
                String password = ((EditText) findViewById(R.id.password)).getText().toString();
                if (email.equals("jriosg@uniremington") && password.equals("1053790188")) {
                    Intent Nuevoform = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(Nuevoform);

                    Toast.makeText(ingresar.getContext(), "bienvenido", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ingresar.getContext(), "usuario y/o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }


                Radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                        Intent intent = new Intent(getApplicationContext(), MainActivityvalidacion.class);
                        startActivity(intent);
                    }
                });
            }

            public void mostrarContraseña(View v) {
                // Salvar cursor
                int cursor = campoContrasena.getSelectionEnd();

                if (opcionMostrar.isChecked()) {
                    campoContrasena.setInputType(InputType.TYPE_CLASS_TEXT
                            | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                } else {
                    campoContrasena.setInputType(InputType.TYPE_CLASS_TEXT
                            | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }

                // Restaurar cursor
                campoContrasena.setSelection(cursor);
            }
        });

    }
}


