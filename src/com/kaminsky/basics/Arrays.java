package com.kaminsky.basics;

public class Arrays {
    public static void main(String[] args) {

        // ONE-DIMENSIONAL ARRAYS
        // type var-name[];
        // type[] var-name;

        int[] month_days;
        // OR
        int[] month_days3 = new int[5];

        // new is a special operator that allocates memory
        // array-var = new type[size];


        month_days = new int[12]; // elements in the array are initialized to zero (null for the reference type)

        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;

        System.out.println("April has " + month_days[3] + " days");

        // This is how you check a size of the array
        System.out.println("Size of the array: " + month_days.length);

        // Array can be initialized when they are declared

        int[] month_days2 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // MULTIDIMENSIONAL ARRAYS

        int[][] twoD = new int[4][5];

        int i,j,k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

        for (i = 0; i < 4 ; i++) {
            for (j = 0; j < 5 ; j++) {
                System.out.print(twoD[i][j] + " ");
                System.out.println();
            }
        }

        // When allocating memory for multidimensional arrays you need only specify
        // the memory for the first (leftmost) dimension - example:

        int[][] array2 = new int[4][];
        array2[0] = new int[5];
        array2[1] = new int[5];
        array2[2] = new int[5];
        array2[4] = new int[5];

        int[][] array3 = new int[4][];
        array2[0] = new int[1];
        array2[1] = new int[2];
        array2[2] = new int[3];
        array2[4] = new int[4];

        int[][] m =
                {
                        {0 * 0, 1 * 0, 2 * 0, 3 * 0},
                        {0 * 1, 1 * 1, 2 * 1, 3 * 1},
                        {0 * 2, 1 * 2, 2 * 2, 3 * 2},
                        {0 * 3, 1 * 3, 2 * 3, 3 * 3}
                };


    }
}
