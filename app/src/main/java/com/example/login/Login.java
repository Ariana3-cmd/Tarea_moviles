package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private EditText txtuser, txtpass;
    private Button btnlogin;
    static final String user="admin@gmail.com";
    static final String pass="3ntr4r";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtuser =  findViewById(R.id.edt);
        txtpass= findViewById(R.id.edtpass);
        btnlogin= findViewById(R.id.btnlogin);
        /*btnlogin.setOnClickListener();*/
    }
    public void login(View view){
        String username =txtuser.getText().toString().trim();
        String password =txtpass.getText().toString().trim();

        if (username.equals(" ") || password.equals(" ")){
            Toast.makeText(getApplicationContext(),"Ingresar Datos: ", Toast.LENGTH_LONG).show();
        }else {
            if (username.equals(user) && password.equals(pass)){
                Toast.makeText(getApplicationContext(),"Bienvenido", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("pulpi", user);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Datos incorrectos", Toast.LENGTH_LONG).show();
            }
        }
    }
}