package lesson_3;

import static java.lang.Integer.parseInt;

/*
Напишите программу печати таблицы перевода расстояний из дюймов всантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
 */

public class Task5 {
    public static void main(String[] args) {
        writeOutTable(centimetersInchesTableCreating(args));
    }

    public static double[] turnStringArrayToIntArray(String[] stringArgs){
        double[] intArgs = new double[stringArgs.length];
        for (int i = 0; i < stringArgs.length; i++) {
            intArgs[i] = parseInt(stringArgs[i]);
        }
        return intArgs;
    }

    public static double[][] centimetersInchesTableCreating(String[] stringArgs) {
        double[] usersBorders = turnStringArrayToIntArray(stringArgs);
        double[][] table = new double[usersBorders.length][usersBorders.length];
        for (int i = 0; i < usersBorders.length; i++) {
            table[i][0] = usersBorders[0] + i;
            table[i][1] = table[i][0] * 2.54;
        }
        return table;
    }

    public static void writeOutTable(double[][] table) {
        for (int i = 0; i < table.length; i++) System.out.println(table[i][0] + "  " + table[i][1]);
    }
}
