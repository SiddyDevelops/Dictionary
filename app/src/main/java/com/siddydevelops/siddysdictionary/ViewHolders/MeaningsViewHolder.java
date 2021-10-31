package com.siddydevelops.siddysdictionary.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.siddydevelops.siddysdictionary.R;

public class MeaningsViewHolder extends RecyclerView.ViewHolder {

    public TextView textViewPartsOfSpeech;
    public RecyclerView recyclerDefinations;

    public MeaningsViewHolder(@NonNull View itemView) {
        super(itemView);

        textViewPartsOfSpeech = itemView.findViewById(R.id.textViewPartsOfSpeech);
        recyclerDefinations = itemView.findViewById(R.id.recyclerDefinations);

    }
}
