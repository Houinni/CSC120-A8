
    /**
 * The TestSuperhero class tests the Superhero class by calling its methods
 * and verifying its functionality.
 */
public class Testing {
    
    public static void main(String[] args) {
        // Create a new Superhero instance
        Superhero hero = new Superhero("Spiderman");
        
        // Test grab method
        hero.grab("shield");
        
        // Test drop method
        String droppedItem = hero.drop("shield");
        System.out.println("Dropped item: " + droppedItem);
        
        // Test examine method
        hero.examine("map");
        
        // Test use method
        hero.use("power ring");
        
        // Test walk method
        boolean walked = hero.walk("north");
        System.out.println("Walked successfully: " + walked);
        
        // Test fly method
        boolean flew = hero.fly(10, 20);
        System.out.println("Flew successfully: " + flew);
        System.out.println(hero.getPosition());
        
        // Test shrink method
        Number newSize = hero.shrink();
        System.out.println("New size after shrinking: " + newSize);
        Number certainSize = hero.shrink(1);
        System.out.println("New certain size after shrinking: " + certainSize);

        // Test grow method
        newSize = hero.grow();
        System.out.println("New size after growing: " + newSize);
        certainSize = hero.grow(1);
        System.out.println("New size after growing: " + certainSize);

        // Test rest method
        hero.rest();
        
        // Test undo method
        hero.undo();
    }
}

