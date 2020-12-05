package com.localiza.amigos.amigos;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;

public class Usuario {
//
    @Id
    String nickname;
    String nombre;
    String paterno;
    String materno;
    String email;
    ArrayList<Coordenada> coordenadas;

    public Usuario(){}

    @Override
    public String toString() {
        return "Usuario{" +
                "nickname='" + nickname + '\'' +
                ", nombre='" + nombre + '\'' +
                ", paterno='" + paterno + '\'' +
                ", materno='" + materno + '\'' +
                ", email='" + email + '\'' +
                ", coordenadas=" + coordenadas +
                '}';
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Coordenada> getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(ArrayList<Coordenada> coordenadas) {
        this.coordenadas = coordenadas;
    }


}
