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
                                System.out.println("Largest=" + c);
                            }

                        } else if (b > c) {
                            System.out.println("largest=" + b);
                        } else {
                            System.out.println("largest=" + c);
                        }
                        break;
                    case 2:
                        System.out.println("enter 3 numbers");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        c = sc.nextInt();
                        if (a < b) {
                            if (a < c) {
                                System.out.println("Smallest=" + a);

                            } else {
                                System.out.println("Smallest=" + b);
                            }

                        } else if (b < c) {
                            System.out.println("Smallest=" + b);
                        } else {
                            System.out.println("Smallest=" + c);
                        }
                        break;


                    case 3: System.out.println("Enter a number");
                        a = sc.nextInt();
                        boolean flag = false;
                        for (int i = 2; i < a / 2; i++) {
                            if (a % 2 == 0) {
                                flag = true;
                            }
                        }
                        if (!flag) {
                            System.out.println("prime");
                        }
                        else
                        {
                            System.out.println("Not prime");
                        }
                        break;

                    case 4:System.out.println("Enter a number");
                        a = sc.nextInt();
                        if(a%2==0){
                            System.out.println("even");
                        }
                        else{
                            System.out.println("odd");
                        }
                        break;
                    case 5:System.out.println("enter a number");
                           a=sc.nextInt();
                           int rev=0;
                           while (a!=0){
                              int r=a%10;
                               rev=rev*10+r;
                               a=a/10;
                           }
                           System.out.println("reverse="+rev);
                           break;
                    case 6: System.exit(0);
                            break;
                    default:System.out.println("invalid");





                }

            }


        }
    }