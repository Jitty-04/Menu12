import java.util.Scanner;

    public class Menu {
        public static void main(String[] arg) {
            while (true) {
                int a, b, c;
                Scanner sc = new Scanner(System.in);
                System.out.println("1:Largest among 3 numbers");
                System.out.println("2:Sallest among 3 numbers");
                System.out.println("3:Check prime or not");
                System.out.println("4:Even or not");
                System.out.println("5:Reverse of a number");
                System.out.println("6:Exit");
                c = sc.nextInt();
                switch (c) {
                    case 1:
                        System.out.println("enter 3 numbers");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        c = sc.nextInt();
                        if (a > b) {
                            if (a > c) {
                                System.out.println("Largest=" + a);

                            } else {
                                System.out.println("Largest=" + b);
                            }

                        } else if (b > c) {
                            System.out.println("largest=" + b);
                        } else {
                            System.out.println("largest=" + c);
                        }

                }

            }


        }
    }