/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildingmanager;

import javax.swing.JOptionPane;
import sun.awt.SunHints;

/**
 *
 * @author Maximiliano
 */
public class BuildingManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        menu();

    }

    public static void menu() {
        String[][] copropietario = new String[10][8];

        int op = 0;
        int bodega = 20;
        int cale = 2000;
        int estac = 5000;
        int gas = 3000;
        int a = 0;

        do {

            try {
                op = Integer.parseInt(JOptionPane.showInputDialog("1. Gasto del los copropietarios\n 2. Pagar\n 3. mostrar\n 4. Actualizar"));
                switch (op) {
                    case 1: {

                        ingresar(a, copropietario, gas, bodega, cale, estac, montopagar(gas, bodega, cale, estac));//momto actualizado);
                        a++;
                        break;
                    }
                    case 2: {

                        JOptionPane.showMessageDialog(null, pagar(montopagar(gas, bodega, cale, estac), dineroCopr()));
                        break;
                    }
                    case 3: {
                        mostrar(copropietario);
                       
                        break;
                    }
                    case 4: {
                           ActualizarDatos(copropietario);
                        break;
                    }
                    default: {
                        JOptionPane.showMessageDialog(null, "opcion invalida");
                        break;
                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "invalida su opcion");
            }
        } while (op <= 7);
    }

    public static String nombreCopropietario() {
        String nomb = "";
        do {
            nomb = JOptionPane.showInputDialog("Nombre del co´propietario");
        } while ("".equals(nomb));

        return nomb;
    }

    public static String apellidoCopropietario() {
        String apellido = "";
        do {
            apellido = JOptionPane.showInputDialog("Apellido del co´propietario");
        } while ("".equals(apellido));
        return apellido;
    }

    public static int numDepartamento() {
        int numdepto = 0;

        do {
            try {
                numdepto = Integer.parseInt(JOptionPane.showInputDialog("N° depto del copropietario"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "error");
            }
        } while (numdepto <= 0);
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

    public static void ingresar(int s, String[][] arreglo, int gasto_com, int bodeg, int estacionamient, int calef, int monto) {

        arreglo[s][0] = nombreCopropietario();
        arreglo[s][1] = apellidoCopropietario();
        arreglo[s][2] = "" + numDepartamento();
        arreglo[s][3] = "" + gasto_com;
        arreglo[s][4] = "" + bodeg;
        arreglo[s][5] = "" + estacionamient;
        arreglo[s][6] = "" + calef;
        arreglo[s][7] = "" + montopagar(gasto_com, bodeg, calef, estacionamient);

        for (int i = 0; i < arreglo.length; i++) {

            for (int j = 0; j < arreglo[i].length; j++) {

            }
            System.out.println();

        }
        System.out.println(" ");

    }

    public static void mostrar(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + " ");

            }
            System.out.println();

        }

    }

    public static String[][] ActualizarDatos(String[][] Arra) {
        int op = 0;
        
        String nombreNuevo = nombreCopropietario();
        String ApellidoNuevo = apellidoCopropietario();
        String n = "" + numDepartamento();
        for (int i = 0; i < Arra.length; i++) {
            for (int j = 0; j < Arra[i].length; j++) {
                
                if (Arra[i][0].equals(nombreNuevo) && Arra[i][1].equals(ApellidoNuevo) && Arra[i][2].equals(n));
            }
                JOptionPane.showMessageDialog(null, "Exite el copropietario. Nombre del nuevo copropietario");

                Arra[i][0] = nombreCopropietario();
                Arra[i][1] = apellidoCopropietario();  //cont
                Arra[i][2] = "" + numDepartamento();
                break;
            

        }

        return Arra;
    }

}
