import java.util.*;
public class DayFive {



        public static List<Integer> findLeaders(int[] arr) {
            int n = arr.length;
            List<Integer> leaders = new ArrayList<>();

            // last element is always a leader
            int maxFromRight = arr[n - 1];
            leaders.add(maxFromRight);

            // traverse from second last to first
            for (int i = n - 2; i >= 0; i--) {
                if (arr[i] > maxFromRight) {
                    leaders.add(arr[i]);
                    maxFromRight = arr[i];
                }
            }

            // reverse to maintain original order
            Collections.reverse(leaders);
            return leaders;
        }

        public static void main(String[] args) {
            int[] arr1 = {16, 17, 4, 3, 5, 2};
            int[] arr2 = {1, 2, 3, 4, 0};
            int[] arr3 = {7, 10, 4, 10, 6, 5, 2};
            int[] arr4 = {5};
            int[] arr5 = {100, 50, 20, 10};

            System.out.println(findLeaders(arr1)); // [17, 5, 2]
            System.out.println(findLeaders(arr2)); // [4, 0]
            System.out.println(findLeaders(arr3)); // [10, 6, 5, 2]
            System.out.println(findLeaders(arr4)); // [5]
            System.out.println(findLeaders(arr5)); // [100, 50, 20, 10]
        }


}
