/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;



/**
 *
 * @author solan
 */
import java.util.ArrayList;
public class Departamento {
    private String codigo;
    private String nombre;
    private String ubicacion;
    private ArrayList <Programa> programas;
    private ArrayList <Profesor> docentes;

    public Departamento() {
        programas = new ArrayList<>();
        docentes = new ArrayList<>();
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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Programa> getProgramas() {
        return programas;
    }

    public void addProgramas(Programa programa) {
        this.programas.add(programa);
    }

    public ArrayList<Profesor> getDocentes() {
        return docentes;
    }

    public void addDocentes(Profesor docente) {
        this.docentes.add(docente);
    }

    @Override
    public String toString() {
        return "Departamento{" + "codigo=" + codigo + ", nombre=" + nombre + ", ubicacion=" + ubicacion + ", programas=" + programas.toString() + ", docentes=" + docentes.toString() + '}';
    }

    
    
    
}
