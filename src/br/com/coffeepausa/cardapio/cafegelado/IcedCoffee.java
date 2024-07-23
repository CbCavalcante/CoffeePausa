package br.com.coffeepausa.cardapio.cafegelado;

import br.com.coffeepausa.cardapio.Cafe;

public class IcedCoffee extends Cafe{

    public IcedCoffee() {
        super("Iced Coffee", 4.50);
    }

    @Override
    public void Preparo(){
        System.out.println("Pedido de um 'Iced Coffee' recebido, ótima escolha!. Aguarde o preparo");
    }
}
