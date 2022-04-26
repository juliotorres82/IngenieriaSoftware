/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronfactory;

import java.util.Scanner;

/**
 *
 * @author seiya
 */
public class TestProductosFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado =new Scanner(System.in);
        int eleccion = 0;
        
        System.out.println("¿Que producto quieres?: ");
        System.out.println(Productos.COMPUTADORA_HP+") Computadora HP ");
        System.out.println(Productos.COMPUTADORA_ACER+") Computadora Acer ");
        System.out.println(Productos.COMPUTADORA_TOSHIBA+") Computadora Toshiba ");
        System.out.println(Productos.CELULAR_IPHONE+") Smartphone iPhone ");
        System.out.println(Productos.CELULAR_SAMSUNG+") SmartPhone Samsung ");
        System.out.println(Productos.CELULAR_MOTOROLA+") SmartPhone Motorola ");
        System.out.println(Productos.CELULAR_XIAOMI+") SmartPhone Xiaomi ");
        System.out.println(Productos.TABLET_IPAD+") Tablet iPad ");
        System.out.println(Productos.TABLET_HUAWEI+") Tablet Huawei ");
        System.out.println(Productos.TABLET_LENOVO+") Tablet  Lenovo ");
        
        
        try {
            System.out.print("Elige el numero: ");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No capturaste un numero");
            
        }
        Productos electronicos = ProductosFactory.crateSnack(eleccion);
        System.out.println(electronicos.toString());
    }
    
}
