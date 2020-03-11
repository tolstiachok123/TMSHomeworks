package lesson_3;

import static java.lang.Integer.parseInt;

/*
Начав тренировки, спортсмен в первый день пробежал 10 км. Каждыйдень он увеличивал дневную норму на 10% нормы предыдущего дня.
Какойсуммарный путь пробежит спортсмен за 7 дней?
 */

public class Task1 {
    public static void main(String[] args) {
        System.out.println(distanceSummary(args));
    }

    public static int[] turnStringArrayToIntArray(String[] stringArgs){
        int[] intArgs = new int[stringArgs.length];
        for (int i = 0; i < stringArgs.length; i++) {
            intArgs[i] = parseInt(stringArgs[i]);
        }
        return intArgs;
    }

    public static double distanceSummary(String[] stringArgs) {
        int[] intArgs = turnStringArrayToIntArray(stringArgs);
        double totalDistance = intArgs[0];
        for (int i = 1; i < intArgs[2]; i++) {
            totalDistance += intArgs[0] * intArgs[1] / 100;
        }
        return totalDistance;
    }
}
