package frogger;

/**
 * Refactor Task 1.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Road {
    private final boolean[] occupied;

    public Road(boolean[] occupied) {
        this.occupied = occupied;
    }

    public boolean[] getOccupied() {
        return this.occupied;
    }

    // Move isOccupied method to Road class
    public boolean isOccupied(int position) {
        return occupied[position];
    }

    // Move isValid method to Road class
    public boolean isValid(int position) {
        return (position >= 0 && position < occupied.length);
    }
}
