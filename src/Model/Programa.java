/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author solan
 */
public class Programa {
    private String codigo;
    private String nombre;
    private Profesor director;
    private ArrayList<Asignatura> materias;
    private ArrayList<Estudiante> estudiantes;

    public Programa() {
        materias = new ArrayList<>();
        estudiantes = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getDirector() {
        return director;
    }

    public void setDirector(Profesor director) {
        this.director = director;
    }

    public ArrayList<Asignatura> getMaterias() {
        return materias;
    }

    public void addMaterias(Asignatura materia) {
        this.materias.add(materia);
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void addEstudiantes(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }

    @Override
    public String toString() {
        return "Programa{" + "codigo=" + codigo + ", nombre=" + nombre + ", director=" + director + ", materias=" + materias.toString() + ", estudiantes=" + estudiantes.toString() + '}';
    }

    

    
    
    
    
    
}
