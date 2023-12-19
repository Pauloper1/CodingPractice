package Codeforces.Problems.Contest.Round120;
// package Codeforces.Problems.Contest.Round120.Tests;

// import java.util.Scanner;

// public class Rating2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int tc = input.nextInt();
//         input.nextLine();
//         Solver solver = new Solver();
//         while (tc > 0) {
//             String a = input.nextLine();
//             int[] vals = solver.solve(a);
//             System.out.print(vals[0]);
//             System.out.print(vals[1]);
//             tc--;
//         }
//         input.close();
//     }
// }


// /**
//  *  Solver
//  */
// class  Solver {
//     public int[] solve(String a){

//         for(int i = 1; i < a.length(); i++){
//             if((int)a.charAt(i) != 48){
//                 int Val1 = Integer.parseInt(a.substring(0, i));
//                 int Val2 = Integer.parseInt(a.substring(i, a.length()));
                
//                 if(Val2 > Val1){
//                     return(new int[]{Val2, Val1});
//                 }else if(Val2 < Val1){
//                     return(new int[]{Val1, Val2});
//                 }
                
//             }
//         }
//         return new int[]{Integer.parseInt("-1")};
//     }
    
// }