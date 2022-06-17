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

        int startComets = 0 ;
        int endComets = 2120;
//        for (i = 1822; i <=2122; i = i + 74 ){
//            System.out.println(i);
        while (startComets <  endComets){
            startComets = startComets + 79;
            if (startComets >1895 && startComets < 2100){
                System.out.println(startComets);}


        }

    }

}