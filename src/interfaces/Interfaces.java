/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import Clase.*;
import Interface.*;
/**
 *
 * @author rafae
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Prueba de interfaces");
        CajaDoble cajaDoble = new CajaDoble();
        CajaDoble cajaDoble2 = new CajaDoble();
        cajaDoble.AsignarCodigo("00001");
        ICaja caja = cajaDoble;
        caja.CajaEntregada();
        Empleado empleadoCaja = new Empleado();
        empleadoCaja.CajaEntregada();
    }
    
}
