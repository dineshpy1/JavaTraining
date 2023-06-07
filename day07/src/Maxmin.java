public class Maxmin {
        public static void findLargestSmallest(int[] arr) {
            if (arr == null || arr.length == 0) {
                System.out.println("Array is empty.");
                return;
            }

            int smallest = arr[0];
            int largest = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }

                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }

            System.out.println("Smallest number: " + smallest);
            System.out.println("Largest number: " + largest);
        }

    }


