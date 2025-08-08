package Binary_Search;

public class firstandlastpos {
    public static void main(String[] args) {
        int[] arr = { -1, 2, 3, 3, 3, 5, 6, 7, 8, 23, 73 };
        int target = 3;
        binarySearch(arr, target);
    }

    static void binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int temp = -1;

        // Modified binary search to find any one occurrence
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                
                temp = mid;
                break; // Found any occurrence, now search linearly around it
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (temp == -1) {
            System.out.println("Target not found");
            return;
        }

        int low = temp;
        int high = temp;

        // Move left to find the first occurrence
        while (low > 0 && arr[low - 1] == target) {
            low--;
        }

        // Move right to find the last occurrence
        while (high < arr.length - 1 && arr[high + 1] == target) {
            high++;
        }

        System.out.println("First position: " + low);
        System.out.println("Last position: " + high);
    }
}
