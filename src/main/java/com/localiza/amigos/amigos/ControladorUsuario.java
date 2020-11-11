package com.localiza.amigos.amigos;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")


//Este metodo regresa todos los usuarios en la BD
public class ControladorUsuario {
    @Autowired RepoUsuario repoUsuario;

    @GetMapping("/usuario")
    public List<Usuario> obtenerTodos(){
        return repoUsuario.findAll();
    }

    //Busca por id
    @GetMapping("/usuario/{id}")
    public Usuario buscarPorId(@PathVariable String id){
        return repoUsuario.findById(id).get();
    }

    @PostMapping("/usuario")
    public Estatus guardar(@RequestBody String json) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        Usuario u= mapper.readValue(json,Usuario.class);
        //Guardamos
        repoUsuario.save(u);
        Estatus estatus= new Estatus();
        estatus.mensaje="Usuario guardado";
        estatus.success=true;
        return estatus;
    }

}
