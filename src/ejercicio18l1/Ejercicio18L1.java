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
        //Creamos un array de objetos de la clase empleados
        int numuser=0,busqueda=0;
        Telefonos arrayObjetos[]=new Telefonos[10];
        String nombre,apellido1,apellido2;
        int option=10;
        Scanner lector;
        lector = new Scanner(System.in);
        System.out.println("\nDigite Nombre");
        nombre=lector.nextLine();
        System.out.println("Digite Apellido");
        apellido1=lector.nextLine();
        System.out.println("Digite Segundo Apellido");
        apellido2=lector.nextLine();
        arrayObjetos[numuser]= new Telefonos(nombre,apellido1,apellido2);
    do{ 
        System.out.println("\nDigite Una Opcion ");
        System.out.println("1. Ingresar Cliente");
        System.out.println("2. Buscar cliente");
        System.out.println("0. Salir\n");
        option=lector.nextInt();
        
        switch (option){
            case 1: numuser++;
                    System.out.println("\nDigite Nombre");
                    nombre=lector.next();
                    System.out.println("Digite Apellido");
                    apellido1=lector.next();
                    System.out.println("Digite Segundo Apellido");
                    apellido2=lector.next();
                    System.out.println("\nDigite un nuevo usuario ");
                    arrayObjetos[numuser]= new Telefonos(nombre,apellido1,apellido2);
                    break;
            case 2: System.out.println("\nDigite nombre cliente ");
                    nombre=lector.next();
                    for(int i=0;i<arrayObjetos.length;i++){
                        if(nombre.equals(arrayObjetos[i].getNombre())){
                            busqueda=i;
                            break;
                        }else
                            System.out.println("\nNombre erroneo ");
                            
                            
                    }
                    do{
                    System.out.println("\nDigite Una Opcion ");
                    System.out.println("1. Mostrar Nombre");
                    System.out.println("2. Modificar nombre");
                    System.out.println("3. Modificar Telefono");
                    System.out.println("4. Mostrar Nombre y telefono");
                    System.out.println("9. Salir\n");
                    option=lector.nextInt();
        
                    switch (option){
                        case 1: arrayObjetos[busqueda].mostrar_nombre();
                                break;
                        case 2: arrayObjetos[busqueda].setNombre(lector.next());
                                break;
                        case 3: arrayObjetos[busqueda].setTelefono(lector.nextInt());
                                break;
                        case 4:
                                arrayObjetos[busqueda].mostrar_nombre();
                                arrayObjetos[busqueda].mostrar_telefono();
                                break;                     
                    }
                    }while(option!=9);
                break;
        }
        
        }while(option!=0);
        
        
    }
    
}
