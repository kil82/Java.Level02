
public class MainClass {
    static class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        String[][] testArray = new String[][]{{"1", "2", "3", "5"}, {"3", "4", "7", "2"}, {"6", "2", "t", "15"}, {"6", "2", "23", "45"}};
        workWithArray(testArray);
    }

    public static void workWithArray(String[][] arrayString) {
        int sum = 0;
        try {
            if (arrayString.length != 4) throw new MyArraySizeException("Неверный размер массива (по строкам)");
            for (int i = 0; i < arrayString.length; i++) {
                if (arrayString[i].length != 4) throw new MyArraySizeException("Неверный размер массива (по столбцам)");
                for (int j = 0; j < arrayString[i].length; j++) {
                    if (!arrayString[i][j].matches("\\d+")) {
                        throw new MyArrayDataException("Неверное значение в ячейке [" + i + "][" + j + "] = " + arrayString[i][j]);
                    }
                    sum += Integer.parseInt(arrayString[i][j]);
                }
            }
            System.out.println("Результат расчета " + sum);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e1) {
            e1.printStackTrace();
        }
    }
}
