package com.localiza.amigos.amigos;

import org.springframework.data.annotation.Id;

public class Hola {
    @Id
    String id;

    String mensaje;

    @Override
    public String toString() {
        return "Hola{" +
                "id='" + id + '\'' +
                ", mensaje='" + mensaje + '\'' +
                '}';
    }

    public Hola(){}
    //public Hola(String id,String mensaje){this.id=id;this.mensaje=mensaje;}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
