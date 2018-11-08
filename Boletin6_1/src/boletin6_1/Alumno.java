/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_1;

/**
 *
 * @author aparcerozas
 */
public class Alumno {
    private String nombre;
    private String dni;
    private String telefono;
    private int edad;
    
    public Alumno(){}
    public Alumno(String nombre, String dni, String telefono, int edad){
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.edad = edad;
    }
    
}
