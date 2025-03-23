import java.awt.color.ICC_ColorSpace;

public class Animal {
    private int health;
    private int numLegs;
    private String sound;
    public void speak() {
        System.out.print(sound+"\n");
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int _health) {        // We can use this underscore notation to differentiate between the argument and the class member
        health = _health;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {        // We cab alternatively use 'this' keyword to specify the object member
        this.sound = sound;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int _numLegs) {
        this.numLegs = _numLegs;
    }

    public Animal() {
        health = 100;
        numLegs = 4;
        sound = "";
    }
    public Animal(int _health, int _numLegs, String _sound) {
        health = _health;
        numLegs = _numLegs;
        sound = _sound;
    }

    public Animal(String _sound) {
        sound = _sound;
    }
}
