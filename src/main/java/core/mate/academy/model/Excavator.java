package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int size;

    public Excavator() {
    }

    public Excavator(String name, String color, int size) {
        setName(name);
        setColor(color);
        this.size = size;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
