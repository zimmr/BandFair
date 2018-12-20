package zimmer.bandfair.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
                Musician m = new Musician();
                m.setUsername(etUsername.getText().toString());
                m.setEmail(etEmail.getText().toString());
                m.setPassword(etPwd.getText().toString());

                Intent it = new Intent(RegisterPage1.this, RegisterPage2.class);
                startActivity(it);
            }
        });

    }

    private void init(){
        etUsername = findViewById(R.id.rg1_et_username);
        etEmail = findViewById(R.id.rg1_et_email);
        etPwd = findViewById(R.id.rg1_et_pwd);
        btNext = findViewById(R.id.rg1_bt_next);
    }
}
