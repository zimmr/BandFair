package zimmer.bandfair.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.net.MulticastSocket;
import java.util.ArrayList;

import zimmer.bandfair.R;
import zimmer.bandfair.adapter.MusicianAdapter;
import zimmer.bandfair.model.Musician;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Musician> musicians;
    private MusicianAdapter adapter;
    private RecyclerView rvMusicians;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init(){

        rvMusicians = findViewById(R.id.ma_rv_items);

        musicians = new ArrayList<>();
        adapter = new MusicianAdapter(MainActivity.this, musicians);

        rvMusicians.setAdapter(adapter);
        rvMusicians.setHasFixedSize(true);
        rvMusicians.setLayoutManager(new LinearLayoutManager(this));
    }
}
