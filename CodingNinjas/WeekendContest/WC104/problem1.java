package CodingNinjas.WeekendContest.WC104;

public class problem1 {
    public static void main(String[] args) {
        
    }

        static int maximumRemovals(int n, int[] v) {
     
            int max = v[0];
            int min = v[0];
            int maxPos = 0;
            int minPos = 0;
            for (int i = 1; i < v.length; i++) {
                if (v[i] > max) {
                    max = v[i];
                    maxPos = i;
                } else if (v[i] < min) {
                    min = v[i];
                    minPos = i;
                }
            }
    
            int maxRemove = maxPos >= minPos ? v.length - (maxPos + 1) : v.length - (minPos + 1);
            return maxRemove;
        }
}
