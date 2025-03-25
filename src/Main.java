public class Main {
    public static void main(String[] args) {
        Animal monkey = new Animal("Oo-oo ahh-ahh!");
        monkey.speak();

        Cat orange = new Cat();
        System.out.println(orange.getHealth());

        Cat[] kitties = new Cat[5];

        kitties[0] = new Cat("Orange");
        kitties[1] = new Cat("Tuxedo");
        kitties[2] = new Cat("White");
        kitties[3] = new Cat("Black");
        kitties[4] = new Cat("Tabby");

        printCats(kitties);


    }

    public static void printCats(Cat[] cats) {
        for (Cat cat : cats) {
            System.out.println(cat.getColor());
        }
    }
}