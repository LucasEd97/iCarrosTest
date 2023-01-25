package org.src.questao4;
public class Main {
    public static void main(String[] args) {
        int[] teamsWins = {1, 1, 3};
        int[] teamsTies = {1, 0, 0};
        int[] pointsOfEachTeam = new int[teamsWins.length];

        Teams teams = new Teams(teamsWins, teamsTies, pointsOfEachTeam);

        int highestScore = teams.getWinnersPoint(teamsWins, teamsTies, pointsOfEachTeam);

        System.out.println("Pontuacao do campeao: " + highestScore);
    }
}
