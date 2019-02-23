package SortingAlgorithms;

public class Main {
    private static final String RESET = "\033[0m";  // Text Reset
    private static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    private static final String CYAN_BOLD = "\033[1;36m";   // CYAN

    public static void main (String[] args) {

        System.out.println("Size of array ||       10       ||    100   ||   1000  ||  10000 ||  50000 ");
        System.out.println("=================================================================================");

        BUBBLESORT();
        System.out.println("\n================================================================================");

        System.out.println(CYAN_BOLD+"Avarage-----> O(n^2)  Worst-----> O(n^2)  Memory-----> O(1)"+RESET);


    }

    // Bold-+
   /*public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE*/

    static private void BUBBLESORT ( ) {
        System.out.print("Bubble Sort   ||");
        int size;
        for (int i = 1; i <= 5; i++) {
            if (i == 5) {
                size = 50000;
            } else {
                size = (int) Math.pow(10, i);
            }

            int mArray[] = new int[size];


            FileReader file = new FileReader();
            file.readFile(mArray);

            long startTime = System.currentTimeMillis();
            BubleSort sort = new BubleSort();
            sort.bubbleSort(mArray);
            long endTime = System.currentTimeMillis();

            long estimatedTime = endTime - startTime;
            double second = (double) (estimatedTime) / 1000;

            System.out.print("         " + GREEN_BOLD + second + RESET);
        }

    }
}

