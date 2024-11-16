/**
 * The Superhero class represents a superhero character that implements various 
 * abilities defined by the Contract interface.
 */
public class Superhero implements Contract {
    
    private String name;
    private int size; // size factor representing the superhero's size level
    private int xPosition; // x-coordinate position
    private int yPosition; // y-coordinate position
    
    /**
     * Constructor to initialize the superhero with a name.
     * @param name the name of the superhero
     */
    public Superhero(String name) {
        this.name = name;
        this.size = 1; 
        this.xPosition = 0;
        this.yPosition = 0;
    }
    
    /**
     * Grab an item.
     * @param item the item to grab
     */
    @Override
    public void grab(String item) {
        System.out.println(name + " grabs " + item + " heroically!");
    }

    /**
     * Drop an item.
     * @param item the item to drop
     * @return a message indicating the item was dropped
     */
    @Override
    public String drop(String item) {
        System.out.println(name + " drops " + item + " carefully.");
        return item + " dropped";
    }

    /**
     * Examine an item.
     * @param item the item to examine
     */
    @Override
    public void examine(String item) {
        System.out.println(name + " examines " + item + " closely.");
    }

    /**
     * Use an item.
     * @param item the item to use
     */
    @Override
    public void use(String item) {
        System.out.println(name + " uses " + item + " to save the day!");
    }

    /**
     * Walk in a specified direction.
     * @param direction the direction to walk
     * @return true if walking was successful
     */
    @Override
    public boolean walk(String direction) {
        System.out.println(name + " walks towards the " + direction + ".");
        return true;
    }

    /**
     * Fly to a specified (x, y) coordinate.
     * @param x the x-coordinate
     * @param y the y-coordinate
     * @return true if flying was successful
     */
    @Override
    public boolean fly(int x, int y) {
        System.out.println(name + " flies to coordinates (" + x + ", " + y + ").");
        this.xPosition = x;
        this.yPosition = y;
        return true;
    }

    /**
     * Shrink the superhero.
     * @return the new size after shrinking
     */
    @Override
    public Number shrink() {
        size--;
        System.out.println(name + " shrinks to size " + size + ".");
        return size;
    }

    /**
     * Grow the superhero.
     * @return the new size after growing
     */
    @Override
    public Number grow() {
        size++;
        System.out.println(name + " grows to size " + size + ".");
        return size;
    }

    /**
     * Rest to regain strength.
     */
    @Override
    public void rest() {
        System.out.println(name + " rests to regain strength.");
    }

    /**
     * Undo the last action.
     */
    @Override
    public void undo() {
        System.out.println(name + " undoes the last heroic action.");
    }
    
    /**
     * Get the current position of the superhero.
     * @return a string representing the current position
     */
    public String getPosition() {
        return "Current position: (" + xPosition + ", " + yPosition + ")";
    }
}
