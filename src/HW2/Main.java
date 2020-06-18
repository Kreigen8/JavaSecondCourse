package HW2;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        try {
            String[][] nums = {
                    {"4", "56", "5", "boobs"},
                    {"4", "8", "15", "16"},
                    {"23", "42", "6", "1"},
                    {"2", "3", "4" ,"5"}
            };
//            nums[1][5] = "123";
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    try {
                        x = x + Integer.valueOf(nums[i][j]);
                    } catch (NumberFormatException e) {
                        System.out.printf("Неверный формат данных в ячейке: %d %d\n", i, j);
                    }
                }
            }
        } catch (NegativeArraySizeException e) {
            System.out.println("MyArraySizeException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индексации массива: " + e);
        }
        System.out.println("Sum = " + x);
    }
}
