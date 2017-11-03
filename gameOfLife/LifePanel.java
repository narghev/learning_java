import javax.swing.JPanel;

import java.awt.FlowLayout;

import java.util.Vector;
import java.lang.Throwable;

public class LifePanel extends JPanel {

    public LifeButton[][] cells;

    private int size;

    public LifePanel(int n){
        super();

        size = n;

        setLayout(new FlowLayout());

        cells = new LifeButton[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                cells[i][j] = new LifeButton();
                add(cells[i][j]);
            }
        }
    }

    private Vector getNeighborsStatus(int i, int j){
        Vector<Boolean> neighbors = new Vector<Boolean>(3,1);

        int iPrevious = i-1;
        int iNext = i+1;
        int jPrevious = j-1;
        int jNext = j+1;

        int[][] neighborIndexes = new int[][]{
            {iPrevious, jPrevious},
            {iPrevious, j},
            {iPrevious, jNext},
            {i, jPrevious},
            {i, jNext},
            {iNext, jPrevious},
            {iNext, j},
            {iNext, jNext}
        };

        for (int[] pair : neighborIndexes){
            try {
                neighbors.add(cells[pair[0]][pair[1]].isAlive());
            } catch (Throwable exeption){}
        }

        return neighbors;
    }

    private boolean alive(LifeButton currentCell, Vector neighborsStatus){
        int aliveNeighbors = 0;

        for (Object isNeighborAlive : neighborsStatus)
            aliveNeighbors += (Boolean)isNeighborAlive ? 1 : 0;
    
        if (currentCell.isAlive()){
            if (aliveNeighbors < 2)
                return false;
            else if (aliveNeighbors <= 3)
                return true;
            else
                return false;
        }
        else {
            if (aliveNeighbors == 3)
                return true;
        }

        return currentCell.isAlive();
    }

    public void handleClick(){

        Boolean[][] cellsNewStatus = new Boolean[size][size];

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                Vector neighborsStatus = getNeighborsStatus(i,j);
                cellsNewStatus[i][j] = alive(cells[i][j], neighborsStatus);
            }
        }

        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                cells[i][j].setAlive(cellsNewStatus[i][j]);

    }
}