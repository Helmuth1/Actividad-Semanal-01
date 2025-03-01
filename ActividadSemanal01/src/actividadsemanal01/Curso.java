/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadsemanal01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author helmu
 */
public class Curso {
    private List<Estudiante> estudiantes;

    public Curso() {
        this.estudiantes = new ArrayList<>();
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public double calcularPromedio() {
        if (estudiantes.isEmpty()) return 0;
        double suma = 0;
        for (Estudiante e : estudiantes) {
            suma += e.getNotaFinal();
        }
        return suma / estudiantes.size();
    }
}
