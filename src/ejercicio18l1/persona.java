/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18l1;

/**
 *
 * @author Aldebarantech
 */
public class persona {
    
    private  String nombre,apellido1,apellido2;

    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param nombre
     * @param apellido1
     * @param apellido2
     */
    public persona(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }
    
    public void mostrar_nombre(){
        System.out.println("Nombre Completo: "+nombre+" "+apellido1+" "+apellido2);
    }
}
