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
        int bodega = 20;
        int cale = 2000;
        int estac = 5000;
        int gas = 3000;

        mostrarGrastos(gas, bodega, cale, estac, pagar(montopagar(gas, bodega, cale, estac), dineroCopr()));

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
        int numdepto = 0;
        try {
            numdepto = Integer.parseInt(JOptionPane.showInputDialog("N° depto del copropietario"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error");
        }
        return numdepto;
    }

    public static int montopagar(int gastosC, int bodega, int cale, int estac) {

        int total = gastosC + bodega + cale + estac;
        return total;

    }

    public static int pagar(int deuda, int dinero) {
        int restante = (deuda - dinero);

        if (restante == 0) {
            JOptionPane.showMessageDialog(null, "Su deuda a sido cancelada en su totalidad");
        } else if (restante > 0) {
            JOptionPane.showMessageDialog(null, "Usted a abonado: " + dinero + ", su  deuda queda en: " + restante);
        } else {
            JOptionPane.showMessageDialog(null, "su vuelto es de: " + (-restante));
        }
        return restante;
    }

    public static int dineroCopr() {
        int dinero = 0;
        do {
            try {
                dinero = Integer.parseInt(JOptionPane.showInputDialog("ingrese dinero"));

                if (dinero < 0) {
                    JOptionPane.showMessageDialog(null, "error");
                }
            } catch (Exception e) {

            }
        } while (dinero < 0);

        return dinero;
    }

    public static void mostrarGrastos(int gasto_com, int bodeg, int estacionamient, int calef, int monto) {
        JOptionPane.showMessageDialog(null, "Nombres del copropietario | Apellido del copropietario | Depto | Gasto Comun | Bodega | Calefaccion | Estacionamiento | Total a pagar\n"
                + nombreCopropietario() + "   " + apellidoCopropietario() + "   " + numDepartamento() + "  " + gasto_com + "   " + bodeg + "  " + estacionamient + "  " + monto);
    }

}
