import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
        stream.forEach(p -> System.out.println(p));

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        int[] numArray;
        numArray = new int[]{1, 3, 4, 5, 7, 8, 9, 7, 90, 87, 46, 12};
        System.out.println(Arrays.toString(numArray));
        reverseArray(numArray);

        Stream<String> stringStream = list.stream();
        stringStream.forEach(p -> System.out.print(p));

        System.out.println();

        int[][] dimArray = new int[4][5];
        System.out.println(Arrays.toString(dimArray));
        System.out.println("Length of dimArray = " + dimArray.length);

        for (int[] each : dimArray) {
            System.out.println(Arrays.toString(each));
        }
        for (int i = 0; i < dimArray.length; i++) {
            var innerArray= dimArray[i];
            for (int j = 0; j < innerArray.length; j++) {
//                System.out.print(dimArray[i][j] + " ");
                dimArray[i][j] = (i * 10) + (j + 1);
            }
//            System.out.println();
        }

//        for (var outer : dimArray) {
//            for (var element : outer) {
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }
        System.out.println(Arrays.deepToString(dimArray));


        dimArray[1] = new int[] {10, 20, 30};
        System.out.println(Arrays.deepToString(dimArray));

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));

        anyArray[0] = new String[] {"a", "b", "c"};
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[1] = new String[][] {
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new int[2][3][4];
//        anyArray[2] = "Hello";
        System.out.println(Arrays.deepToString(anyArray));

        for (Object element : anyArray) {
            System.out.println("Element type = " + element.getClass().getSimpleName());
            System.out.println("Element toString() = " + element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }

//        list.stream()
//                .filter(num -> num > 3);
//                .forEach(System.out::println);
//              {
//
//        }

    }
    public static void reverseArray(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length/2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
