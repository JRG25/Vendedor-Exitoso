/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.ds.vendedorexitoso.pruebas;

import pe.ds.vendedorexitoso.services.VentasService;

/**
 *
 * @author S145-15API-R5
 */
public class Prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DATOS
        
        int mes = 1;
        double ventas = 100000.0;
        
        VentasService service = new VentasService();
        
        double comision = service.calcularComision(mes, ventas);
        double bono = service.calcularBono(mes, ventas);
        double pagoTotal = service.calculoPagoTotal(comision, bono);
        
        //reporte
        
        System.out.println("comision: "+comision);
        System.out.println("bono: "+bono);
        System.out.println("total: "+pagoTotal);
        
        
    }
    
}
