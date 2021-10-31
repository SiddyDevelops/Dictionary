package com.siddydevelops.siddysdictionary.Adapters;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.siddydevelops.siddysdictionary.Models.Phonetics;
import com.siddydevelops.siddysdictionary.R;
import com.siddydevelops.siddysdictionary.ViewHolders.PhoneticViewHolder;

import java.util.List;

public class PhoneticsAdapter extends RecyclerView.Adapter<PhoneticViewHolder> {

    private Context context;
    private List<Phonetics> phoneticsList;

    @NonNull
    @Override
    public PhoneticViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PhoneticViewHolder(LayoutInflater.from(context).inflate(R.layout.phonetic_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PhoneticViewHolder holder, int position) {
        holder.textViewPhonetics.setText(phoneticsList.get(position).getText());
        holder.imgaeButtonAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = new MediaPlayer();
                try{
                    mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                    mediaPlayer.setDataSource("https:"+ phoneticsList.get(position).getAudio());
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(context, "Couldn't Play Audio!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return phoneticsList.size();
    }

}
