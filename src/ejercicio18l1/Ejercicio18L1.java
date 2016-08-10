/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18l1;
import java.util.Scanner;
/**
 *
 * @author Aldebarantech
 */
public class Ejercicio18L1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre,apellido1,apellido2;
        int option;
        Scanner lector;
        lector = new Scanner(System.in);
        System.out.println("\nDigite Nombre");
        nombre=lector.nextLine();
        System.out.println("Digite Apellido");
        apellido1=lector.nextLine();
        System.out.println("Digite Segundo Apellido");
        apellido2=lector.nextLine();
        Telefonos cliente1;
        cliente1= new Telefonos(nombre,apellido1,apellido2);
    do{
        System.out.println("\nDigite Una Opcion ");
        System.out.println("1. Mostrar Nombre");
        System.out.println("2. Modificar nombre");
        System.out.println("3. Modificar Telefono");
        System.out.println("4. Mostrar Nombre y telefono");
        System.out.println("0. Salir\n");
        option=lector.nextInt();
        
        switch (option){
            case 1:cliente1.mostrar_nombre();
                   break;
            case 2: cliente1.setNombre(lector.next());
                break;
            case 3: cliente1.setTelefono(lector.nextInt());
                break;
            case 4:
                cliente1.mostrar_nombre();
                cliente1.mostrar_telefono();
                break;
                
                             
        }
    }while(option!=0);
    }
    
}
