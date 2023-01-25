package org.src.questao2;

public class Main {

    public static void main(String[] args) {
        String[] stages = {"*--", "**-", "***", "---"};
        int stars = 0;

        AngryBirds game = new AngryBirds(stages);

        for (int i = 0; i < stages.length; i++) {
            stars += game.checkStars(stages[i]);
        }
        System.out.println("Numero de Estrelas em todos os niveis: " + stars);
    }
}
