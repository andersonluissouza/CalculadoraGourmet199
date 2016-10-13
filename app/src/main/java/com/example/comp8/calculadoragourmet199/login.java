package com.example.comp8.calculadoragourmet199;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by comp8 on 15/09/2016.
 */
public class login extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText ed_usuario = (EditText)findViewById(R.id.ed_usuario);
        final EditText ed_senha = (EditText)findViewById(R.id.ed_senha);
        Button button_login = (Button) findViewById(R.id.button_login);
        Button button_cancel = (Button) findViewById(R.id.button_cancel);
        LinearLayout menu = (LinearLayout) findViewById(R.id.menu);

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if (ed_usuario.getText().toString().equals("admin") && ed_senha.getText().toString().equals("admin")){
                        setContentView(R.layout.activity_menu);
                        Toast.makeText(login.this,"Usuário Logado",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(login.this,"Login Inválido",Toast.LENGTH_SHORT).show();
                    }



            }
        });


    }
}
