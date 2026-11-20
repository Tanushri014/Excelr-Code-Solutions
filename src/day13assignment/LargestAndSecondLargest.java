package day13assignment;

public class LargestAndSecondLargest {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};

        int max = Integer.MIN_VALUE;
        int second_Max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                second_Max = max;
                max = arr[i];

            }
            else if (arr[i] > second_Max && arr[i] != max) {

                second_Max = arr[i];
            }
        }

        System.out.println("Maximum Number: " + max);

        if (second_Max == Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist");
        }
        else {
            System.out.println("Second Maximum Number: " + second_Max);
        }
    }
}