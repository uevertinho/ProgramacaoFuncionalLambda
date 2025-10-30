package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {

    //função que recebe dois produtos e retorna a comparação de preço deles
    public static int compareProducts(Product p1, Product p2){
        return p1.getPrice().compareTo(p2.getPrice());
    }

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        //a chamada do metodo 'sort' que ordena a lista
        //eu posso passar a referência para função compareProducts
        // '::' é a sintaxe do java
        //na programação funcional, eu posso passar
        //uma função como argumento de outra função
        //isso significa eu falar que uma função
        //é um objeto de primeira classe ou primeira ordem
        //ele pode ser passado como argumento para outras funções
        //e ele pode ainda ser retornado por uma função.
        list.sort(Program::compareProducts);

        list.forEach(System.out::println);
    }
}
