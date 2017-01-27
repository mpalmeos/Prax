/**
 * Created by mpalmeos on 27.01.2017.
 */
public class KysimusedVastused {
    //Kikilips
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(" " + i + "-" + j + " ");
            }
            System.out.println();
        }
// samm-sammu haaval -> ei ole vaja tervet valemit ühekorraga välja tuletada!
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if ((i >= j && i + j < 9) || (i <= j && i + j >= 8)) {
                    System.out.print(" 0 ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }
}
