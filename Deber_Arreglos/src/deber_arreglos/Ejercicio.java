/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_arreglos;

/**
 *
 * @author Victoria
 */
public class Ejercicio {

    public static void main(String[] args) {
        //Inicializar Variables
        String[] meses = {"Agosto", "Octubre", "Diciembre"};
        String[] sucursales = {"sucursal 1", "sucursal 2", "sucursal 3", "sucursal 4"};
        String reportes = "";
        double[] ventas_mes_1 = {4500.2, 5500.2, 6500.2, 2500.1};
        double[] ventas_mes_2 = {1500.2, 2500.2, 3500.2, 1500.1};
        double[] ventas_mes_3 = {2300.2, 1200.2, 4700.2, 3200.1};
        double suma_total;
        double promedio;
        double total_sucursales = 0;
        double[] venta_total_sucursal = new double[4];
        double[] venta_promedio_sucursal = new double[4];

        // Crear el encabezado del reporte
        reportes = String.format("Reporte\n\n%-20s%-20s%-20s%-20s%-20s%-20s\n\n", "", meses[0], meses[1], meses[2], "Total", "Promedio");
        for (int contador = 0; contador < ventas_mes_2.length; contador++) {
            suma_total = ventas_mes_1[contador] + ventas_mes_2[contador] + ventas_mes_3[contador];
            promedio = suma_total / 3;
            venta_total_sucursal[contador] = suma_total;
            venta_promedio_sucursal[contador] = promedio;

            // Creando cada linea de datos
            reportes = String.format("%s%-20s%-20.2f%-20.2f%-20.2f%-20.2f%-20.2f\n", reportes, sucursales[contador], ventas_mes_1[contador], ventas_mes_2[contador], ventas_mes_3[contador], venta_total_sucursal[contador], venta_promedio_sucursal[contador]);

        }
        // Calculo de todas las sucursales   
        for (int contador = 0; contador < venta_total_sucursal.length; contador++) {
            total_sucursales = total_sucursales + venta_total_sucursal[contador];

        }
        // Pie de Reporte
        reportes = String.format("%s\nTotales de ventas de todas las sucursales es: %.2f", reportes, total_sucursales);

        // Presentacion del Reporte
        System.out.println(reportes);
    }

}
