package com.pluralsight;
import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[Format As 'TEAM1:TEAM2|SCORE1:SCORE2']\nPlease Enter a Game Score:");
        String givenResults = scanner.next();

        String[] resultParts = givenResults.split("\\|");

        String teamSpread = resultParts[0];   // "TEAM1:TEAM2"
        String pointSpread = resultParts[1];  // "SCORE1:SCORE2"

        String[] teams = teamSpread.split(":");
        String[] points = pointSpread.split(":");

        String awayTeam = teams[1];
        String homeTeam = teams[0];

        int awayScore = Integer.parseInt(points[1]);
        int homeScore = Integer.parseInt(points[0]);

        if (homeScore > awayScore){
            System.out.println("\nWinner: " + homeTeam);
        } else if (awayScore > homeScore){
            System.out.println("\nWinner: "+ awayTeam);

        }


    }
}