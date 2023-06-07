public class Reverse {
        public static void reverseArray(int[] arr) {
            if (arr == null || arr.length <= 1) {
                return;
            }

            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }

            System.out.println("Reversed array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }


