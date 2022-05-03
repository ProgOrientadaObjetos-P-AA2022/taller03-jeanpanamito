/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;

import paqueteuno.FacturaTelefono;

/**
 *
 * @author PERSONAL
 */
public class ejecutor {
     public static void main(String[] args) {
        // Crear un objeto de tipo FacturaTelefono
       
         FacturaTelefono ft = new FacturaTelefono(); 
         FacturaTelefono ft2 = new FacturaTelefono();
        // Valores de entrada
        String numeroTelefono = "098321321";
        double minutos = 30;
        double valorMinuto = 0.15;
        String numeroTelefono1 = "09832132234";
        double minutos1 = 31;
        double valorMinuto1 = 0.15;
        ft2.establecerNumeroTelefono(numeroTelefono);
        ft2.establecerMinutosMes(minutos);
        ft2.establecerValorMinuto(valorMinuto);
        // uso de los métodos establecer para darle valores a los 
        // atributos del objeto.
        ft.establecerNumeroTelefono(numeroTelefono);
        ft.establecerMinutosMes(minutos);
        ft.establecerValorMinuto(valorMinuto);
        // hasta aquí el objeto ya tiene valores para sus atributos:
        // número de telefono, número de minutos consumidos en el mes, 
        // valor de cada minuto.
        // LLamo al método calcularValorFactura, no se envía parámetros,
        // pues trabaja con los valores de los atributos: número de minutos 
        // consumidos en el mes, valor de cada minuto; que ya los tiene el 
        // objeto.
        
        ft.calcularValorFactura();
        
        // Se hace uso de los métodos obtener para presentar en pantalla lo 
        // requerido
        System.out.printf("Factura de Teléfono\n\nNúmero de teléfono: %s\n"
                + "Minutos mensuales: %.2f\nValor por minuto: %.2f\n"
                + "Valor a cancelar: %.2f\n", ft.obtenerNumeroTelefono(),
                ft.obtenerMinutosMes(), ft.obtenerValorMinuto(),
                ft.obtenerValorFactura());
        System.out.printf("\nFactura de Teléfono\n\nNúmero de teléfono: %s\n"
                + "Minutos mensuales: %.2f\nValor por minuto: %.2f\n"
                + "Valor a cancelar: %.2f\n", ft.obtenerNumeroTelefono(),
                ft.obtenerMinutosMes(), ft.obtenerValorMinuto(),
                ft.obtenerValorFactura());
    }  
     
}
