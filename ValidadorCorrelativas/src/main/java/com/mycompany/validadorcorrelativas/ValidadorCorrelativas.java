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

        ObjectMapper obj = new ObjectMapper();
        String jsonText = obj.writeValueAsString(alumno1);
        String jsonText1 = obj.writeValueAsString(alumno2);
        String jsonText2 = obj.writeValueAsString(alumno3);

        alumno1.materiasAprobadas.add("Razonamiento");
        alumno2.materiasAprobadas.add("Razonamiento");
        alumno2.materiasAprobadas.add("Resolucion");

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonText3 = objectMapper.writeValueAsString(materia1);
        String jsonText4 = objectMapper.writeValueAsString(materia2);
        String jsonText5 = objectMapper.writeValueAsString(materia3);

        menuCorrelativas();
    }

    public static void agregarAlumno() throws SQLException {
        Alumno alumno = new Alumno();
        conexion.estableceConexion();

        System.out.println("Nombre del alumno que quiere inscribirse");
        String nombre = sc.next();
        alumno.setNombres(nombre);

        System.out.println("Numero de cinco digitos que corresponde al legajo");
        int legajo = sc.nextInt();
        alumno.setLegajo(Integer.toString(legajo));

        System.out.println("Numero de la cantidad de materias aprobadas del alumno");
        int numero = sc.nextInt();

        System.out.println("Nombre materias aprobadas");
        ArrayList<String> materiasAprobadas = new ArrayList<>();
        String input;
        for (int i = 0; i < numero; i++) {
            input = sc.next();
            materiasAprobadas.add(input);
        }

        String aprobadasJson = new Gson().toJson(materiasAprobadas);

        conexion.estableceConexion();
        Statement statement = conexion.conectar.createStatement();
        statement.executeUpdate("INSERT INTO alumnos VALUES (\"" + nombre + "\", " + legajo + ", '" + aprobadasJson + "');");
        conexion.cerrarConnection();
    }

    public static Alumno traerDatosAlumno() throws SQLException, JsonProcessingException, IOException {
        ObjectMapper mapper = new ObjectMapper();

        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

        conexion.estableceConexion();
        Statement statement = conexion.conectar.createStatement();

        System.out.println("Numero de cinco digitos que corresponde al legajo");
        int legajo = sc.nextInt();

        ResultSet result = statement.executeQuery("SELECT * FROM alumnos WHERE legajo=" + legajo + "");
        result.next();
        Alumno alumno = new Alumno(result.getString("nombre"), result.getString("legajo"));
        alumno.setMateriasAprobadas(mapper.readValue(result.getString("materias_aprobadas"), ArrayList.class));
        System.out.println(alumno);
        conexion.cerrarConnection();
        return alumno;

    }

    public static void agregarMateria() throws SQLException {
        Materia materia = new Materia();
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

    public static void menuCorrelativas() throws JsonProcessingException, SQLException, IOException {
        int input1;
        do {
           input1 = 0;
            System.out.println("Ingrese el numero correspondiente");
            System.out.println("1 - Agregar un alumno");
            System.out.println("2 - Obtener datos de un alumno");
            System.out.println("3 - Crear una materia");
            System.out.println("4 - Traer datos de una materia");
            
            input1 = sc.nextInt();

            switch (input1) {
                case 1:
                    agregarAlumno();
                    break;
                case 2:
                    traerDatosAlumno();
                    break;
                case 3:
                    agregarMateria();
                    break;
                case 4:
                    traerDatosMateria();
                    break;

                default:
                    System.out.println("Valor ingresado no coincide");
                    throw new AssertionError();
            }
        } while (input1 != 55);
        System.out.println("El programa termino");
    }
}
