package com.mohmedhassan.otleb;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class RegisterActivity extends AppCompatActivity {

    Context context;
    Button Btn_Register;
    TextView Tv_Regiseter_Login;
    EditText Ed_birthDay_register;
    private int mYear, mMonth, mDay;
    EditText Ed_Password,Ed_ConfirmPassword;
    private CheckBox checkBoxShowPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        RegisterActivity.this.setTitle(R.string.register);

        Btn_Register = findViewById(R.id.btn_register_register);
        Tv_Regiseter_Login = findViewById(R.id.tv_register_login);
        Ed_birthDay_register = findViewById(R.id.Ed_birthDay_register);
        Ed_Password = findViewById(R.id.password_register);
        Ed_ConfirmPassword = findViewById(R.id.confirmPassword_register);
        checkBoxShowPassword = findViewById(R.id.checkboxPassword_register);

        checkBoxShowPassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // checkbox status is changed from uncheck to checked.
                if (!isChecked) {
                    // show password
                    Ed_Password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    Ed_ConfirmPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    // hide password
                    Ed_Password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    Ed_ConfirmPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });

        Ed_birthDay_register.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                final Calendar c = Calendar.getInstance();
                mYear = c.get(Calendar.YEAR);
                mMonth = c.get(Calendar.MONTH);
                mDay = c.get(Calendar.DAY_OF_MONTH);


                DatePickerDialog datePickerDialog = new DatePickerDialog(RegisterActivity.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                Ed_birthDay_register.setText(dayOfMonth + "/" + (monthOfYear+1) + "/" + year);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
            });

        Tv_Regiseter_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

        Btn_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });


    }

}
