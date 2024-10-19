public class Main {
    public static void main(String[] args) {
        // Таблица а
        System.out.println("а)");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(5 + " ");
            }
            System.out.println();
        }

        // Таблица б
        System.out.println("\nб)");
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Таблица в
        System.out.println("\nв)");
        int start = 41;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(start + j + " ");
            }
            start += 10;
            System.out.println();
        }
    }
}
