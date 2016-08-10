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
public class Telefonos extends persona{
    private int telefono;

    /**
     *
     * @param nombre
     * @param apellido1
     * @param apellido2
     */
    public Telefonos(String nombre, String apellido1, String apellido2) {
        super(nombre, apellido1, apellido2);
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void mostrar_telefono(){
        System.out.println("Telefono: "+this.telefono);
    }
    
    
    
}
