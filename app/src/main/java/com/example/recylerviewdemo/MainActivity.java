package com.example.recylerviewdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity implements ContactsActions {

    ListContacts contacts = new ListContacts();  // Lista de contatos
    MyAdapter mA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inicializando a interface
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Inicialize o adapter aqui com o contexto da Activity
        mA = new MyAdapter(this, contacts.getContacts(), this);
        recyclerView.setAdapter(mA);

        // Adiciona um contato e atualiza o RecyclerView
        contacts.add(new Contact("asdadsa", "john@gmail.com", "123456789", R.drawable.a));
        mA.notifyItemInserted(contacts.getSize() - 1);

    }

    @Override
    public void onClicar(int position) {
        contacts.remove(position);
        mA.notifyItemRemoved(position);
    }
}
