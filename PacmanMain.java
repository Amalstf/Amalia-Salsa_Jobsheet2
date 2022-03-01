package pacmanmain;

/**
 *
 * @author Hp
 */
public class PacmanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pacman p1 = new Pacman();
        p1.moveLeft(2);
        p1.moveRight(0);
        p1.moveDown(3);
        p1.moveUp(5);

       p1.printPotition();
    
    }
    
}
