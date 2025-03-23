public class Cat extends Animal {
    public Cat() {
        super(50, 4, "Meow!");  // use the Super Constructor
    }

    @Override
    public void speak() {
        System.out.print(getSound());
    }
}
