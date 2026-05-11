package homework18;

public class LogicalOperationTable {
    public static void logicalOperationTable() {
        System.out.println("P\tQ\tP AND Q\tP OR Q\tP XOR Q\tNOT P");
        boolean P, Q;
        for (int i =0; i < 2; i++) {
            for (int j =0; j < 2; j++) {
                P = (i == 0); Q = (j == 0);
                System.out.println(P + "\t" + Q + "\t" + (P & Q) + "\t" + (P || Q) + "\t" + (P ^ Q) + "\t" + !P);
            }
        }
    }
}
