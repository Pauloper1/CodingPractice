package CodingNinjas.ProblemOfTheDay.Moderate;

import java.util.*;

class AsteroidCollision {
    public static void main(String[] args) {
        Integer asteroids[] = new Integer[] {9, 4, 9, -1, -7, -6, -6, 5, 6, 0 };
        List<Integer> result = new ArrayList<>(Arrays.asList(asteroids));

        for (int i = 1; i < result.size(); i++) {
            int current = i;
            int left = i - 1;
            while ( current > 0 && left > -1 && result.get(current) < 0 && result.get(left) > -1) {
                if (Math.abs(result.get(current)) == result.get(left)) {
                    result.remove(current);
                    result.remove(left);
                    current -= 2;
                    left -= 2;
                    i -= 2;
                    System.out.println(result.toString());
                } else if (Math.abs(result.get(current)) > result.get(left)) {
                    result.remove(left);
                    left--;
                    current --;
                    i--;
                    
                    System.out.println(result.toString());
                } else {
                    result.remove(current);
                    left --;
                    current --;
                    i--;
                    System.out.println(result.toString());
                }
                
            }
        }

    }
}