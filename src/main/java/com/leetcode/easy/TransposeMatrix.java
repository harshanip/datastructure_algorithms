package com.leetcode.easy;
/**
 * <PRE>
 * Given a matrix A, return the transpose of A.

The transpose of a matrix is the matrix flipped over it's main diagonal, 
switching the row and column indices of the matrix.

 

Example 1:

Input: [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]

Example 2:

Input: [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]

https://leetcode.com/submissions/detail/163699990/
https://leetcode.com/submissions/detail/163701082/
 * </PRE>
 * @author dia
 *
 */
public class TransposeMatrix {
    public int[][] transpose(int[][] A) {
        final int X= A[0].length,Y=A.length;
        int[][] result=new int[X][Y];
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                result[i][j]=A[j][i];
            }
        }
        return result;
    }
}
