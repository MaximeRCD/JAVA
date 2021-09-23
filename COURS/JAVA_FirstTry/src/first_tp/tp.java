package first_tp;

public class tp {
    public static void  main (String[] args) {
        // create int array
        int[] my_int_array = {1, 2, 3, 4};
        System.out.println("----------- First for loop ---------");
        for (int currentInt : my_int_array) {
            System.out.println(currentInt);
        }
        System.out.println("----------- Second for loop ---------");
        for (int i =0; i<my_int_array.length; i++) {
            System.out.println(my_int_array[i]);
        }

    }
}
