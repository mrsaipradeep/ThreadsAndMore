package com.company.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class CourseOrderSolution {

    public static void main(String[] args) {
        CourseOrderSolution courseOrderSolution = new CourseOrderSolution();
        int[][] ints = new int[7][3];
        ints[0][0] = 4;
        ints[0][1] = 0;
        ints[0][2] = 2;
        ints[1][0] = 0;
        ints[1][1] = 1;
        ints[1][2] = 6;
        ints[2][0] = 2;
        ints[2][1] = 3;
        ints[2][2] = 7;

        ints[3][0] = 1;
        ints[3][1] = 5;
        ints[4][0] = 6;
        ints[4][1] = 5;
        ints[5][0] = 3;
        ints[5][1] = 5;
        ints[6][0] = 7;
        ints[6][1] = 5;
        //8
        //4 0 2
        //0 1 6
        //2 3 7
        //1 5
        //6 5
        //3 5
        //7 5



        for (int[] a : ints){
            System.out.println(Arrays.toString(a));
        }
        System.out.println(Arrays.toString(courseOrderSolution.findOrder1(8, ints)));
    }

    public int[] findOrder1(int numCourses, int[][] prerequisites) {
        // Topological sort
        // Edge case
        if(numCourses <= 0) return new int[0];

        //1. Init Map
        HashMap<Integer, Integer> inDegree = new HashMap<>();
        HashMap<Integer, List<Integer>> topoMap = new HashMap<>();
        for(int i = 0; i < numCourses; i++) {
            inDegree.put(i, 0);
            topoMap.put(i, new ArrayList<Integer>());
        }

        //2. Build Map
        for(int[] pair : prerequisites) {
            int curCourse = pair[0], preCourse = pair[1];
            topoMap.get(preCourse).add(curCourse);  // put the child into it's parent's list
            inDegree.put(curCourse, inDegree.get(curCourse) + 1); // increase child inDegree by 1
        }
        //3. find course with 0 indegree, minus one to its children's indegree, until all indegree is 0
        int[] res = new int[numCourses];
        int base = 0;
        while(!inDegree.isEmpty()) {
            boolean flag = false;   // use to check whether there is cycle
            for(int key : inDegree.keySet()) {  // find nodes with 0 indegree
                if(inDegree.get(key) == 0) {
                    res[base ++] = key;
                    List<Integer> children = topoMap.get(key);  // get the node's children, and minus their inDegree
                    for(int child : children)
                        inDegree.put(child, inDegree.get(child) - 1);
                    inDegree.remove(key);      // remove the current node with 0 degree and start over
                    flag = true;
                    break;
                }
            }
            if(!flag)  // there is a circle --> All Indegree are not 0
                return new int[0];
        }
        return res;
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Node[] nodes = new Node[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            int[] preReq = prerequisites[i];
            int courseToBeTaken = preReq[0];
            int courseToBeCompletedBefore = preReq[1];
            if (nodes[courseToBeTaken] == null) {
                nodes[courseToBeTaken] = new Node(courseToBeTaken);
            }
            if (nodes[courseToBeCompletedBefore] == null) {
                nodes[courseToBeCompletedBefore] = new Node(courseToBeCompletedBefore);
            }
            nodes[courseToBeCompletedBefore].neighbours.add(nodes[courseToBeTaken]);
        }

        boolean[] visited = new boolean[numCourses];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i] && !isValidDAG(i, stack, visited, new boolean[numCourses], nodes)) {
                return new int[0];
            }
        }
        int[] result = new int[numCourses];
        int count = 0;
        while (!stack.isEmpty()) {
            result[count++] = stack.pop();
        }
        return result;
    }

    private boolean isValidDAG(int currId, Stack<Integer> stack, boolean[] visited,
                               boolean[] localVisited, Node[] nodes) {
        if (localVisited[currId]) {
            return false;
        }
        if (visited[currId]) {
            return true;
        }
        localVisited[currId] = true;
        visited[currId] = true;
        if (nodes[currId] != null) {
            List<Node> neighbours = nodes[currId].neighbours;
            for (Node neighbour : neighbours) {
                if (!isValidDAG(neighbour.id, stack, visited, localVisited, nodes)) {
                    return false;
                }
                localVisited[neighbour.id] = false;
            }
        }
        stack.push(currId);
        return true;
    }

    public class Node {
        int id;
        List<Node> neighbours;

        Node(int id) {
            this.id = id;
            neighbours = new ArrayList<>();
        }
    }

}
