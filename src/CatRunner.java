import java.util.ArrayList;

public class CatRunner {
    public static void main (String[] args){
        ArrayList<Cat> cats = new ArrayList<>();

        Cat cat1 = new Cat("Macha");
        Cat cat2 = new Cat("Boba");
        Cat cat3 = new Cat("Taro");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);

        Cat cat4 = new Cat("Tiger");
        Cat replaced = cats.set(2, cat4);
        System.out.println(cats);
        System.out.println(replaced);

        cat4.setName(cat4.getName() + " Meow");
        System.out.println(cats);
        System.out.println(cat4);

        for(int i = 0; i < cats.size(); i++){
            cats.get(i).setName(cats.get(i).getName().toUpperCase());
        }
        System.out.println(cats);


    }
}
