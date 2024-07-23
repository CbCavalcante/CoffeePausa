package br.com.coffeepausa.cardapio.cafeespecial;

import br.com.coffeepausa.cardapio.Cafe;

public class VanillaLatte extends Cafe{

    public VanillaLatte() {
        super("Vanilla Latte", 4.89);
    }

    @Override
    public void Preparo(){
        System.out.println("Pedido de um 'Vanilla Latte' recebido, ótima escolha!. Aguarde o preparo");
    }
}
