package com.mohmedhassan.otleb;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText Ed_Email,Ed_Password;
    private CheckBox checkBoxShowPassword;
    TextView Tv_Register,Tv_forgetPassword;
    Button Btn_Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginActivity.this.setTitle(R.string.login);

        Tv_Register = findViewById(R.id.tv_login_register);
        Tv_forgetPassword = findViewById(R.id.tv_forgetPassword);
        Btn_Login= findViewById(R.id.btnLogin_login);
        Ed_Email= findViewById(R.id.email_login);
        Ed_Password= findViewById(R.id.password_login);
        checkBoxShowPassword= findViewById(R.id.checkboxPassword_Login);

        checkBoxShowPassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // checkbox status is changed from uncheck to checked.
                if (!isChecked) {
                    // show password
                    Ed_Password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    // hide password
                    Ed_Password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });

        Tv_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);

            }
        });
        Tv_forgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginActivity.this,ForgetPasswordActivity.class);
                startActivity(intent);

            }
        });

    }
}
