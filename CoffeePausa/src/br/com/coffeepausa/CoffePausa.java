package br.com.coffeepausa;

import java.util.Scanner;

import br.com.coffeepausa.cardapio.Cafe;
import br.com.coffeepausa.cardapio.cafecomleite.Cappuccino;
import br.com.coffeepausa.cardapio.cafecomleite.CaramelMacchiato;
import br.com.coffeepausa.cardapio.cafeespecial.FlatWhite;
import br.com.coffeepausa.cardapio.cafeespecial.VanillaLatte;
import br.com.coffeepausa.cardapio.cafegelado.IcedCoffee;
import br.com.coffeepausa.cardapio.cafegelado.IcedLatte;
import br.com.coffeepausa.cardapio.expresso.Americano;
import br.com.coffeepausa.cardapio.expresso.ExpressoDuplo;

public class CoffePausa {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("\nSeja bem-vindo a CoffeePausa, qual categoria de café você deseja saborear hoje?\n");
      System.out.println("Se sua escolha for 'Expresso' - Digite (1)");
      System.out.println("Se sua escolha for 'Café com Leite' - Digite (2)");
      System.out.println("Se sua escolha for 'Café Especial' - Digite (3)");
      System.out.println("Se sua escolha for 'Café Gelado' - Digite (4)\n");

      int categoria = scanner.nextInt();

      Cafe cafeEscolhido = null;

      cafeEscolhido = switch (categoria) {
         case 1 -> {
             System.out.println("\nEscolha o tipo de Expresso:");
             System.out.println("1. Expresso Duplo");
             System.out.println("2. Americano\n");
             int tipoExpresso = scanner.nextInt();
             yield (tipoExpresso == 1) ? new ExpressoDuplo() : (tipoExpresso == 2) ? new Americano() : null;
         }
         case 2 -> {
             System.out.println("\nEscolha o tipo de Café com Leite:");
             System.out.println("1. Cappuccino");
             System.out.println("2. Flat White\n");
             int tipoCafeLeite = scanner.nextInt();
             yield (tipoCafeLeite == 1) ? new Cappuccino() : (tipoCafeLeite == 2) ? new FlatWhite() : null;
         }
         case 3 -> {
             System.out.println("\nEscolha o tipo de Café Especial:");
             System.out.println("1. Caramel Macchiato");
             System.out.println("2. Vanilla Latte\n");
             int tipoCafeEspecial = scanner.nextInt();
             yield (tipoCafeEspecial == 1) ? new CaramelMacchiato() : (tipoCafeEspecial == 2) ? new VanillaLatte() : null;
         }
         case 4 -> {
             System.out.println("\nEscolha o tipo de Café Gelado:");
             System.out.println("1. Iced Coffee");
             System.out.println("2. Iced Latte\n");
             int tipoCafeGelado = scanner.nextInt();
             yield (tipoCafeGelado == 1) ? new IcedCoffee() : (tipoCafeGelado == 2) ? new IcedLatte() : null;
         }
         default -> {
             System.out.println("\nCategoria inválida.");
             yield null;
         }
     };

      if (cafeEscolhido != null) {
         System.out.println("\nVocê escolheu: " + cafeEscolhido.getCategoria() + " - R$" + cafeEscolhido.getPreco());
         cafeEscolhido.Preparo();
     } else {
         System.out.println("\nTipo de café inválido.");
     }

      scanner.close();
   }
}
