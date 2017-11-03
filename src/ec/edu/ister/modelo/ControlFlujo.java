package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author JHON SUNTAXI
 */
public class ControlFlujo {

    public static void flujoSwitch() {

        int op = Integer.parseInt(JOptionPane.showInputDialog(""
                + "1.- Iteracion\n"
                + "2.- Sumar arreglo\n"
                + "3.- Salir"));
        switch (op) {
            case 1:
                iteracionFor();
                break;
            case 2:
                sumarArreglo();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Aun en construcción");
                break;
        }
    }

    public static void condicionalDoWhile() {
        int x;
        do {

            flujoSwitch();
            x = JOptionPane.showConfirmDialog(null, "Desea continuar");

        } while (x != 1);
    }

    public static void iteracionFor() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i:" + i);
            if (i == 2 || i == 4) {
                continue;
                //break;
            }
            System.out.println("Paso i:" + i);
        }
    }

    public static void sumarArreglo() {
        int[] array = {9, 6, 7};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        JOptionPane.showMessageDialog(null, ++sum);
    }

}
