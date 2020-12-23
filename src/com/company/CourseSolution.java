package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.TreeMap;

public class CourseSolution {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        int count = 0;
        int numOfcourses = 0;

        TreeMap<String, List<Integer>> map = new TreeMap<>();
        int maxColLength = 0;
        while ((line = in.readLine()) != null) {
            if(line.equals("")){
                break;
            }
            if (count == 0) {
                numOfcourses = Integer.parseInt(line);
            } else {
                String[] split = line.split(" ");
                for (String aSplit : split) {
                    if (map.get("row" + count) != null) {
                        map.get("row" + count).add(Integer.parseInt(aSplit));
                    } else {
                        List<Integer> ints = new ArrayList<>();
                        ints.add(Integer.parseInt(aSplit));
                        map.put("row" + count, ints);
                    }
                    if(maxColLength < map.get("row" + count).size()){
                        maxColLength = map.get("row" + count).size();
                    }

                }

            }
            count++;
        }

        int[][] preRequesties = new int[map.keySet().size()][maxColLength];
        int cot = 0;
        for (String s: map.keySet()){
            List<Integer> integers = map.get(s);
            for(int i=0; i < integers.size(); i++ ){
                preRequesties[cot][i] = integers.get(i);
            }
            cot++;
        }
        int[] order = findOrder(numOfcourses, preRequesties);
        for (int i = 0; i < order.length; i++) {
            System.out.print(order[i] + " ");
        }

    }

    private static int[] findOrder(int numCourses, int[][] prerequisites) {
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

    private static boolean isValidDAG(int currId, Stack<Integer> stack, boolean[] visited,
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

    static class Node {
        int id;
        List<Node> neighbours;

        Node(int id) {
            this.id = id;
            neighbours = new ArrayList<>();
        }
    }
}
