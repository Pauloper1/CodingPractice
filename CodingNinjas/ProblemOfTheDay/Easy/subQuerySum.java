package CodingNinjas.ProblemOfTheDay.Easy;

import java.util.ArrayList;
import java.util.Scanner;

public class subQuerySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for arr

        int testCases = scanner.nextInt();
        while (testCases >0) {
            int rowsArr = scanner.nextInt();
            int colsArr = scanner.nextInt();
            int numQueries = scanner.nextInt();
            
            //take the matrix
            ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
            System.out.println("Enter the elements for arr:");
            for (int i = 0; i < rowsArr; i++) {
                ArrayList<Integer> row = new ArrayList<>();
                for (int j = 0; j < colsArr; j++) {
                    row.add(scanner.nextInt());
                }
                arr.add(row);
            }
            
            ArrayList<ArrayList<Integer>> queries = new ArrayList<>();
            for (int i = 0; i < numQueries; i++) {
                ArrayList<Integer> query = new ArrayList<>();
                // System.out.println("Enter the startRow, startCol, endRow, and endCol for query " + (i + 1) + ":");
                query.add(scanner.nextInt());
                query.add(scanner.nextInt());
                query.add(scanner.nextInt());
                query.add(scanner.nextInt());
                queries.add(query);
            }
            
            ArrayList<Integer> result = findSubmatrixSum(arr, queries);
            System.out.println(result.toString());
            testCases--;
        }
        scanner.close();
        
    
    }

    public static ArrayList<Integer>findSubmatrixSum(ArrayList<ArrayList<Integer>> arr, ArrayList<ArrayList<Integer>> queries){
        
        ArrayList<Integer> result = new ArrayList<>();
        for (ArrayList<Integer> query : queries) {
            
            int startRow = query.get(0);
            int startCol = query.get(1);
            int endRow = query.get(2);
            int endCol = query.get(3);
            int sum = 0;
            for(; startRow <= endRow; startRow++ ){
                for(; startCol <= endCol; startCol++){
                    sum += arr.get(startRow).get(startCol);
                }
            }
            result.add(sum);
        }
        return result;
    }
}
