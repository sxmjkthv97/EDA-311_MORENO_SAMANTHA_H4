package com.example.hito4.models;

public class Estudiante extends Persona {
    private String codigo;
    private String carrera;
 public Estudiante() {
 }
 public Estudiante (String codigo, String carrera){
    this.codigo = codigo;
    this.carrera = carrera;
 }
 public Estudiante(String nombre, String apellido, int edad, String codigo, String carrera) {
   super(nombre, apellido, edad);
   this.codigo = codigo;
   this.carrera = carrera;
 }
 public String getCodigo() {
   return codigo;
 }
 public void setCodigo(String codigo) {
   this.codigo = codigo;
 }
 public String getCarrera() {
   return carrera;
 }
 public void setCarrera(String carrera) {
   this.carrera = carrera;
 }

}