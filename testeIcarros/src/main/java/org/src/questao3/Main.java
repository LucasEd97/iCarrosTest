package org.src.questao3;
public class Main {
    public static void main(String[] args) {
        int count = 0;
        String[] hours = {
                "10:10",
                "11:00",
                "13:31",
                "00:00",
                "15:45"
        };
        Relogio relogio = new Relogio(hours);

        for (int i=0; i < hours.length; i++) {
            if (relogio.validatorCreepyHours(hours[i]) == true) count += 1;

        }
        System.out.println("Clock Beeps: " + count);

    }
}
