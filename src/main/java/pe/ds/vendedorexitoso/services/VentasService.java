/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.ds.vendedorexitoso.services;

/**
 *
 * @author S145-15API-R5
 */
public class VentasService {

    public double calcularComision(int mes, double ventas) {
        double meta = obtenerMeta(mes);
        double porcentaje = obtenerComision(mes);
        double comision = 0.0;
        if (ventas >= meta) {
            comision = meta * porcentaje;
        }
        return comision;
    }
    
    public double calcularBono(int mes, double ventas) {
        double meta = obtenerMeta(mes);
        double porcentaje = obtenerBono(mes);
        double bono = 0.0;
        if (ventas >= meta) {
            bono = (ventas -meta) * porcentaje;
        }
        return bono;
    }
    
    public double calculoPagoTotal(double comision, double bono){
        double total;
        total = comision + bono;
        return total;
    }

    private double obtenerMeta(int mes) {
        double meta = 0.0;
        switch (mes) {
            case 1: case 2: case 3:
                meta = 80000.0;
                break;
            case 4: case 5: case 6:
                meta = 60000.0;
                break;
            case 7: case 8: case 9:
                meta = 70000.0;
                break;
            case 10: case 11: case 12:
                meta = 100000.0;
                break;
        }
        return meta;
    }

    private double obtenerComision(int mes) {
        double comision = 0.0;
        switch (mes) {
            case 1: case 2: case 3:
                comision = 0.10;
                break;
            case 4: case 5: case 6:
                comision = 0.12;
                break;
            case 7: case 8: case 9:
                comision = 0.15;
                break;
            case 10: case 11: case 12:
                comision = 0.16;
                break;
        }
        return comision;
    }

    private double obtenerBono(int mes) {
         double bono = 0.0;
        switch (mes) {
            case 1: case 2: case 3:
                bono = 0.03;
                break;
            case 4: case 5: case 6:
                bono = 0.05;
                break;
            case 7: case 8: case 9:
                bono = 0.07;
                break;
            case 10: case 11: case 12:
                bono = 0.08;
                break;
        }
        return bono;
    }
    
    
    
}
