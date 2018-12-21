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
                if (etName.getText().toString().isEmpty()){
                    toast("Name is empty!");
                    return;
                }
                if (etBirthDate.getText().toString().isEmpty()){
                    toast("Birth Date is empty!");
                    return;
                }

                Musician m;
                if (getIntent().hasExtra("m")){
                    m = (Musician) getIntent().getSerializableExtra("m");
                    m.setName(etName.getText().toString());
                    m.setBirthDate(etBirthDate.getText().toString());

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

//                    m.setCity();
//                    m.setNeighborhood();

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
        etBirthDate = findViewById(R.id.rg2_et_birthdate);
        rgSex = findViewById(R.id.rg2_rg_sex);
        spCity = findViewById(R.id.rg2_sp_city);
        spNeighborhood = findViewById(R.id.rg2_sp_nb);
        btNext = findViewById(R.id.rg2_bt_next);
    }
}
