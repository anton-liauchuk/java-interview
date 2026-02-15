package leetcode;

class MaximalSquareBruteForce {
    public int maximalSquare(char[][] matrix) {
        int maxArea = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int area = 0;
                int squareLength = 1;

                boolean canExpandSquare = true;
                while (canExpandSquare) {
                    canExpandSquare = canExpandSquare(matrix, i, j, squareLength);
                    if (canExpandSquare) {
                        area = squareLength * squareLength;
                        squareLength = squareLength + 1;
                    }
                }

                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }

    private boolean canExpandSquare(char[][] matrix, int i, int j, int squareLength) {
        boolean result = false;
        if ((j <= matrix[i].length - squareLength) && (i <= matrix.length - squareLength)) {
            for (int k = 0; k < squareLength; k++) {
                int nextItemVertically = j + (squareLength - 1);
                if (matrix[i + k][nextItemVertically] == '1') {
                    int nextItemHorizontally = i + (squareLength - 1);
                    if (matrix[nextItemHorizontally][j + k] == '1') {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
