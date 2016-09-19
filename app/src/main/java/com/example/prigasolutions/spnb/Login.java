package com.example.prigasolutions.spnb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener{

    TextView register,forgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        register= (TextView) findViewById(R.id.tv_reg);
        register.setOnClickListener(this);
        forgotPassword= (TextView) findViewById(R.id.log_forgot_pass);
        forgotPassword.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int item=view.getId();
        switch(item){
            case R.id.tv_reg:
                startActivity(new Intent(this,Register.class));
                break;
            case R.id.log_forgot_pass:
                startActivity(new Intent(this,ForgotPassword.class));
                break;
        }
    }
}
