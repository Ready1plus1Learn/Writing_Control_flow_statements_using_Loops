//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int  check_number = 10;
        String message;

        for(check_number= 1; check_number <11 ; check_number++) {
            message = (check_number%2==0) ? "is even number" : "is odd number";
            System.out.println(check_number + " " +  message);
        }
        System.out.println();



//first attempt
//        for(int check_number= 1; check_number <11 ; check_number++) {
//            String message;
//
//           if (check_number%2==0) message= "is even number" ;
//           else
//               message = "is odd number";
//            System.out.println(check_number + " " +  message);
//        }
//        System.out.println();
//


    }
}