import algoritmi.Customer;
import algoritmi.Order;
import algoritmi.Product;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creazione di alcuni prodotti
        Product book = new Product(1L, "The Great Gatsby", "Books", 150.0);
        Product toy = new Product(2L, "Lego Set", "Toys", 50.0);
        Product babyProduct = new Product(3L, "Baby Shampoo", "Baby", 25.0);

        // Creazione di un cliente
        Customer customer = new Customer(1L, "Mario Rossi", 2);

        // Creazione di un ordine con i prodotti
        List<Product> productList = Arrays.asList(book, toy, babyProduct);
        Order order = new Order(1L, "Shipped", LocalDate.of(2021, 2, 15), LocalDate.of(2021, 2, 20), productList, customer);

        // Stampa dei dettagli del cliente
        System.out.println("Dettagli cliente: " + customer);

        // Stampa dei prodotti nell'ordine
        System.out.println("Prodotti nell'ordine:");
        for (Product product : order.getProducts()) {
            System.out.println(product);
        }

        // Stampa dei dettagli dell'ordine
        System.out.println("Dettagli ordine: " + order);
    }
}
