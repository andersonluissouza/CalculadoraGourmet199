package com.example.comp8.calculadoragourmet199;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;

/**
 * Created by comp8 on 15/09/2016.
 */
public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button b_calc = (Button)findViewById(R.id.b_calc);
        Button b_cadastro = (Button)findViewById(R.id.b_cadastro);
        Button b_consultar = (Button)findViewById(R.id.b_consultar);
        GridLayout calculadora = (GridLayout) findViewById(R.id.calculadora);
        LinearLayout cadastro = (LinearLayout) findViewById(R.id.cadastro);

        b_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setClass(menu.this, calculadora.class);

                startActivity(intent);


            }
        });

        b_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setClass(menu.this, cadastro.class);

                startActivity(intent);

            }
        });
        b_consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setClass(menu.this, consulta.class);

                startActivity(intent);

            }
        });
    }
}
