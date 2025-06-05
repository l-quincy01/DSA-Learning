public class DiamondShape {

    public static void main(String[] args) {
        int sizeofShape = 7; // Example size for testing
        int xCentre = 76; // Example x coordinate for center
        int yCentre = 6; // Example y coordinate for center

        printDiamond(sizeofShape, xCentre, yCentre);
    }

    public static void printDiamond(int sizeofShape, int xCentre, int yCentre) {
        // Validate input
        if (sizeofShape < 2 || sizeofShape > 9 || xCentre < 1 || xCentre > 79 || yCentre < 1 || yCentre > 25) {
            System.out.println("Invalid parameters.");
            return;
        }

        // Initialize the background grid
        char[][] grid = new char[25][79];
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 79; j++) {
                grid[i][j] = '=';
            }
        }

        // Add the numeric markers for every 10th column and row
        for (int col = 9; col < 79; col += 10) {
            grid[0][col] = (char) ('0' + (col / 10 + 1) % 10);
        }
        for (int row = 9; row < 25; row += 10) {
            grid[row][0] = (char) ('0' + (row / 10 + 1) % 10);
        }

        // Place the diamond shape on the grid
        int halfSize = sizeofShape - 1;
        for (int dy = -halfSize; dy <= halfSize; dy++) {
            int row = yCentre - 1 + dy; // Adjust for 0-indexing
            int rowWidth = halfSize - Math.abs(dy);
            for (int dx = -rowWidth; dx <= rowWidth; dx++) {
                int col = xCentre - 1 + dx; // Adjust for 0-indexing
                if (row >= 0 && row < 25 && col >= 0 && col < 79) {
                    grid[row][col] = '$';
                }
            }
        }

        // Print the grid
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 79; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}
