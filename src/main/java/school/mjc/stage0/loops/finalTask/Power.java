package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int powerOfNumber = numberToPrint;
        for (int i = 1; i < power; i++) {
            powerOfNumber *= numberToPrint;
        }
        System.out.println(powerOfNumber);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 5);
    }
}
