package com.siddydevelops.siddysdictionary.ViewHolders;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.siddydevelops.siddysdictionary.R;

import org.w3c.dom.Text;

public class PhoneticViewHolder extends RecyclerView.ViewHolder {

    public TextView textViewPhonetics;
    public ImageButton imgaeButtonAudio;

    public PhoneticViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewPhonetics = itemView.findViewById(R.id.textViewPhonetics);
        imgaeButtonAudio = itemView.findViewById(R.id.imageButtonAudio);
    }
}
