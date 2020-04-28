package cl.zenta.proyecto.comparaciondecreditos.controllers;


import cl.zenta.proyecto.comparaciondecreditos.bd.UsuariosDB;
import cl.zenta.proyecto.comparaciondecreditos.model.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping( "usuarios" )
public class UsuariosController {


    // obtener todos los usuarios
    // [GET]
    // Localhost:8080/usuarios

    @RequestMapping( method = RequestMethod.GET)
    public List<Usuario> obtenerLosUsuarios(){

        // Ir a la base de datos y obtener usuarios

        //List<Usuario> usuarios = new ArrayList<>();

        //usuarios.add( new Usuario(1, "Juan", "123") );
        //usuarios.add( new Usuario(2, "Carlos", "123") );

        UsuariosDB usuariosDB = new UsuariosDB();



        return usuariosDB.obtenerTodosLosUsuarios();
    }


    //  buscar un usuario por el id
    // [GET]
    // Localhost:8080/usuarios/{id}

    @RequestMapping( method = RequestMethod.GET , value = "{id}")
    public Usuario buscarUsuario( @PathVariable int id ){

        System.out.println( "ID: " + id );
        // Ir a buscar el usuario a la base de datos ...
        return new Usuario( id, "Juan", "123" );
    }




    // crear un usuario
    // [POST | PUT]
    // Localhost:8080/usuarios

    @RequestMapping( method = RequestMethod.POST)
    public void crearUsuario( @RequestBody Usuario usuario ){

        System.out.println( usuario.getNombre() );
        System.out.println( usuario.getPassword() );

        // Crear el usuario en base de datos

    }






    // eliminar un usuario




}
