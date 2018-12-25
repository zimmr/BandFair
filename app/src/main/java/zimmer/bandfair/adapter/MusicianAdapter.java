package zimmer.bandfair.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import zimmer.bandfair.R;
import zimmer.bandfair.model.Musician;

public class MusicianAdapter extends RecyclerView.Adapter {

    private Context context;
    private ArrayList<Musician> musicians;
    private static ClickListener clickListener;

    public MusicianAdapter(Context context, ArrayList<Musician> musicians) {
        this.context = context;
        this.musicians = musicians;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.musician_line, viewGroup, false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder h = (ViewHolder) viewHolder;
        Musician m = musicians.get(i);

        h.tvName.setText(m.getName());
        h.tvInfo.setText(m.toString());
        h.tvInstruments.setText(m.getInstruments().toString());
        h.tvGenres.setText(m.getGenres().toString());
    }

    @Override
    public int getItemCount() {
        return musicians.size();
    }

    private class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

        private final ImageView ivIcon;
        private final TextView tvName;
        private final TextView tvInfo;
        private final TextView tvInstruments;
        private final TextView tvGenres;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
            ivIcon = itemView.findViewById(R.id.ml_iv_ic);
            tvName = itemView.findViewById(R.id.ml_tv_name);
            tvInfo = itemView.findViewById(R.id.ml_tv_info);
            tvInstruments = itemView.findViewById(R.id.ml_tv_instruments);
            tvGenres = itemView.findViewById(R.id.ml_tv_genres);
        }

        @Override
        public void onClick(View v) {
            clickListener.OnItemClick(v, getAdapterPosition());
        }

        @Override
        public boolean onLongClick(View v) {
            clickListener.OnItemLongClick(v, getAdapterPosition());
            return true;
        }
    }

    public void setOnClickListener(ClickListener clickListener){
        MusicianAdapter.clickListener = clickListener;
    }

    public interface ClickListener{
        void OnItemClick(View v, int position);
        void OnItemLongClick(View v, int position);
    }
}
