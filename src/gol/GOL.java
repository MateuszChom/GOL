/*
Just Game of life that you are putting "living beings" into map
and those things trying to live how long they can
 */
package gol;

/**
 *
 * @author Mateusz
 */
public class GOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GameOfLife life = new GameOfLife();
        life.setLocationRelativeTo(null);
        life.show();
    }
    
}
