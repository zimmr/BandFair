package zimmer.bandfair.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import zimmer.bandfair.R;
import zimmer.bandfair.model.Musician;

public class RegisterPage2 extends AppCompatActivity {

    private EditText etName;
    private Spinner spBirthYear;
    private Spinner spBirthMonth;
    private Spinner spBirthDay;
    private RadioGroup rgSex;
    private Spinner spState;
    private Spinner spCity;
    private Button btNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page2);

        init();

        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etName.getText().toString().isEmpty()){
                    toast("Name is empty!");
                    return;
                }

                Musician m;
                if (getIntent().hasExtra("m")){
                    m = (Musician) getIntent().getSerializableExtra("m");
                    m.setName(etName.getText().toString());
                    m.setBirthDate(spBirthYear.getSelectedItem().toString(),
                        spBirthMonth.getSelectedItem().toString(),
                        spBirthDay.getSelectedItem().toString());

                    switch (rgSex.getCheckedRadioButtonId()){
                        case R.id.rg2_rb_female:
                            m.setSex(0);
                            break;
                        case R.id.rg2_rb_male:
                            m.setSex(1);
                            break;
                        default:
                            toast("Select your sex!");
                            return;
                    }

                    m.setState(spState.getSelectedItem().toString());
                    m.setCity(spCity.getSelectedItem().toString());

                    Intent it  = new Intent(RegisterPage2.this, RegisterPage3.class);
                    it.putExtra("m", m);
                    startActivity(it);
                }
            }
        });
    }

    private void toast(String msg){
        Toast.makeText(getBaseContext(), msg, Toast.LENGTH_LONG).show();
    }

    private void init(){
        etName = findViewById(R.id.rg2_et_name);
        spBirthYear = findViewById(R.id.rg2_sp_year);
        spBirthMonth = findViewById(R.id.rg2_sp_month);
        spBirthDay = findViewById(R.id.rg2_sp_day);
        rgSex = findViewById(R.id.rg2_rg_sex);
        spState = findViewById(R.id.rg2_sp_state);
        spCity = findViewById(R.id.rg2_sp_city);
        btNext = findViewById(R.id.rg2_bt_next);
    }
}
