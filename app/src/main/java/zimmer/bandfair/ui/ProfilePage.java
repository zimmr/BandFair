package zimmer.bandfair.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import zimmer.bandfair.R;

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
