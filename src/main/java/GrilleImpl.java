/**
 * Implementation d'une grille.
 */
public class GrilleImpl implements Grille {
    private int x;
    private int y;
    private char[][] tableau;

    /**
     * Constructeur.
     * @param taille La taille de la grille
     */
    public GrilleImpl(int taille) {
        this.x = taille;
        this.y = taille;
        this.tableau = new char[taille][taille];
        for (int row = 0; row < this.tableau.length; row++) {
            for (int col = 0; col < this.tableau[row].length; col++) {
                this.tableau[row][col] = EMPTY;
            }
        }
    }

    @Override
    public int getDimension() {
        return this.x;
    }

    @Override
    public void setValue(int x, int y, char value) throws IllegalArgumentException {
        if (this.possible(x, y, value)) {
            this.tableau[x][y] = value;
        } else {
            throw new IllegalArgumentException("Valeur pas possible.");
        }
    }

    @Override
    public char getValue(int x, int y) throws IllegalArgumentException {
        if (x > this.x || y > this.y) {
            throw new IllegalArgumentException("Valeur pas possible.");
        }
        return this.tableau[x][y];
    }

    @Override
    public boolean complete() {
        boolean isComplete = true;
        for (int row = 0; row < this.tableau.length; row++) {
            for (int col = 0; col < this.tableau[row].length; col++) {
                if (this.tableau[row][col] == EMPTY) {
                    isComplete = false;
                }
            }
        }
        return isComplete;
    }

    @Override
    public boolean possible(int x, int y, char value) throws IllegalArgumentException {
        boolean isPossible = true;
        if (x > this.x || y > this.y) {
            throw new IllegalArgumentException("Valeur x ou y invalide.");
        }
        boolean IsCharFound = false;
        for (int row = 0; row < possible.length; row++) {
            if (possible[row] == value) {
                IsCharFound = true;
            }
        }
        if (!IsCharFound) {
            throw new IllegalArgumentException("Valeur invalide.");
        }
        for (int row = 0; row < this.tableau.length; row++) {
            if (this.tableau[row][y] == value) {
                isPossible = false;
            }
        }
        for (int col = 0; col < this.tableau.length; col++) {
            if (this.tableau[x][col] == value) {
                isPossible = false;
            }
        }
        return isPossible;
    }
}
