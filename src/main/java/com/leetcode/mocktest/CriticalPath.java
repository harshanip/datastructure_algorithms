package com.leetcode.mocktest;

import com.leetcode.Util;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CriticalPath {
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> result = new LinkedList<>();
        int[][] matrix = new int[n][n];
        for (List<Integer> con : connections) {
            int node1 = con.get(0);
            int node2 = con.get(1);
            if(node1<node2){
                matrix[node1][node2] = 1;
            } else {
                matrix[node2][node1] = 1;
            }

           // matrix[node2][node1] = 1;
        }
        Util.printMatrix(matrix);
        /*
      for (List<Integer> con : connections) {
            int node1 = con.get(0);
            int node2 = con.get(1);
            matrix[node1][node2] = 0;
            matrix[node2][node1] = 0;
           boolean isConnected = isNetworkConnected(n, matrix);
           if(!isConnected){
               result.add(List.of(node1,node2));
           }
          matrix[node1][node2] = 1;
          matrix[node2][node1] = 1;
        }
        */

        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(matrix[i][j]==1){
                    matrix[i][j] = 0;
                   // matrix[j][i] = 0;
                    boolean isConnected = isNetworkConnected(n, matrix);
                    if(!isConnected){
                        List<Integer> l = new ArrayList<>();
                        l.add(i);
                        l.add(j);
                        result.add(l);
                    }
                    matrix[i][j] = 1;
                    //matrix[j][i] = 1;
                }
            }
        }


        return result;
    }

    private boolean isNetworkConnected(int n, int[][] matrix) {
        boolean[] connected = new boolean[n];
        Stack<Integer> toBeVisited = new Stack<>();
        toBeVisited.add(0);
        while (!toBeVisited.isEmpty()) {
            int source = toBeVisited.pop();
            int[] nodes = matrix[source];
            for (int i = source; i <n; i++) {
                if (nodes[i] == 1 && !connected[i]) {
                    connected[i] = true;
                    toBeVisited.add(i);
                }
            }
        }

        for (int i = 1; i < connected.length-1; i++) {
            if (!connected[i]) return false;
        }
        return true;
    }

    @Test
    public void testCriticalPath1() {
        int n = 4;
        List<List<Integer>> connections = List.of(List.of(1, 2), List.of(0, 1), List.of(2, 0), List.of(1, 3));
        List<List<Integer>> output = List.of(List.of(1, 3));
        List<List<Integer>> result = new CriticalPath().criticalConnections(n, connections);
        assertEquals(1, result.size());
        System.out.print(result);

    }

    @Test
    public void testCriticalPath2() {
        int n = 6;
        List<List<Integer>> connections =
                List.of(List.of(0, 1), List.of(1, 2), List.of(2, 0), List.of(1, 3), List.of(3, 4), List.of(4, 5), List.of(5, 3));
        List<List<Integer>> output = List.of(List.of(1, 3));
        List<List<Integer>> result = new CriticalPath().criticalConnections(n, connections);

        System.out.print(result);
        assertEquals(1, result.size());
        assertTrue(result.get(0).contains(1));
        assertTrue(result.get(0).contains(3));
    }
}
