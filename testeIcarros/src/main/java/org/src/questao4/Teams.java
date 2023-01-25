package org.src.questao4;

public class Teams {
    private int[] wins;
    private int[] ties;
    private int[] points;
    public Teams(int[] wins, int[] ties, int[] points) {
        this.wins = wins;
        this.ties = ties;
        this.points = points;
    }

    public int getWinnersPoint(int[] wins, int[] ties, int[] points) {
        for (int i = 0; i < wins.length; i++) {
            points[i] = (wins[i] * 3);
            points[i] += ties[i];
        }
        int highestScore = 0;

        for (int i = 0; i < wins.length; i++) {
            if (highestScore < points[i]) {
                highestScore = points[i];
            }
        }
        return highestScore;
    }

    public int[] getWins() {
        return wins;
    }

    public void setWins(int[] wins) {
        this.wins = wins;
    }

    public int[] getTies() {
        return ties;
    }

    public void setTies(int[] ties) {
        this.ties = ties;
    }

    public int[] getPoints() {
        return points;
    }

    public void setPoints(int[] points) {
        this.points = points;
    }
}
