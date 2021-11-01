package com.siddydevelops.siddysdictionary.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.siddydevelops.siddysdictionary.Models.Meanings;
import com.siddydevelops.siddysdictionary.R;
import com.siddydevelops.siddysdictionary.ViewHolders.MeaningsViewHolder;

import java.util.List;

public class MeaningsAdapter extends RecyclerView.Adapter<MeaningsViewHolder> {

    private Context context;
    private List<Meanings> meaningsList;

    public MeaningsAdapter(Context context, List<Meanings> meaningsList) {
        this.context = context;
        this.meaningsList = meaningsList;
    }

    @NonNull
    @Override
    public MeaningsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MeaningsViewHolder(LayoutInflater.from(context).inflate(R.layout.meaning_list_item,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MeaningsViewHolder holder, int position) {
        holder.textViewPartsOfSpeech.setText("Parts Of Speech: " + meaningsList.get(position).getPartOfSpeech());
        holder.recyclerDefinations.setHasFixedSize(true);
        holder.recyclerDefinations.setLayoutManager(new GridLayoutManager(context, 1));

        DefinationAdapter definationAdapter = new DefinationAdapter(context, meaningsList.get(position).getDefinitions());
        holder.recyclerDefinations.setAdapter(definationAdapter);

    }

    @Override
    public int getItemCount() {
        return meaningsList.size();
    }
}
