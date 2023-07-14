package com.example.navitgation;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText editUser;
    private EditText editPassword;

    private Button buttonLogin;
    private Button buttonCadastro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        editUser = findViewById(R.id.editUser);
        editPassword = findViewById(R.id.editPassword);

        iniciarComponentes();
        iniciarComponentes2();
        buttonCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent2 = new Intent(MainActivity.this, Cadastro.class);
                startActivity(intent2);
            }
        });
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginRealizado.class);
                startActivity(intent);


            }
        });

    }

    private void iniciarComponentes(){
        buttonLogin=findViewById(R.id.buttonLogin);
    }
    private void iniciarComponentes2(){
        View buttonCadastro = findViewById(R.id.buttonCadastro);
    }

    public void loginUser(View view){
        String user = editUser.getText().toString();
        String password = editPassword.getText().toString();

        if(user.equals("Leonardo")  && password.equals("123") ){
            System.out.println("passou aqui");
        } else {
            System.out.println("erro");
            System.out.println(user);
            System.out.println(password);
        }
    }
}