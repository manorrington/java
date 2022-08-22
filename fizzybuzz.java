public class fizzybuzz {
    public static void main(String[] args) {
//        x % 3 === fizzy
//        x % 5 === buzz
//        x % 15 === fizzybuzz

        for(int i = 1; i <= 100; i++){

            if(i % 15 == 0) {
                System.out.println("Fizzybuzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizzy");
            }else {
                System.out.println(i);
            }
        }

    }
}