package com.example.calculadorafinal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

import org.mariuszgromada.math.mxparser.Expression;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;
import android.content.DialogInterface;
import android.content.SharedPreferences;


public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private TextView textView3;
    private ListView lstHistorial;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView3 = (TextView) findViewById(R.id.textView3);
        lstHistorial =(ListView)findViewById(R.id.lstHistorial);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_tools, R.id.nav_share, R.id.nav_send)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void ceroo(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'0';
        textView3.setText(valor2);
    }
    public void uno(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'1';
        textView3.setText(valor2);
    }
    public void dos(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'2';
        textView3.setText(valor2);
    }
    public void tres(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'3';
        textView3.setText(valor2);
    }
    public void cuatro(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'4';
        textView3.setText(valor2);
    }
    public void cinco(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'5';
        textView3.setText(valor2);
    }
    public void seis(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'6';
        textView3.setText(valor2);
    }
    public void siete(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'7';
        textView3.setText(valor2);
    }
    public void ocho(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'8';
        textView3.setText(valor2);
    }
    public void nueve(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'9';
        textView3.setText(valor2);
    }
    public void sumar(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'+';
        textView3.setText(valor2);
    }
    public void restar(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'-';
        textView3.setText(valor2);
    }
    public void multiplicar(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'*';
        textView3.setText(valor2);
    }
    public void dividir(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'/';
        textView3.setText(valor2);
    }
    public void acercaDe(View view){
    }
    public void punto(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'.';
        textView3.setText(valor2);
    }
    public void del(View view){
        int valor1=textView3.length();
        String cadena=textView3.getText().toString().substring(0,valor1-1);
        textView3.setText(cadena);
    }
    public void clear(View view){
        textView3.setText("");
    }
    public void salir(View view){
        System.exit(0);
    }
    public void seno(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ "sen";
        textView3.setText(valor2);
    }
    public void coseno(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ "cos";
        textView3.setText(valor2);
    }
    public void tangente(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ "tan";
        textView3.setText(valor2);
    }
    public void ln(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ "ln";
        textView3.setText(valor2);
    }
    public void log(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ "log";
        textView3.setText(valor2);
    }
    public void cuadrado(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ "^2";
        textView3.setText(valor2);
    }
    public void cubo(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ "^3";
        textView3.setText(valor2);
    }
    public void factorial(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ "!";
        textView3.setText(valor2);
    }
    public void numeroPi(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ "Pi";
        textView3.setText(valor2);
    }
    public void par_Izq(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ "(";
        textView3.setText(valor2);
    }
    public void par_Der(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ ")";
        textView3.setText(valor2);
    }
    public void raiz(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ "Raiz";
        textView3.setText(valor2);
    }
    public void igual(View view){
        String expresion = textView3.getText().toString();
        Expression e = new Expression(expresion);
        String resultado = String.valueOf(e.calculate());
        textView3.setText(resultado);
    }

    private void guardarHistorial(){
        SharedPreferences historia=getSharedPreferences("history", Context.MODE_PRIVATE);
        String linea=textView3.getText().toString();

        SharedPreferences.Editor editor=historia.edit();
        editor.putString("cadena_calc",linea);

        editor.commit();
    }

    private void cargarHistorial(){
        SharedPreferences historial=getSharedPreferences("history",Context.MODE_PRIVATE);

        String texto=historial.getString("texto","No existe info todavía");

    }


}
