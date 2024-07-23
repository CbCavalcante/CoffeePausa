package br.com.coffeepausa.cardapio.cafegelado;

import br.com.coffeepausa.cardapio.Cafe;

public class IcedLatte extends Cafe{

    public IcedLatte() {
        super("Iced Latte", 4.50);
    }

    @Override
    public void Preparo(){
        System.out.println("Pedido de um 'Iced Latte' recebido, ótima escolha!. Aguarde o preparo");
    }
}
