// 18. Write a Java program to create a class called "Restaurant" with attributes for menu items, prices, and ratings, and methods to add and remove items, and to calculate average rating.
import java.util.*;
class Item{
    String name;
    int price;
    int rating;

    Item(String name,int price,int rating)
    {
        this.name=name;
        this.price=price;
        this.rating=rating;
    }
}
class Restaurant{
    private ArrayList<Item> items=new ArrayList<>();

    void addItem(String item,int price, int rating)
    {   
        items.add(new Item(item, price, rating));
    }
    void removeItem(String item)
    {
        for(int i=0;i<items.size();i++)
        {
            if(items.get(i).name==item){
                items.remove(i);
            }
        }
    }

    void displayItems(){
        for(int i=0;i<items.size();i++)
        {
            System.out.print(items.get(i).name+" "+items.get(i).price+" "+items.get(i).rating);
            System.out.println("");
        }
    }
}
public class oop3 {
    public static void main(String[] args) {
        Restaurant dhaba=new Restaurant();
        dhaba.addItem("Panner", 100,5);
        dhaba.addItem("dal", 130,3);
        dhaba.addItem("CHicken", 220,4);
        dhaba.displayItems();
        dhaba.removeItem("Panner");
        System.out.println("After removal");
        dhaba.displayItems();
    }
}
