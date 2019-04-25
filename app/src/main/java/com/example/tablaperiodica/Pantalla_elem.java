package com.example.tablaperiodica;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class Pantalla_elem extends AppCompatActivity {
    String nombre;
    String periodo;
    String grupo;
    String bloque;
    String paises;
    String apps;
    Integer ruta;
    TextView txt_nom;
    TextView txt_per;
    TextView txt_gru;
    TextView txt_blo;
    TextView txt_pai;
    TextView txt_app;
    ImageView icono;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_elem);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ///
        nombre=getIntent().getStringExtra("nombre");
        txt_nom=(TextView)findViewById(R.id.txt_nombre);
        txt_nom.setText(nombre);
        icono=(ImageView)findViewById(R.id.iv_simbolo);
        ruta=getIntent().getIntExtra("ruta",0);
        icono.setImageResource(ruta);
        ///
        periodo=getIntent().getStringExtra("periodo");
        txt_per=(TextView)findViewById(R.id.txt_periodo);
        txt_per.setText(periodo);
        ///
        grupo=getIntent().getStringExtra("grupo");
        txt_gru=(TextView)findViewById(R.id.txt_grupo);
        txt_gru.setText(grupo);
        //////
        bloque=getIntent().getStringExtra("bloque");
        txt_blo=(TextView)findViewById(R.id.txt_bloque);
        txt_blo.setText(bloque);
        //////
        paises=getIntent().getStringExtra("paises");
        txt_pai=(TextView)findViewById(R.id.txt_paises);
        txt_pai.setText(paises);
        //////
        apps=getIntent().getStringExtra("apps");
        txt_app=(TextView)findViewById(R.id.txt_apps);
        txt_app.setText(apps);

    }
}
