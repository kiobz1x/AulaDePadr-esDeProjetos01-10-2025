package org.example.exercicio2;

//TODO: Refatore o código para que obedeça o Princípio Aberto/Fechado
// Aplique o princípio utilizando herança, polimorfismo ou estratégias, permitindo
// adicionar novos tipos de desconto sem alterar a classe CalculadoraDeDesconto.

public class CalculadoraDeDesconto {

    protected double desconto;

    public void calcularDesconto(Cliente cliente){
        this.desconto = cliente.getDesconto();
    }

    public double getDesconto(){
        return desconto;
    }
}
