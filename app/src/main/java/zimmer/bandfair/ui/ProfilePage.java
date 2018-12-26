package zimmer.bandfair.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import zimmer.bandfair.R;
import zimmer.bandfair.model.Musician;

public class ProfilePage extends AppCompatActivity {

    private TextView tvName;
    private TextView tvAge;
    private TextView tvSex;
    private TextView tvLocation;
    private TextView tvInstruments;
    private TextView tvGenres;
    private Button btSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        init();

        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Musician m;
                if (getIntent().hasExtra("m")){
                    m = (Musician) getIntent().getSerializableExtra("m");

                    tvName.setText(m.getName().toString());
//                    tvAge.setText();
                    tvLocation.setText(m.getCity() + " / " + m.getState());
                    tvInstruments.setText(m.getInstruments().toString());
                    tvGenres.setText(m.getGenres().toString());
                }

                Intent it = new Intent(ProfilePage.this, MainActivity.class);
                startActivity(it);
            }
        });

    }

    public void init(){
        tvName = findViewById(R.id.pf_tv_name);
        tvAge = findViewById(R.id.pf_tv_age);
        tvSex = findViewById(R.id.pf_tv_sex);
        tvLocation = findViewById(R.id.pf_tv_location);
        tvInstruments = findViewById(R.id.pf_tv_instruments_list);
        tvGenres = findViewById(R.id.pf_tv_genres_list);
        btSave = findViewById(R.id.bt_pf_save);
    }
}
