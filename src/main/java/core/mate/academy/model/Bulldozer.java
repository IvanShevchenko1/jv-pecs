package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bulldoziness;

    public Bulldozer() {
    }

    public Bulldozer(String name,String color, int number) {
        setName(name);
        setColor(color);
        this.bulldoziness = number;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
