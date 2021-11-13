package Homework1_Pkg;

public class Homework2 {

    public static void main(String[] args) {
        double fTemp = 70;
        double cTemp = (fTemp - 32) * 5/9;
        System.out.println(fTemp + " F is equal to " + cTemp + "C");

        double fTempe = 70;
        double kTempe = (fTempe + 459.670) * 5/9;
        System.out.println(fTempe + "F is equal to " + kTempe + "K");

        double cTemper= 25;
        double fTemper = cTemper * 9/5 + 32;
        System.out.println(cTemper + " C is equal to " + fTemper + "F");

        double cTempera = 25;
        double kTempera = cTempera + 273.15;
        System.out.println(cTempera + " C is equal to " + kTempera + "K");

        double kTemperat = 290;
        double cTemperat = kTemperat - 273.15;
        System.out.println(kTemperat+ " K is equal to " + cTemperat + "C");

        double kTemperatu = 290;
        double fTemperatu = kTemperatu * 9/5 - 459.67;
        System.out.println(kTemperatu + " K is equal to " + fTemperatu + "F");

    }


}
