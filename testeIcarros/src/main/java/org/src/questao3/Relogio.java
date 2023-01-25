package org.src.questao3;

public class Relogio {
    private String[] hours;
    public Relogio(String[] hours) {
        this.hours = hours;
    }

    public boolean validatorCreepyHours(String hours) {

        boolean result = false;
        String aux[] = hours.split(":");

        if ((aux[0].equals(aux[1])))
            result = true;


        String chars[] = aux[0].split("(?!^)");
        String chars1[] = aux[1].split("(?!^)");

        if( chars[0].equals(chars[1]) && chars1[0].equals(chars1[1]))
            result = true;

        if( chars[0].equals(chars1[1]) && chars1[0].equals(chars[1]))
            result = true;

        return result;
    }

    public String[] getHours() {
        return hours;
    }

    public void setHours(String[] hours) {
        this.hours = hours;
    }
}
