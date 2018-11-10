/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolitodenavidad;

import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class ArbolitodeNavidad {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Arboñl lista = null;
        Arboñl AA = null;
        Arboñl BB = null;
        Arboñl CC = null;
        Arboñl DD = null;
        Scanner leer = new Scanner(System.in);
        
        String Nombre;
        String Familia;
        String Suelos;
        String Zonas;
        int op;
        
        
        do{
            System.out.println("-------MENU-------");
            System.out.println("1. Ingresar Arbol");
            System.out.println("2. Mostrar Arboles");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opcion: ");
           op = leer.nextInt(); 
           
           switch(op)
           {
               
               case 1:
               {
                   System.out.println("a. Ingresar Nombre");
                   Nombre = leer.next();
                   Arboñl aux = new Arboñl();
                   aux.Nombre = Nombre;
                   aux.anterior = lista;
                   lista = aux;
                   System.out.println(" ");
                  
               
                   System.out.println("b. Ingresar Familia");
                   Familia = leer.next();
                   Arboñl aux1 = new Arboñl();
                   aux1.Familia = Familia;
                   aux1.b = AA;
                   AA = aux1;
                   System.out.println(" ");
                   
                   
                   System.out.println("c. Ingresar Suelos");
                   Suelos = leer.next();
                   Arboñl aux2 = new Arboñl();
                   aux2.Suelos = Suelos;
                   aux2.c = BB;
                   BB = aux2;
                   System.out.println(" ");
                   
                   
                   System.out.println("d. Ingresar Zonas");
                   Zonas = leer.next();
                   Arboñl aux3 = new Arboñl();
                   aux3.Zonas = Zonas;
                   aux3.d = CC;
                   CC =  aux3;
                   System.out.println(" ");
                   
                   
                   
                   break;
                   }

               case 2:
               {
                   
                   if(lista == null)
                   {
                       System.out.println("VACIA");
                   }else{
                   Arboñl aux = lista;
                   Arboñl aux1 = AA;
                   Arboñl aux2 = BB;
                   Arboñl aux3 = CC;
                   
                   System.out.println("    ARBOLES INGRESADOS: ");
                   System.out.println("----------------------------");
                   
                   while(aux !=null){
                   System.out.println(" ");
                   System.out.println("Nombre: "+aux.Nombre);
                   aux= aux.anterior;
                   
                   System.out.println("Familia: "+aux1.Familia);
                   aux1 = aux1.b;
                  
                   System.out.println("Suelos: "+aux2.Suelos);
                   aux2 = aux2.c;
                   
                   System.out.println("Zonas: "+aux3.Zonas);
                   aux3 = aux3.d;
                   System.out.println(" ");

                   }
                   System.out.println("----------------------------");
                   
                   }break;
                   
               }
               case 3:
                   System.exit(0);
                   
                   
           }
           
        
        }while (op!=0);
    }
    
}

