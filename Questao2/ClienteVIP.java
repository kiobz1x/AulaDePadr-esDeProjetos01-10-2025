package org.example.exercicio2;

public class ClienteVIP extends Cliente{
    @Override
    double getDesconto() {
        return 0.2;
    }
}
