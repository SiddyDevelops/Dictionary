package com.siddydevelops.siddysdictionary.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.siddydevelops.siddysdictionary.R;

public class DefinationViewHolder extends RecyclerView.ViewHolder {

    public TextView textViewDefinations, textViewExample, textViewSynonyms, textViewAntonyms;

    public DefinationViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewDefinations = itemView.findViewById(R.id.textViewDefination);
        textViewExample = itemView.findViewById(R.id.textViewExample);
        textViewSynonyms = itemView.findViewById(R.id.textViewSynonyms);
        textViewAntonyms = itemView.findViewById(R.id.textViewAntonyms);
    }
}
