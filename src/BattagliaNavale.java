import java.util.Scanner;

public class BattagliaNavale {
    final static int GRID_SIZE = 5;
    final static char WATER_CHAR = '~';
    final static char SHIP_CHAR = 'S';

    // commands potrebbe essere un array di comandi
    final static String commands = "Comandi: ATTACCA, STAMPA, AIUTO, ESCI";

    public static void main(String[] args) {
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);
        char[][] playerHumanGrid = createGrid();
        int[][] humanCoordinates = {{1,1}, {1,2}, {1,3}};

        placeShips(playerHumanGrid, humanCoordinates);

        // !gameOver corrisponde a gameOver == false
        while(!gameOver){
            System.out.println(commands);
            String playerCommand = scanner.nextLine().toUpperCase();

            switch (playerCommand){
                case "ATTACCA":
                    playHumanTurn(playerHumanGrid, scanner);
                    break;
                case "STAMPA":
                    printGrid(playerHumanGrid);
                    break;
                case "AIUTO":
                    System.out.println(commands); //TODO: Creare metodo ad hoc
                    break;
                case "ESCI":
                    gameOver = true;
                    break;
                default:
                    System.out.println("Comando non riconosciuto");
            }

        }

        scanner.close();

        printGrid(playerHumanGrid);
    }

    private static char[][] createGrid() {
        char[][] grid = new char[GRID_SIZE][GRID_SIZE];

        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                grid[i][j] = WATER_CHAR;
            }
        }

        return grid;
    }

    // TODO: Controllo se coordinate fuori griglia (metodo a parte)
    private static void placeShips(char[][] grid,  int[][] shipCoordinates){
        for(int[] coordinates : shipCoordinates){
            grid[coordinates[0]][coordinates[1]] = SHIP_CHAR;
        }
    }
    // TODO: Stampare i numeri delle coordinate su righe/colonne
    private static void printGrid(char[][] grid) {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                System.out.print(grid[i][j] + " ");
            }

            System.out.println();
        }
    }

    private static boolean playHumanTurn(char[][] grid, Scanner scanner){
        System.out.println("***** TURNO GIOCATORE *****");
        System.out.println("Inserisci riga (0-" + (GRID_SIZE-1) + ")"); //TODO: max deve essere da parametro
        int row = scanner.nextInt();
        System.out.println(row);


        return false; // TODO da finire
    }
}