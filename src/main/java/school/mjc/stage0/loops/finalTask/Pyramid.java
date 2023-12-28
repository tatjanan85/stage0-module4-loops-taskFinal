package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength * 2 - 1; j++) {
                if (j <= cathetusLength) {
                    if (j < cathetusLength - i + 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print(cathetusLength - j + 1);
                    }
                } else {
                    if (j > cathetusLength + i - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print(j - cathetusLength + 1);
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(6);
    }
}
