package arrays.lectureActivities;

public class ex3 {
    public static void main (String[] args){
        /*
         * Use 2D array to represent the teams and their wins and losses
         * Points are calculated by multiplying the wins by 2 and draws by 1
         */

        int [][] teams = {
                {10, 0, 2},
                {7, 4, 3},
                {5, 5, 4},
                {3, 7, 2},
                {1, 4, 8}
        };

        // Init points array
        int[] points;

        // draw header method
        drawHeader();

        // calc points for each team (method)
        points = calcPoints(teams);

        // draw each team + points (method) for loop??
        drawTeamRow(teams, points);
    }

    private static void drawTeamRow(int[][] teams, int[] points) {
        for (int i = 0; i < points.length; i++){
            System.out.printf("%-7d%-7d%-7d%-7d%7d%n", i + 1, teams[i][0], teams[i][1], teams[i][2], points[i]);
        }
    }

    private static int[] calcPoints(int[][] teams) {
        int[] tempPoints = new int[5];
        for (int row = 0; row < teams.length; row++){
            int wins = teams[row][0];
            int draws = teams[row][1];

            int calc = (wins * 2) + draws;
            tempPoints[row] = calc;
        }
        return tempPoints;
    }

    private static void drawHeader() {
        System.out.printf("%-7s%-7s%-7s%-7s%7s%n", "Team", "Wins", "Draws", "Losses", "Points");
    }
}
