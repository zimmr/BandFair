package zimmer.bandfair.ui;

import android.content.Intent;
import android.preference.CheckBoxPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import zimmer.bandfair.R;
import zimmer.bandfair.model.Musician;

public class RegisterPage3 extends AppCompatActivity {

    private CheckBox cbGuitar;
    private CheckBox cbBass;
    private CheckBox cbKeys;
    private CheckBox cbDrums;
    private CheckBox cbVocals;
    private EditText etOtherInstruments;
    private Button btAddInstrument;
    private CheckBox cbRock;
    private CheckBox cbPop;
    private CheckBox cbJazz;
    private CheckBox cbCountry;
    private CheckBox cbPagode;
    private EditText etOtherGenres;
    private Button btAddGenre;
    private Button btNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page3);

        init();

        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Musician m;
                if (getIntent().hasExtra("m")){
                    m = (Musician) getIntent().getSerializableExtra("m");

//                    m.setInstruments();
//                    m.setGenres();

                    Intent it = new Intent(RegisterPage3.this, ProfilePage.class);
                    startActivity(it);
                }
            }
        });

    }

    private void init(){
        cbGuitar = findViewById(R.id.rg3_cb_guitar);
        cbBass = findViewById(R.id.rg3_cb_bass);
        cbKeys = findViewById(R.id.rg3_cb_keys);
        cbDrums = findViewById(R.id.rg3_cb_drums);
        cbVocals = findViewById(R.id.rg3_cb_vocal);
        etOtherInstruments = findViewById(R.id.rg3_et_other);
        btAddInstrument = findViewById(R.id.rg3_bt_add);
        cbRock = findViewById(R.id.rg3_cb_rock);
        cbPop = findViewById(R.id.rg3_cb_pop);
        cbJazz = findViewById(R.id.rg3_cb_jazz);
        cbCountry = findViewById(R.id.rg3_cb_country);
        cbJazz = findViewById(R.id.rg3_cb_jazz);
        cbPagode = findViewById(R.id.rg3_cb_pagode);
        etOtherGenres = findViewById(R.id.rg3_et_other_genre);
        btAddGenre = findViewById(R.id.rg3_bt_add_genre);
        btNext = findViewById(R.id.rg3_bt_next);
    }

}
