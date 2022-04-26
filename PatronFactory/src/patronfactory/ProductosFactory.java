/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronfactory;

import Productos.Computadora;
import Productos.SmartPhone;
import Productos.Tablet;

/**
 *
 * @author seiya
 */
public class ProductosFactory {public static Productos crateSnack( int tipo){
        switch (tipo){
            case Productos.COMPUTADORA_HP:
                    return new Computadora("HP", "Intel i5", 12, "Windows");
            case Productos.COMPUTADORA_ACER:
                    return new Computadora("Acer", "Intel i3", 8, "Linux");
            case Productos.COMPUTADORA_TOSHIBA:
                    return new Computadora("Toshiba", "AMD Ryzen 3", 12, "Windows");
            case Productos.CELULAR_IPHONE:
                    return new SmartPhone("Apple", 256, 12, "iOS");
            case Productos.CELULAR_MOTOROLA:
                    return new SmartPhone("Motorola",  128, 4, "Android");
            case Productos.CELULAR_SAMSUNG:
                    return new SmartPhone("Sansung", 64, 4, "Android");
            case Productos.CELULAR_XIAOMI:
                    return new SmartPhone("Xiamoi", 128, 6, "MIUI");
            case Productos.TABLET_HUAWEI:
                    return new Tablet("Huawei", 256, 6, "HarmonyOS");
            case Productos.TABLET_IPAD:
                    return new Tablet("iPad", 256, 6, "iPadOS");
            case Productos.TABLET_LENOVO:
                    return new Tablet("Lenovo", 128, 4, "Android");
                
                
            
            default:
                throw new AssertionError();
        }
    }
    
}
