package hometask7;

public class ArrayValueCalculator {
    public static final int SIZE_ARRAY_STRINGS = 4;
    public static void main(String[] args){
        String[][] arr = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };
        try {
            System.out.println("Sum of values in this array is: " + doCalc(arr));
        }catch (ArrayDataException e){
            System.out.println(e.getClass().getSimpleName() + ":\n"  + e.getMessage());
            ArrayDataException.printExceptionLog();
        }catch (ArraySizeException e) {
            System.out.println(e.getClass().getSimpleName() + ":\n" + e.getMessage());
        }finally {
            if(!ArrayDataException.getExceptionsLog().isEmpty()) {
                ArrayDataException.clearLog();
            }
        }
    }
    private static int doCalc(String[][] array)throws ArraySizeException,ArrayDataException {
        if (array.length != SIZE_ARRAY_STRINGS) throw new ArraySizeException(
                String.format("Масив не відповідає умовам розміру %dх%d", SIZE_ARRAY_STRINGS,SIZE_ARRAY_STRINGS)
        );
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != SIZE_ARRAY_STRINGS)
                throw new ArraySizeException(
                        String.format("Масив не відповідає умовам розміру %dх%d", SIZE_ARRAY_STRINGS,SIZE_ARRAY_STRINGS)
                );
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException exception) {
                    ArrayDataException.setLog(String.format("\"%s\" - значення комірки: array[%d][%d] - не є числом",array[i][j], i, j));
                }
            }
        }
        if (!ArrayDataException.getExceptionsLog().isEmpty())
        {
            throw new ArrayDataException("Передивись значення масиву. Він містить помилки:");
        }
        return sum;
    }
}