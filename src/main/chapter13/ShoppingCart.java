package main.chapter13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCart {

    public static void main(String[] args) {
     List<ShoppingItem> book = new ArrayList<>();

        book.add(new ShoppingItem("rice",420));
        book.add(new ShoppingItem("books",780));

        List<ShoppingItem> immutableList = List.copyOf(book);
        List<ShoppingItem> unmodifiableCopy = Collections.unmodifiableList(book);


        System.out.println(immutableList);
        System.out.println(unmodifiableCopy);

        book.remove(0);

        System.out.println(immutableList);
        System.out.println(unmodifiableCopy);



    }

    public static final class ShoppingCarts{
        public final List<ShoppingItem> mShoppingList;

          //Shopping Cart containing list of items
        public ShoppingCarts(List<ShoppingItem> list){

            mShoppingList = Collections.unmodifiableList(list);
        }

        //add item in Shopping cart
        public ShoppingCarts addItem(ShoppingItem item){
            List<ShoppingItem> newList = new ArrayList<>(mShoppingList);
            newList.add(item);

            return new ShoppingCarts(newList);
        }

        //remove item from Shopping cart
        public ShoppingCarts removeItem(ShoppingItem item){
            List<ShoppingItem> newList = new ArrayList<>(mShoppingList);
            newList.remove(item);

            return new ShoppingCarts(newList);
        }

        public String toString(){
            StringBuilder sb = new StringBuilder("Cart:");
            for (ShoppingItem item : mShoppingList) {
                sb.append(item).append(",");
            }
            return sb.toString();
        }

    }

    private static final class ShoppingItem{
        private final String name;
        private final int price;

        public ShoppingItem(String name,int price){
            this.name = name;
            this.price = price;
        }

        public String toString(){
            return name + "" + price;
        }
    }
}
