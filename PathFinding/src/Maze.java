import java.awt.*;

/**
 * Created by qinusty on 09/02/16.
 */
public class Maze {
    /**
     * A Two dimensional array of booleans where true is a traversable coordinate.
     */
    private boolean[][] coordinates;
    private Point pos = new Point(0, 0);

    public Maze(int w) {
        coordinates = new boolean[w][w];
    }

    public void initMaze() {

    }

    public Point[] possibleMoves() {
        Point[] surroundingCoords = new Point[] {new Point(pos.x - 1, pos.y),
                                                new Point(pos.x + 1, pos.y),
                                                new Point(pos.x, pos.y - 1),
                                                new Point(pos.x, pos.y + 1) };

        Point[] retList = new Point[4];
        int count = 0;
        for (Point p : surroundingCoords) {
            if (coordinates[p.x][p.y]) {
                retList[count] = p;
                count ++;
            }
        }
    }


}
