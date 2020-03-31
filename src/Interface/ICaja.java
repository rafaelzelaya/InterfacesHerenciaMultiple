/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author rafae
 */
public interface ICaja {
    
    public String CodigoCaja = "000000";//variable de tipo final
    
    public boolean AsignarCodigo(String codigo); // Función abstracta
    public boolean AsignarCodigo();//función abstracta
    
    public default boolean CajaEntregada(){ // función con código por defecto
        System.out.println("Aquí va código estático");
        return true;
    }
    public static double CalcularCostoEntrega(int cantidadCajas){ //función estática
        return cantidadCajas * 1.25;
    }
}
