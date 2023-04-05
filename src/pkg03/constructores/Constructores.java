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
public class Constructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Persona persona = new Persona();
        Persona Hansel  =new Persona("Hansel",19);
        imprimir(persona.getTextoImprimir());
        imprimir(Hansel.getTextoImprimir());*/
        Empleado empleado = new Empleado("Manuel",33,"Finanzas");
        Empleado empleadoCopia = Empleado.copiaEmpleado(empleado);
        empleadoCopia.setDepartamento("Ventas");
        imprimir(empleado.getTextoImprimir());
        imprimir(empleadoCopia.getTextoImprimir());
    }
    public static void imprimir(String texto){
        System.out.println(texto);
        System.out.println("\n\n");
    }
    public static String convertirATexto(int entero){
        return String.valueOf(entero);
    }
    
}
