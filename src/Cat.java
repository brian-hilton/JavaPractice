public class Cat extends Animal {
    private String color;
    public Cat() {
        super(50, 4, "Meow!"); // use the Super Constructor
        color = "orange";
    }

    public Cat(String color) {
        super(50, 4, "Meow!");
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public void speak() {
        System.out.print(getSound());
    }
}
