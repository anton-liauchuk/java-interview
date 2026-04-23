package dsa;

import java.util.ArrayList;

class MeanOfRangeInArray {

    public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();

        int[] prefixSum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }

        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];

            int sum = prefixSum[r + 1] - prefixSum[l];
            int count = r - l + 1;
            result.add(sum / count);
        }

        return result;
    }
}
