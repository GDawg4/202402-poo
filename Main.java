import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static int[][] addNumber(int x, int y, int[][] board, int number){
        int[][] newBoard = board;
        newBoard[y][x] = number;
        return newBoard;
    }

    public static String printBoard(int[][] board){
        String boardString = "";
        for (int[] row : board){
            for (int cell : row){
                boardString += cell;
                boardString += " ";
            }
            boardString += "\n";
        }
        return boardString;
    }

    public static boolean isValidMove(int[][] board, int x, int y, int previousX, int previousY){
        System.out.println("Checking " + x + y + previousX + previousY);
        if (board[y][x] != 0 | (x == previousX && y == previousY)){
            return false;
        }
        if (x == previousX | y == previousY){
            return true;
        }
        return false;
    }

    public static boolean isDone(int[][] board, int x, int y){
        for (int i = 0; i < 6; i++){
            if (i == y){
                for (int cell: board[i]){
                    if (cell == 0){
                        return false;
                    }
                }
            }
            if (board[i][x] == 0){
                return false;
            }
        }
        return true;
    }
    public static int sumar(int a, int b){
        return a+b;
    }
    public static int[] double(int[] lista){
        int a = 3;
        String b = "abc";
        a + b;
        return
    }
    public static void main(String[] args) {
        int[] mi_lista = {1,2,3,4};
        for (int i : mi_lista){
            System.out.println(i);
        }
        int contador = 0;
        while (contador < 10){
            System.out.println("Funcionando");
            contador++;
        }
        
        return;
    }
}