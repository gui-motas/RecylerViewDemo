package com.example.recylerviewdemo;

public class Contact {

    private String nome, email, tel;

    private int image;


    public Contact(String nome, String email, String tel, int image) {
        this.nome = nome;
        this.email = email;
        this.tel = tel;
        this.image = image;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
