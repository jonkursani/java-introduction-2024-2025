package java_13;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // Matrica ose vargu dy dimensional
        int[][] numbers = new int[2][2]; // [rreshti][kolona]
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[1][0] = 3;
        numbers[1][1] = 4;

        System.out.println("Vlera ne poziten [1][1]: " + numbers[1][1]);

        int[][] numbers2 = {
                {4, 3},
                {2, 1}
        };

        System.out.println("Vlera ne poziten [1][0]: " + numbers2[1][0]);

        // Jagged array
        int[][] numbers3 = new int[2][];
        numbers3[0] = new int[3];
        numbers3[1] = new int[] {1, 2, 3, 4};


        // Printimi i vlerave te matrices
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                System.out.printf("[%d][%d]: %d    ", i, j, numbers[i][j]);
            }
            System.out.println();
        }

        // Foreach
        for (int[] myArray : numbers) {
            for (int element : myArray) {
                System.out.print(element + " ");
            }

            System.out.println();
        }
    }
}
