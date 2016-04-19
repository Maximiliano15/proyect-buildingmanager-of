/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildingmanager;

import javax.swing.JOptionPane;

/**
 *
 * @author Maximiliano
 */
public class BuildingManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bodega=20;
        int cale=2000;
        int estac=5000;
        int gas=3000;
        mostrarGrastos(gas,bodega,cale,estac);
    }

    public static String nombreCopropietario() {
        String nombre = JOptionPane.showInputDialog("Nombre del co´propietario");
        return nombre;
    }

    public static String apellidoCopropietario() {
        String apellido = JOptionPane.showInputDialog("Apellido del co´propietario");
        return apellido;
    }

    public static int numDepartamento() {
        int numdepto = Integer.parseInt(JOptionPane.showInputDialog("N° depto del copropietario"));
        return numdepto;
    }
    
    public static int montopagar(int gastosC,int bodega, int cale, int estac){
        
        int total=gastosC+bodega+cale+estac;
        return total;
    }
    
    

    public static void mostrarGrastos(int gasto_com, int bodeg, int estacionamient, int calef) {
        JOptionPane.showMessageDialog(null, "Nombres del copropietario | Apellido del copropietario | Depto | Gasto Comun | Bodega | Calefaccion | Estacionamiento | Total a pagar\n"
                + nombreCopropietario() + "   " + apellidoCopropietario() + "   " + numDepartamento() + "  " + gasto_com + "   " + bodeg + "  " + estacionamient + "  "+montopagar(gasto_com, bodeg,calef,estacionamient));
    }

}
