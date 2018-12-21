package zimmer.bandfair.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;

import zimmer.bandfair.R;
import zimmer.bandfair.model.Musician;

public class RegisterPage1 extends AppCompatActivity {

    private EditText etUsername;
    private EditText etEmail;
    private EditText etPwd;
    private Button btNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page1);

        init();

        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etUsername.getText().toString().isEmpty()){
                    toast("Username is empty!");
                    return;
                }
                if (etEmail.getText().toString().isEmpty()){
                    toast("Email is empty!");
                    return;
                }
                if (etPwd.getText().toString().isEmpty()){
                    toast("Password is empty!");
                    return;
                }

                Musician m = new Musician();
                m.setUsername(etUsername.getText().toString());
                m.setEmail(etEmail.getText().toString());
                m.setPassword(etPwd.getText().toString());

                Intent it = new Intent(RegisterPage1.this, RegisterPage2.class);
                it.putExtra("m", m);
                startActivity(it);
            }
        });

    }

    private void toast(String msg){
        Toast.makeText(getBaseContext(), msg, Toast.LENGTH_LONG).show();
    }

    private void init(){
        etUsername = findViewById(R.id.rg1_et_username);
        etEmail = findViewById(R.id.rg1_et_email);
        etPwd = findViewById(R.id.rg1_et_pwd);
        btNext = findViewById(R.id.rg1_bt_next);
    }
}
