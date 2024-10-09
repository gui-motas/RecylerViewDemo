package com.example.recylerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<ContactViewHolder> {

    Context context;
    List<Contact> contacts;
    private ContactsActions actions;

    public MyAdapter(Context context, List<Contact> contacts, ContactsActions listener) {
        this.context = context;
        this.contacts = contacts;
        this.actions = listener;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.contact_container, parent, false);
        return new ContactViewHolder(view, actions);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        View contact_container = holder.itemView;
        holder.imageView.setImageResource(contacts.get(position).getImage());
        holder.nomeView.setText(contacts.get(position).getNome());
        holder.emailView.setText(contacts.get(position).getEmail());
        holder.telView.setText(contacts.get(position).getTel());

    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

}

