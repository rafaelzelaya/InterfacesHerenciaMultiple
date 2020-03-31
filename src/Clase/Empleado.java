/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;
import Interface.*;
/**
 *
 * @author rafae
 */
public class Empleado implements IRecursosHumanos, ICaja, IControl{

    @Override
    public void NuevoEmpleado(String nombre, String codigo) {
        System.out.println("Soy un nuevo empleado !!!");
    }

    @Override
    public boolean AsignarCodigo(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean AsignarCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean CajaEntregada() {
        boolean respuesta = ICaja.super.CajaEntregada(); //To change body of generated methods, choose Tools | Templates.
        /*codigo extra propio de nuestra circunstancia*/
        return respuesta;
    }

    @Override
    public void FechaAsignacion(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RegistrarUsuario(int id, String procedimiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
