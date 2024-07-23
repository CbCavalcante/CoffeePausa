package br.com.coffeepausa.cardapio.cafecomleite;

import br.com.coffeepausa.cardapio.Cafe;

public class CaramelMacchiato extends Cafe{

    public CaramelMacchiato() {
        super("Caramel Macchiato", 4.89);
    }

    @Override
    public void Preparo(){
        System.out.println("Pedido de um 'Caramel Macchiato' recebido, ótima escolha!. Aguarde o preparo");
    }
}
