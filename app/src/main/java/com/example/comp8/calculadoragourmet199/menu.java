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
        GridLayout calculadora = (GridLayout) findViewById(R.id.calculadora);
        LinearLayout cadastro = (LinearLayout) findViewById(R.id.cadastro);

        b_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               //setContentView(R.layout.activity_calculadora);
                Intent intent = new Intent(menu.this, calculadora.class);
                startActivity(intent);
                setContentView(v.findViewById(R.id.calculadora));
            }
        });

        b_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setContentView(R.layout.activity_cadastro);
            }
        });
    }
}
