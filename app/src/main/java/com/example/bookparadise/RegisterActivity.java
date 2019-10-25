package com.example.bookparadise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.bookparadise.models.User;
import com.example.bookparadise.utils.UserData;

public class RegisterActivity extends AppCompatActivity {

    EditText et_username, et_password, et_fullName, et_confirmPw, et_address, et_email, et_phoneNumber;
    Button btn_register, btn_login;
    Validate validate;
    UserData userData;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);
        et_fullName = findViewById(R.id.et_fullName);
        et_confirmPw = findViewById(R.id.et_confirmPw);
        et_address = findViewById(R.id.et_address);
        et_email = findViewById(R.id.et_email);
        et_phoneNumber = findViewById(R.id.et_phoneNumber);
        btn_register  = findViewById(R.id.btn_register);
        btn_login = findViewById(R.id.btn_login);
        validate = new Validate();

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = et_username.getText().toString();
                String password = et_password.getText().toString();
                String fullName = et_fullName.getText().toString();
                String confirmPw =  et_confirmPw.getText().toString();
                String address = et_address.getText().toString();
                String email = et_email.getText().toString();
                String phoneNumber = et_phoneNumber.getText().toString();


                if (fullName.equals("")){
                    Toast.makeText(getApplicationContext(), "Fullname field must be filled!", Toast.LENGTH_SHORT).show();
                }

                else if (username.length()<=3){
                    Toast.makeText(getApplicationContext(), "Username must be more than 3 characters", Toast.LENGTH_SHORT).show();
                }

                else if (!password.equals(confirmPw)){
                    Toast.makeText(getApplicationContext(), "Confirm password must be same with password.", Toast.LENGTH_SHORT).show();
                }

                else if (address.equals("")){
                    Toast.makeText(getApplicationContext(), "Address field must be filled!", Toast.LENGTH_SHORT).show();
                }

                else if (!email.endsWith("@bookparadise.com")){
                    Toast.makeText(getApplicationContext(), "Email filed must ends with ‘@bookparadise.com’", Toast.LENGTH_SHORT).show();
                }

                else if (phoneNumber.length()<9 || phoneNumber.length()>15){
                    Toast.makeText(getApplicationContext(), "Phone number must be between 9 and 15 digits", Toast.LENGTH_SHORT).show();
                }

                else if (password.length()<=6){
                    Toast.makeText(getApplicationContext(), "Password length must be more than 6 characters.", Toast.LENGTH_SHORT).show();
                }

                else if (!validate.isAlphabet(fullName)){
                    Toast.makeText(getApplicationContext(), "Fullname must be in alphabet characters only", Toast.LENGTH_SHORT).show();
                }

                else if (!validate.isNumber(phoneNumber)){
                    Toast.makeText(getApplicationContext(), "Phone number must contains only numbers", Toast.LENGTH_SHORT).show();
                }

                else if (!validate.count(email, '@' )&& !validate.count(email,'.')){
                    Toast.makeText(getApplicationContext(), "Email must Contains only 1 ‘@’ character & Contains at least 1 ‘.’ character", Toast.LENGTH_SHORT).show();
                }

                else if (validate.isNumber(password)&&validate.isAlphabet(password)){
                    Toast.makeText(getApplicationContext(), "Password must Contains at least 1 letter [a-z][A-Z] & Contains at least 1 number [0-9]r", Toast.LENGTH_SHORT).show();
                }

                else {
                    String idUser = generateId();

                    User user = new User(idUser, username, email, password, fullName, address, phoneNumber);
                    userData.add(user);

                    Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    public String generateId(){
        int num = UserData.getUsers().size();
        User last = UserData.getUsers().get(num -1);
        String formatted = String.format("%03d", last);
        String Userid = "MB" + formatted;

        return Userid;
    }
}
