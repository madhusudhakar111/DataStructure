package array;

public class SortColor {

    public static void main(String[] args) {

        int arr[] = new int[]{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        int lindex = 0;
        int rindex = arr.length - 1;
        int cindex = 0;

        while (cindex <= rindex && lindex < rindex) {

            if (arr[cindex] == 0) {
                int ltemp = arr[lindex];
                int ctemp = arr[cindex];
                arr[lindex] = ctemp;
                arr[cindex] = ltemp;
                lindex++;
                cindex++;
            } else if (arr[cindex] == 2) {
                int rtemp = arr[rindex];
                int ctemp = arr[cindex];
                arr[rindex] = ctemp;
                arr[cindex] = rtemp;
                rindex--;
            } else if (arr[cindex] == 1) {
                cindex++;
            }

        }
        System.out.println(arr);
    }


}
