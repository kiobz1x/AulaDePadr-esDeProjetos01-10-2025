package org.example.exercicio4;

public class Avestruz extends AveQueNaoVoa {

    public void voar(){
        throw new UnsupportedOperationException("Avestruzes não podem voar");
    }
}
