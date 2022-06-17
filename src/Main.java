public class Main {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            i = i +1;
          System.out.print(" "+i);
        }
        System.out.println("  ");

        for (i = 10; i > 0; i--){
            System.out.print(" "+i);
        }
        System.out.println(" ");
        int month = 31;
        int friday = 3;
        while (friday <  month){
            friday = friday + 7;
            System.out.println(friday);

            }

    }

}