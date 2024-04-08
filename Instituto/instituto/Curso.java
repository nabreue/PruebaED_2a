/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

import java.util.TreeSet;

/**
 *
 * @author ProfDiurno
 */
public class Curso {

    private String nombre;
    private TreeSet<Persona> listaAlumnos;


    /**
     * Obtiene el nombre del curso.
     * @return El nombre del curso.
     */
    protected String getNombre() {
        return nombre;
    }

    /**
     * Constructor que inicializa un nuevo curso con el nombre proporcionado.
     * @param nombre El nombre del curso.
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    /**
     * Genera una representación en cadena del curso, incluido su nombre y los estudiantes inscritos.
     * @return Una representación en cadena del curso.
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }

    /**
     * Agrega un alumno al curso.
     * @param p El alumno que se va a agregar.
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}
