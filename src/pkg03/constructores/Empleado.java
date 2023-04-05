/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03.constructores;

/**
 *
 * @author Hansel Chavez
 */
public class Empleado {
    private String nombre;
    private int edad;
    private String departamento;

    public Empleado() {
        nombre = "";
        edad = 0;
        departamento = "";
    }
    public Empleado(String nombre, int edad, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
    }
    public Empleado(Empleado empleado){
        this.nombre = empleado.nombre;
        this.edad = empleado.edad;
        this.departamento = empleado.departamento;
    }
    
    public static Empleado copiaEmpleado(Empleado empleadoOLD){
        return new Empleado(
                empleadoOLD.getNombre(),
                empleadoOLD.getEdad(),
                empleadoOLD.getDepartamento()
        );
    }    
    public String getTextoImprimir(){
        return "Nombre: "
                +this.nombre 
                + "\nEdad: "
                +getEdadComoTexto()
                + "\nDepartamento: "
                +this.departamento;
                
    }
    public String getEdadComoTexto(){
        String edadTexto = String.valueOf(this.edad);
        return edadTexto;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}
