package com.example.project;

public class Day3 {
      public static String[][] generateSnowflake(int size) { //you will be tested on this method
        String[][] grid = new String[size][size];
        // sets spaces in the entire grid
        for (int i = 0; i < size; i++) {
          for (int j = 0; j < size; j++) {
            grid[i][j] = " ";
          }
        }

        int center = size / 2;
        for (int i = 0; i < size; i++) {
          // middle column
          grid[i][center] = "*";
          //middle row 
          grid[center][i] = "*";
        }

        for (int i = 0; i < size; i++) {
          // diagonal down right
          grid[i][i] = "*";
          // diagonal down left
          grid[i][size - 1 - i] = "*";
        }

        return grid;
    }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
        
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
    }
}
