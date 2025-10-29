package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        // A expressão lambda (p -> p.getName().toUpperCase()) indica que
        // para cada objeto Product 'p', o critério de comparação será
        // o nome em letras maiúsculas. O Comparator.comparing recebe essa
        // função e a utiliza para ordenar a lista alfabeticamente
        // ignorando diferenças entre maiúsculas e minúsculas.

        list.sort(Comparator.comparing(p -> p.getName().toUpperCase()));

        for (Product p : list){
            System.out.println(p);
        }
    }
}
