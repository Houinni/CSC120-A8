

public class Testing {
    
    public static void main(String[] args) {
        Superhero hero = new Superhero("Spiderman");
        
      
        hero.grab("shield");

        String droppedItem = hero.drop("shield");
        System.out.println("Dropped item: " + droppedItem);
        
        hero.examine("map");
        
        hero.use("power ring");
        
        boolean walked = hero.walk("north");
        System.out.println("Walked successfully: " + walked);
        
        boolean flew = hero.fly(10, 20);
        System.out.println("Flew successfully: " + flew);
        System.out.println(hero.getPosition());
        
        Number newSize = hero.shrink();
        System.out.println("New size after shrinking: " + newSize);
        Number certainSize = hero.shrink(1);
        System.out.println("New certain size after shrinking: " + certainSize);

        newSize = hero.grow();
        System.out.println("New size after growing: " + newSize);
        certainSize = hero.grow(1);
        System.out.println("New size after growing: " + certainSize);

        hero.rest();
        
        hero.undo();
    }
}

