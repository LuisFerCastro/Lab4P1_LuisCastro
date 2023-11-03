/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_luiscastro;

import java.util.Scanner;

/**
 *
 * @author lfern
 */
public class Lab4P1_LuisCastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("******Menu******");
        System.out.println("1. Inversion especial.");
        System.out.println("2. Balanza de cadenas.");
        System.out.println("3. Cifrado de mensajes.");
        System.out.println("4+.Salir del programa.");
        System.out.println("Ingrese su opcion: ");
        int opcion = leer.nextInt();
        while(opcion < 4 && opcion > 0){
            switch(opcion){
                case 1:
                    String cadena;
                    System.out.println("Ingrese su cadena: ");
                    cadena = input.nextLine();
                    String str = "";
                    String almacen = "";
                    while(cadena.length()<5){
                        System.out.println("Cadena invalida. Ingrese de nuevo:");
                        cadena = input.nextLine();
                    }
                    for(int i = 0; i < cadena.length();i++){
                        almacen += cadena.charAt(i);
                        if ((int)cadena.charAt(i)==32 || i == cadena.length()-1){
                            for (int j = almacen.length()- 1; j >=0; j--) {
                                str += almacen.charAt(j);
                            }
                            str+=" ";
                            almacen = " ";
                        }   
                    }
                    System.out.println("Cadena invertida: "+ str);
                    break;
                case 2:
                    String cadena1, cadena2, cadena3;
                    int numero1 = 0, numero2 = 0, numero3=0;
                    System.out.println("Ingrese su cadena 1: ");
                    cadena1 = input.nextLine();
                    System.out.println("Ingrese su cadena 2: ");
                    cadena2 = input.nextLine();
                    System.out.println("Ingrese su cadena 3: ");
                    cadena3 = input.nextLine();
                    
                    for(int c1= 0; c1 < cadena1.length();c1++){
                        char caracter1 = cadena1.charAt(c1);
                        numero1 = numero1 + (int)caracter1;    
                    }
                    
                    for(int c2 = 0; c2 < cadena2.length(); c2++){
                        char caracter2 = cadena2.charAt(c2);
                        numero2 = numero2 + (int)caracter2;
                    }
                    
                    for(int c3 = 0; c3 < cadena3.length(); c3++){
                        char caracter3 = cadena3.charAt(c3);
                        numero3 = numero3 + (int)caracter3;
                    }
                    
                    System.out.println("Peso cadena 1: "+numero1);
                    System.out.println("Peso cadena 2: "+numero2);
                    System.out.println("Peso cadena 3: "+numero3);
                    
                    if(numero1 > numero2 && numero1 > numero3){
                        System.out.println("La cadena 1 es mas pesada.");
                    }else if(numero2 > numero1 && numero2 > numero3){
                        System.out.println("La cadena 2 es mas pesada.");
                    }else if(numero3 > numero1 && numero3 > numero2){
                        System.out.println("La cadena 3 es mas pesada.");
                    }else{
                        System.out.println("Cadenas son iguales.");
                    }
                    break;
                case 3:
                    String cad;
                    int num = 0;
                    String acum ="";
                    System.out.println("Ingrese una cadena: ");
                    cad = input.nextLine();
                    while ("".equals(cad)){
                        System.out.println("Cadena no puede ser nula. Ingrese de nuevo: ");
                        cad = input.nextLine();
                    }
                    for(int i=0; i < cad.length();i++){
                        char caracter = cad.charAt(i);   
                        num = (caracter + 2);
                        char caracterconv = (char) num;
                        
                        acum+= caracterconv;
                    }
                    System.out.println("Mensaje cifrado: "+acum);
                    
                    break;
            }//fin switch
            System.out.println("******Menu******");
            System.out.println("1. Inversion especial.");
            System.out.println("2. Balanza de cadenas.");
            System.out.println("3. Cifrado de mensajes");
            System.out.println("Ingrese su opcion: ");
            opcion = leer.nextInt(); 
        }//fin while externo
    }//fin del main   
}//fin de la clase
