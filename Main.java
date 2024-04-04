/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        EscuelaProgra escuela = new EscuelaProgra(10);

      
        escuela.agregarEstudiante(new Estudiante("Juan", "Programación Avanzada", "Profesor A", 95));
        escuela.agregarEstudiante(new Estudiante("María", "Estructuras de Datos", "Profesor B", 85));
        //Aquí se pueden añadir más estudiantes 

       
        JOptionPane.showMessageDialog(null, "Estudiante con la nota mayor: " + escuela.obtenerEstudianteConMayorNota());
        JOptionPane.showMessageDialog(null, "Estudiante con la nota menor: " + escuela.obtenerEstudianteConMenorNota());
        JOptionPane.showMessageDialog(null, "Promedio de calificaciones: " + escuela.calcularPromedioCalificaciones());
    }
}
