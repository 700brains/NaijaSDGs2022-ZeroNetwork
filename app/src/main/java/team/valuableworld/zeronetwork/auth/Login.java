package team.valuableworld.zeronetwork.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import team.valuableworld.zeronetwork.R;

public class Login extends AppCompatActivity {
TextView signup;
Button btnLogin;
TextInputEditText email,password;
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signup = findViewById(R.id.signup);
        btnLogin = findViewById(R.id.btnlogin);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);


        signup.setOnClickListener(view -> {
            intent = new Intent(getApplicationContext(), Register.class);
            startActivity(intent);
        });
    }



}