package com.example.recylerviewdemo;

import java.util.ArrayList;
import java.util.List;


public class ListContacts {

    List<Contact> contacts = new ArrayList<>();

    public List<Contact> getContacts() {

        contacts.add(new Contact("joao", "john@gmail.com", "123456789", R.drawable.a));
        contacts.add(new Contact("maria", "maria@gmail.com", "987654321", R.drawable.b));
        contacts.add(new Contact("pedro", "pedro@gmail.com", "123456789", R.drawable.a));
        contacts.add(new Contact("joao", "john@gmail.com", "123456789", R.drawable.b));

        return contacts;
    }

    public void add(Contact joao) {
        contacts.add(joao);

    }

    public int getSize(){

        return contacts.size();
    }

    public void remove(int position){
        contacts.remove(position);
    }

}
