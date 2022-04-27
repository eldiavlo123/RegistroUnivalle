package com.example.registrounivalle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView etNombre, etApellido, etEmail, etCelular, etCodigo;
    private Button btnRegistrar;
    private Switch swEstudiante;
    private String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistas();
        MostrarDatos();
        btnRegistrar.setOnClickListener(btnRegistrar -> MostrarDatos());


    }
    private void inicializarVistas()
    {
        etNombre = findViewById(R.id.etNombre);
        etApellido = findViewById(R.id.etApellido);
        etEmail = findViewById(R.id.etEmail);
        etCelular = findViewById(R.id.etCelular);
        etCodigo = findViewById(R.id.etCodigo);
        swEstudiante = findViewById(R.id.swEstudiante);
        btnRegistrar = findViewById(R.id.btnRegistrar);

    }
    private void MostrarDatos()
    {
        Nombre = etNombre.getText(etNombre);
        Apellido = etNombre.getText(etNombre.);
        String mensaje = "PEPITO" + Nombre +"PEREZ"+Apellido;
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
    }
}