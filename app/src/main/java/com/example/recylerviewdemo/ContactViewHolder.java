package com.example.recylerviewdemo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView telView, emailView, nomeView ;

    public ContactViewHolder(@NonNull View contact_container, ContactsActions actions) {
        super(contact_container);
        imageView = contact_container.findViewById(R.id.imageView);
        telView = contact_container.findViewById(R.id.telView);
        emailView = contact_container.findViewById(R.id.emailView);
        nomeView = contact_container.findViewById(R.id.nomeView);

        contact_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               itemView.setOnClickListener(v -> {
                   if (actions != null){
                       int position = getAdapterPosition();
                       if (position != RecyclerView.NO_POSITION){
                           actions.onClicar(position);
                       }
                   }
               });

            }

        });

    }
}
