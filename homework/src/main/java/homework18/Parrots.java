package homework18;

public class Parrots {
    static final float udavInM = 380/100;
    static final int udavInParrots = 38;
    static final int udavInMonkeys = 5;
    static final int udavInElephs = 2;

    public static void heightCalculation() {
        System.out.printf("Рост Удава, м.: %.2f%n", udavInM);
        System.out.printf("Рост Попугая, м.: %.2f%n", udavInM /udavInParrots);
        System.out.printf("Рост Мартышки, м.: %.2f%n", udavInM /udavInMonkeys);
        System.out.printf("Рост Слоненка, м.: %.2f%n", udavInM /udavInElephs);
    }
}
