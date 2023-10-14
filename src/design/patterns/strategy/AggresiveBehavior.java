package design.patterns.strategy;

public class AggresiveBehavior implements Behavior {
    @Override
    public void move() {
        System.out.println("Moving aggressively...");
    }

}
