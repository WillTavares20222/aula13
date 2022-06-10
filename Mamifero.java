package com.mycompany.aula13;
public class Mamifero extends Animal{
    protected String corPelo;
    
    public void Mamifero(){
        System.out.println("=========Mamifero========");
    }
    @Override
    public void emitirSom() {
        System.out.println(" Som de Mamifero");
    }
}
