package com.siddydevelops.siddysdictionary.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.siddydevelops.siddysdictionary.Models.Definitions;
import com.siddydevelops.siddysdictionary.R;
import com.siddydevelops.siddysdictionary.ViewHolders.DefinationViewHolder;

import java.util.List;

public class DefinationAdapter extends RecyclerView.Adapter<DefinationViewHolder> {

    private Context context;
    private List<Definitions> definitionsList;

    public DefinationAdapter(Context context, List<Definitions> definitionsList) {
        this.context = context;
        this.definitionsList = definitionsList;
    }

    @NonNull
    @Override
    public DefinationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DefinationViewHolder(LayoutInflater.from(context).inflate(R.layout.defination_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DefinationViewHolder holder, int position) {
        holder.textViewDefinations.setText("Definition: " + definitionsList.get(position).getDefinition());
        holder.textViewExample.setText("Example: " + definitionsList.get(position).getExample());
        StringBuilder synonyms = new StringBuilder();
        StringBuilder antonyms = new StringBuilder();
        synonyms.append(definitionsList.get(position).getSynonym());
        antonyms.append(definitionsList.get(position).getAntonyms());

        holder.textViewSynonyms.setText(synonyms);
        holder.textViewAntonyms.setText(antonyms);

        holder.textViewSynonyms.setSelected(true);
        holder.textViewAntonyms.setSelected(true);

    }

    @Override
    public int getItemCount() {
        return definitionsList.size();
    }
}
