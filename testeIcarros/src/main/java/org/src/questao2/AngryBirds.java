package org.src.questao2;

public class AngryBirds {
    private String[] stages;

    public AngryBirds(String[] args) { this.stages = args; }

    public int checkStars(String stages) {
        int count = 0;

        String chars[] = stages.split("(?!^)");
        for ( int j=0; j < chars.length; j++) {
            if (chars[j].equals("*")) {
                count += 1;
            }
        }
        return count;
    }

    public String[] getStages() {
        return stages;
    }

    public void setStages(String[] stages) {
        this.stages = stages;
    }
}
