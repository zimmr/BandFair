package zimmer.bandfair.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

import zimmer.bandfair.R;

public class RegisterPage2 extends AppCompatActivity {

    private EditText etName;
    private EditText etBirthDate;
    private RadioGroup rgSex;
    private Spinner spCity;
    private Spinner spNeighborhood;
    private Button btNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page2);

        init();

        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    private void init(){
        etName = findViewById(R.id.rg2_et_name);
        etBirthDate = findViewById(R.id.rg2_et_birthdate);
        rgSex = findViewById(R.id.rg2_rg_sex);
        spCity = findViewById(R.id.rg2_sp_city);
        spNeighborhood = findViewById(R.id.rg2_sp_nb);
        btNext = findViewById(R.id.rg2_bt_next);
    }
}
