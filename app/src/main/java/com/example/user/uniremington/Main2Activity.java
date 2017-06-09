package com.example.user.uniremington;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner pagina_programas , plataformas, ubicacion;

    ArrayAdapter<String> adapter_pagina_programas;
    ArrayAdapter<String> adapter_plataformas;
    ArrayAdapter<String> adapter_ubicacion;

    String [] lista_pagina_programas = new String[] {"Programas","Especializacion" , "Pregrado","tecnologias"};
    String [] lista_plataformas = new String[] { "Plataformas","Q10" , "Moodle" , "correo estudiantil"};
    String [] lista_ubicacion = new String[] {"Ubicacion","Sede Cable" , "Sede Centro"};
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        pagina_programas = (Spinner) findViewById(R.id.spinner2);
        adapter_pagina_programas = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista_pagina_programas);
        pagina_programas.setAdapter(adapter_pagina_programas);
        pagina_programas.setOnItemSelectedListener(this);

        plataformas = (Spinner) findViewById(R.id.spinner3);
        adapter_plataformas = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista_plataformas);
        plataformas.setAdapter(adapter_plataformas);
        plataformas.setOnItemSelectedListener(this);

        ubicacion = (Spinner) findViewById(R.id.spinner4);
        adapter_ubicacion = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista_ubicacion);
        ubicacion.setAdapter(adapter_ubicacion);
        ubicacion.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        switch (parent.getId()){
            case R.id.spinner2:
                int seleccionprogramas = pagina_programas.getSelectedItemPosition();
                if (seleccionprogramas==1)
                {
                    this.intent = new Intent(this,Main8Activity.class);
                    startActivity(intent);
                }
                if (seleccionprogramas==2)
                {
                    this.intent = new Intent(this,Main9Activity.class);
                    startActivity(intent);
                }
                if (seleccionprogramas==3)
                {
                    this.intent = new Intent(this,Main10Activity.class);
                    startActivity(intent);
                }


        }

        switch (parent.getId()){
            case R.id.spinner3:
                int seleccionplataformas = plataformas.getSelectedItemPosition();
                if (seleccionplataformas==1)
                {
                    this.intent = new Intent(this,Main3Activity.class);
                    startActivity(intent);

                }
                if (seleccionplataformas==2)
                {
                    this.intent = new Intent(this,Main4Activity.class);
                    startActivity(intent);
                }
                if (seleccionplataformas==3)
                {
                    this.intent = new Intent(this,Main5Activity.class);
                    startActivity(intent);
                }
        }

        switch (parent.getId()){
            case R.id.spinner4:
                int seleccionubicacion = ubicacion.getSelectedItemPosition();
                if (seleccionubicacion==1)
                {
                    this.intent = new Intent(this,Main6Activity.class);
                    startActivity(intent);
                }
                if (seleccionubicacion==2)
                {
                    this.intent = new Intent(this,Main7Activity.class);
                    startActivity(intent);
                }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}
