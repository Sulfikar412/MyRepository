public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 8, 12, 20, 25};
        int target = 12;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index: " + i);
                return;
            }
        }

        System.out.println("Not found");
    }
}
