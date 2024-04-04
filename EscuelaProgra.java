/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import javax.swing.JOptionPane;

public class EscuelaProgra {
    private Estudiante[] estudiantes;
    private int cantidadEstudiantes;

    public EscuelaProgra(int cantidadMaximaEstudiantes) {
        this.estudiantes = new Estudiante[cantidadMaximaEstudiantes];
        this.cantidadEstudiantes = 0;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (cantidadEstudiantes < estudiantes.length) {
            estudiantes[cantidadEstudiantes] = estudiante;
            cantidadEstudiantes++;
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más estudiantes.");
        }
    }

    public String obtenerEstudianteConMayorNota() {
        if (cantidadEstudiantes == 0) return "No hay estudiantes registrados.";
        Estudiante estudianteMaxNota = estudiantes[0];
        for (int i = 1; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].getCalificacion() > estudianteMaxNota.getCalificacion()) {
                estudianteMaxNota = estudiantes[i];
            }
        }
        return estudianteMaxNota.getNombre();
    }

    public String obtenerEstudianteConMenorNota() {
        if (cantidadEstudiantes == 0) return "No hay estudiantes registrados.";
        Estudiante estudianteMinNota = estudiantes[0];
        for (int i = 1; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].getCalificacion() < estudianteMinNota.getCalificacion()) {
                estudianteMinNota = estudiantes[i];
            }
        }
        return estudianteMinNota.getNombre();
    }

    public double calcularPromedioCalificaciones() {
        if (cantidadEstudiantes == 0) return 0;
        double sum = 0;
        for (int i = 0; i < cantidadEstudiantes; i++) {
            sum += estudiantes[i].getCalificacion();
        }
        return sum / cantidadEstudiantes;
    }
}

