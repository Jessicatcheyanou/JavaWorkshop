package main.chapter15;
/*Using the Stream API*/
/*To calculate price of articles in a Shopping Cart*/

import java.util.List;
import java.util.stream.Stream;

public class Exercise1 {

    private static final class ShoppingArticle{
        final String name;
        final  double price;

        public ShoppingArticle(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }
    private static final class ShoppingCart{
        final List<ShoppingArticle> myArticles;

        /*in this version,we will only allow one item per article in the cart*/
        public ShoppingCart(List<ShoppingArticle> list) {
            myArticles = List.copyOf(list);
        }
    }

    /*implement a new function that will calculate the total price of items in the Shopping Cart*/
    private static double calculatePrice(ShoppingCart... carts){
        /*Build a pipeline starting with a stream of all of the carts*/
        return Stream.of(carts)
                /*ADD A flatMap oeration to extract a single stream of ShoppingArticles for all Shopping Carts*/
                .flatMap((shoppingCart) -> {return shoppingCart.myArticles.stream();})
                /*Extract the price for each ShoppingArticle using the MapToDouble operation,this will create DoubleStream*/
                        .mapToDouble((item) -> {return item.price;})
                /*Finally reduce the prices f all ShoppingArticles to a sum,using the sum() method that is available in DoubleStream()*/
                          .sum();

    }

    public static void main(String[] args) {
        /*create your 4 ShoppingCarts,fruitcart,dressCart,sweetCart and meatAndFoshCart*/
        ShoppingCart dressCart = new ShoppingCart(List.of(
                new ShoppingArticle("Bra",500.0),
                new ShoppingArticle("trousers",2000.5),
                new ShoppingArticle("pants",500)
        ));
        ShoppingCart fruitCart = new ShoppingCart(List.of(
                new ShoppingArticle("banana",100.3),
                new ShoppingArticle("guava",50.2),
                new ShoppingArticle("cherry",50.4)
        ));
        ShoppingCart sweetsCart = new ShoppingCart(List.of(
                new ShoppingArticle("bonbon",100.8),
                new ShoppingArticle("chocolates",200.7),
                new ShoppingArticle("jako",500.3)
        ));
        ShoppingCart mewtAndFishCart = new ShoppingCart(List.of(
                new ShoppingArticle("bar",1500.25),
                new ShoppingArticle("cow",3000.56),
                new ShoppingArticle("sol",1800.25)
        ));

        /*Apply the calculatePrice function to my ShoppingCart class and then print the resutting sum*/

        double sum = calculatePrice(fruitCart,mewtAndFishCart,sweetsCart,dressCart);
        System.out.println(String.format("Sum: %.2f", sum));

    }
}
