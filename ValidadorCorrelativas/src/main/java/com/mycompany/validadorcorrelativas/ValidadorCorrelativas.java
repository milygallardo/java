/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.validadorcorrelativas;

import Alumno.Alumno;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import conexion.Conexion;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import materias.Materia;

/**
 *
 * @author Diego
 */
public class ValidadorCorrelativas {

    public static Conexion conexion = new Conexion();
    public static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) throws JsonProcessingException, SQLException, IOException {

        Materia materia1 = new Materia("Razonamiento");
        Materia materia2 = new Materia("Resolucion");
        Materia materia3 = new Materia("Matematica");

        materia2.correlativas.add("Razonamiento");
        materia3.correlativas.add("Razonamiento");
        materia3.correlativas.add("Resolucion");

        Alumno alumno1 = new Alumno("Angelo", "00003");
        Alumno alumno2 = new Alumno("Charlie", "00002");
        Alumno alumno3 = new Alumno("Karina", "00001");

        alumno1.materiasAprobadas.add("Razonamiento");
        alumno2.materiasAprobadas.add("Razonamiento");
        alumno2.materiasAprobadas.add("Resolucion");

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonText = objectMapper.writeValueAsString(materia1);
        String jsonText1 = objectMapper.writeValueAsString(materia2);
        String jsonText2 = objectMapper.writeValueAsString(materia3);

        int input;
        do {
            System.out.println("Elija el numero correspondiente");
            System.out.println("1 - Agregar alumno");
            System.out.println("2 - Traer datos de alumno");
            System.out.println("3 - Agregar materia");
            System.out.println("4 - Traer datos de materia");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    agregarAlumno();
                    break;
                case 2:
                    traerDatosAlumno(input);
                    break;
                case 3:
                    agregarMateria();
                    break;
                case 4:
                    traerDatosMateria();
                    break;

                default:
                    throw new AssertionError();
            }
        } while (true);
    }

    public static void agregarAlumno() throws SQLException {
        Alumno alumno = new Alumno();

        conexion.estableceConexion();

        System.out.println("Nombre del alumno que quiere inscribirse a materia/s");
        String nombre = sc.next();
        alumno.setNombres(nombre);

        System.out.println("Numero de cinco digitos que corresponde al legajo");
        int legajo = sc.nextInt();

        System.out.println("Numero de la cantidad de materias aprobadas");
        int num = sc.nextInt();
        
        System.out.println("Nombre de la/s materia/s aprobadas del alumno");
        ArrayList<String> materiasAprobadas = new ArrayList<>();
        String input;
        for (int i = 0; i < num; i++) {
            input = sc.next();
            materiasAprobadas.add(input);
            
        String aprobadasJson = new Gson().toJson(materiasAprobadas);
            
        Statement statement = conexion.conectar.createStatement();
        statement.executeUpdate("INSERT INTO alumnos VALUES(\"" + nombre + "\",'" + legajo + "\",'" + aprobadasJson + "');");
                                                                
        conexion.cerrarConnection();
        }

    }

    public static Alumno traerDatosAlumno(int legajo) throws SQLException, JsonProcessingException, IOException {
        ObjectMapper mapper = new ObjectMapper();

        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

        conexion.estableceConexion();
        Statement statement = conexion.conectar.createStatement();

        ResultSet result = statement.executeQuery("SELECT * FROM alumnos WHERE legajo =" + legajo + ";");
        result.next();
        Alumno alumno = new Alumno(result.getString("nombre"), result.getString("legajo"));

        alumno.setMateriasAprobadas(mapper.readValue(result.getString("correlativas"), ArrayList.class));
        conexion.cerrarConnection();
        return alumno;
    }

    public static void agregarMateria() throws SQLException {

        Materia materia = new Materia();
        ObjectMapper ObjectMapper = new ObjectMapper();

        conexion.estableceConexion();

        System.out.println("Nombre de la materia que quiere crear");
        String nombre = sc.next();
        materia.setNombre(nombre);

        System.out.println("Numero de la cantidad de correlativas que tiene la materia");
        int numero = sc.nextInt();

        System.out.println("Nombre de la/s correlativa/s de la materia");
        ArrayList<String> correlativas = new ArrayList<>();
        String input;
        for (int i = 0; i < numero; i++) {
            input = sc.next();
            correlativas.add(input);
        }

        String correlativasJson = new Gson().toJson(correlativas);

        conexion.estableceConexion();
        Statement statement = conexion.conectar.createStatement();
        statement.executeUpdate("INSERT INTO materia VALUES(\"" + nombre + "\",'" + correlativasJson + "');");
        conexion.cerrarConnection();
    }

    public static void traerDatosMateria() throws SQLException, JsonProcessingException, IOException {
        Materia materia = new Materia();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

        HashMap<String, ArrayList<String>> hmMateria = new HashMap<>();

        conexion.estableceConexion();
        Statement statement = conexion.conectar.createStatement();

        ResultSet result = statement.executeQuery("SELECT * FROM materia");

        while (result.next()) {

            materia = new Materia(result.getString("nombre"));

            String jsonText = objectMapper.writeValueAsString(result.getString("correlativas"));

            ArrayList<String> nombreCorrelativas = objectMapper.readValue(jsonText, ArrayList.class);

            materia.setCorrelativas(nombreCorrelativas);

            hmMateria.put(materia.getNombre(), materia.getCorrelativas());

        }
        conexion.cerrarConnection();

        System.out.println(hmMateria);
    }
}
