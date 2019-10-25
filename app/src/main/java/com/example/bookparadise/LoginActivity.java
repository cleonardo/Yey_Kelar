package com.example.bookparadise;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.bookparadise.models.User;
import com.example.bookparadise.utils.UserData;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

    EditText et_username, et_password;
    Button btn_login;
    UserData userData;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("MB001", "admin", "admin@bookparadise.com", "admin","Admin" , "jl. kebon jerok", "0812345678"));
        users.add(new User("MB002", "Denny_h0", "Denny_h@gmail.com", "Den0123","Denny Hogwart", "jl. panjang no 12", "089863217865"));

        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);
        btn_login = findViewById(R.id.btn_login);

        userData = userData.getData();

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = et_username.getText().toString();
                String password = et_password.getText().toString();

                if (isEmpty(username)||isEmpty(password)){
                    Toast.makeText(getApplicationContext(), "Username and Password field must be filled!", Toast.LENGTH_SHORT).show();
                }
                else {
                    for (User user: userData.getUsers()){
                        if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                            startActivity(intent);
                        }
                    }
                }
            }


        });
    }

    boolean isEmpty(String str) {
        return TextUtils.isEmpty(str);
    }
}
