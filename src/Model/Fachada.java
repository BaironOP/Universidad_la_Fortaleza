/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Fachada {
    
    private ArrayList<Departamento> deps;

    public Fachada() {
        deps = new ArrayList<>();
    }
    
    public void ingresarAsignatura(Asignatura a, Departamento d, Programa p){
        deps.get(deps.indexOf(d)).getProgramas().get(deps.get(deps.indexOf(d)).getProgramas().indexOf(p)).addMaterias(a);
    }
    
    public void ingresarDepartamento(Departamento d){
        deps.add(d);
    }
    
    public void ingresarEstudiante(Estudiante e, Departamento d, Programa p){
        deps.get(deps.indexOf(d)).getProgramas().get(deps.get(deps.indexOf(d)).getProgramas().indexOf(p)).addEstudiantes(e);
    }
    
    public void ingresarGrupo (Grupo g, Asignatura a, Departamento d, Programa p){
        deps.get(deps.indexOf(d)).getProgramas().get(deps.get(deps.indexOf(d)).getProgramas().indexOf(p)).getMaterias().get(deps.get(deps.indexOf(d)).getProgramas().get(deps.get(deps.indexOf(d)).getProgramas().indexOf(p)).getMaterias().indexOf(a));
    }
    
    public void ingresarHorarios (Horario h, Grupo g, Asignatura a, Departamento d, Programa p){
        deps.get(deps.indexOf(d)).getProgramas().get(deps.get(deps.indexOf(d)).getProgramas().indexOf(p)).getMaterias().get(deps.get(deps.indexOf(d)).getProgramas().get(deps.get(deps.indexOf(d)).getProgramas().indexOf(p)).getMaterias().indexOf(a)).getGrupos().get(deps.get(deps.indexOf(d)).getProgramas().get(deps.get(deps.indexOf(d)).getProgramas().indexOf(p)).getMaterias().get(deps.get(deps.indexOf(d)).getProgramas().get(deps.get(deps.indexOf(d)).getProgramas().indexOf(p)).getMaterias().indexOf(a)).getGrupos().indexOf(g)).getHorarios().add(h);
    }
    
    public void ingresarProfesores (Profesor p, Departamento d){
        deps.get(deps.indexOf(d)).addDocentes(p);
    }
    
    public void ingresarPrograma (Programa pr, Departamento p){
        deps.get(deps.indexOf(p)).addProgramas(pr);
    }
}
