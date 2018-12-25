package zimmer.bandfair.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import zimmer.bandfair.R;

public class SplashScreen extends AppCompatActivity {

    private Button btRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        init();

        btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(SplashScreen.this, RegisterPage1.class);
                startActivity(it);

            }
        });

    }

    public void init(){
        btRegister = findViewById(R.id.spl_bt_signup);
    }
}
