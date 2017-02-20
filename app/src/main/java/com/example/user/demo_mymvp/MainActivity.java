package com.example.user.demo_mymvp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener, MainView {

    private EditText username;
    private EditText password;
    private MainPresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        findViewById(R.id.button).setOnClickListener(this);


        presenter = new MainPresenterImpl(this);

    }

    @Override
    public void onClick(View v) {
        presenter.validate(username.getText().toString(), password.getText().toString());
    }

    @Override
    public void setUsernameError() {
        username.setError("Username cannot be empty");
    }

    @Override
    public void setPasswordError() {
        password.setError("Password cannot be empty");
    }
}
