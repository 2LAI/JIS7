package homework.lectures.lecture5.task1;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductDemo {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final Logger log = Logger.getLogger(ProductDemo.class);

    public static void main(String[] args) throws IOException {
        Product product = createProduct();
        actualPrice(product);
        printInformation(product);
    }

    private static Product createProduct() throws IOException {
        log.info("Enter name of product");
        String nameOfProduct = reader.readLine();
        Product product = new Product(nameOfProduct);

        log.info("Enter regular price: ");
        double regularPriceOfProduct = Double.parseDouble(reader.readLine());
        product.setRegularPrice(regularPriceOfProduct);

        log.info("Enter discount without %: ");
        double discountPriceOfProduct = Double.parseDouble(reader.readLine());
        product.setDiscount(discountPriceOfProduct);
        return product;
    }

    private static void printInformation(Product product) {
        log.info(product.toString());
        log.info("Price with discount: ");
        log.info(product.getActualPrice());
    }

    private static void actualPrice(Product product) {
        product.setActualPrice(product.getRegularPrice() - ((product.getDiscount() / 100) * product.getRegularPrice()));
    }
}
