class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> li = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            int min = matrix[i][0];
            int colind = 0;
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    colind = j;
                }
            }
            boolean flag = true;
            for (int c = 0; c < row; c++) {
                if (matrix[c][colind] > min) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                li.add(min);
            }
        }
        return li;
    }
}
