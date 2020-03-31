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
public class CajaDoble implements ICaja, IControl{
    public String Codigo;
    @Override
    public boolean AsignarCodigo(String codigo) {
        Codigo = codigo;
        return true;
    }
    @Override
    public boolean CajaEntregada() {
        return ICaja.super.CajaEntregada();
    }

    @Override
    public void FechaAsignacion(String codigo) {
        System.out.println("Guardando en BDD la fecha de asignación");
    }

    @Override
    public void RegistrarUsuario(int id, String procedimiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean AsignarCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}