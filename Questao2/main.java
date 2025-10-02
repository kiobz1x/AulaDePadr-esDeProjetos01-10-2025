package org.example.exercicio2;

import org.example.exercicio2.CalculadoraDeDesconto;

public class main {
    public static void main(String[] args) {
        
        Cliente clinete1 = new ClienteRegular();
        Cliente cliente2 = new ClienteVIP();
        
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
        
        calculadoraDeDesconto.calcularDesconto(clinete1);
        System.out.println("Desconto cliente regular: " + calculadoraDeDesconto.getDesconto());

        calculadoraDeDesconto.calcularDesconto(cliente2);
        System.out.println("Desconto cliente regular: " + calculadoraDeDesconto.getDesconto());
    }
}
