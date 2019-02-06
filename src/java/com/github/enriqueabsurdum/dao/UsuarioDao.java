package com.github.enriqueabsurdum.dao;

import com.github.enriqueabsurdum.database.Conexion;
import com.github.enriqueabsurdum.modelos.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {

    private final String INSERTAR = "INSERT INTO usuarios (run, nombre, apellido, edad) VALUES (?, ?, ?, ?)";
    private final String SELECCIONAR_TODOS = "SELECT id_usuario, run, nombre, apellido, edad FROM usuarios";

    private Connection conexion;
    private PreparedStatement sentencia;
    private ResultSet resultados;

    public void create(Usuario usuario) {
        try {
            conexion = new Conexion().conectar();
            sentencia = conexion.prepareStatement(INSERTAR, Statement.RETURN_GENERATED_KEYS);
            sentencia.setString(1, usuario.getRun());
            sentencia.setString(2, usuario.getNombre());
            sentencia.setString(3, usuario.getApellido());
            sentencia.setInt(4, usuario.getEdad());
            if (sentencia.executeUpdate() != 0) {
                System.out.printf("correcto INSERT\n");
            }
            resultados = sentencia.getGeneratedKeys();
            if (resultados.next()) {
                usuario.setId(resultados.getInt(1));
            }
        } catch (SQLException sqle) {
            System.out.printf("Exception SQL: %s\n", sqle.getMessage());
        }
    }


    public List<Usuario> findAll() {
        List<Usuario> usuarios = new ArrayList<>();
        try {
            conexion = new Conexion().conectar();
            sentencia = conexion.prepareStatement(SELECCIONAR_TODOS);
            resultados = sentencia.executeQuery();
            while (resultados.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(resultados.getInt("id_usuario"));
                usuario.setRun(resultados.getString("run"));
                usuario.setNombre(resultados.getString("nombre"));
                usuario.setApellido(resultados.getString("apellido"));
                usuario.setEdad(resultados.getInt("edad"));
                usuarios.add(usuario);
            }
        } catch (SQLException sqle) {
            System.out.printf("Exception SQL: %s\n", sqle.getMessage());
        }
        return usuarios;
    }
}
