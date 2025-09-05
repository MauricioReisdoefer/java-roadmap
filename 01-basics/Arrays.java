public class Arrays {
    public static void main(String[] args) {
        int[] array;
        array = new int[]{12, 23, 34, 45, 56};

        for (int i = 0; i < array.length; i++) {
            System.out.println("Value: " + array[i]);
        }

        for(int num : array){
            System.out.println("Value: " + num);
        }
    }
}
