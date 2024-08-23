import java.util.Scanner;

class AtmMini{

    void contin(){
        System.out.println("Do you want to continue?\n");
        System.out.println("1.Withdraw");
        System.out.println("2.Deposite");
        System.out.println("3.Balance Enquiry");
        System.out.println("4.Exit  \n");
        moneyprocess();
    }

    int pin = 1234;
    int amount = 1000;
    int p;

    Scanner s=new Scanner(System.in);

    void moneyprocess(){
        
        int wd = s.nextInt();
        switch (wd) {
            case 1:
                    System.out.print("Enter your 4 digit pin : ");
                    p=s.nextInt();
                
                    if (p==pin) {
                        System.out.print("Enter the amount : ");
                        int a=s.nextInt();
                            if (a<amount) {
                                amount =amount-a;
    
                                System.out.println("\n Amount withdraw successfully \n");
                            }
                            else{
                                System.out.println("\n Insufficient amount \n");
                            }
                    }
                else{
                    System.out.println("\n Wrong pin entered \n");
                }
                contin();

                break;
                

            case 2:
                System.out.print("Enter your 4 digit pin : ");
                p=s.nextInt();
            
                if (p==pin) {
                    System.out.print("Enter the amount : ");
                    int a=s.nextInt();

                            amount =amount+a;

                            System.out.println("\n Amount Deposite successfully \n");
                }
            else{
                System.out.println("\n Wrong pin entered \n");
            }
            contin();

            break;

            case 3:
                System.out.print("Enter your 4 digit pin : ");
                int p=s.nextInt();
            
                if (p==pin) {
                            System.out.println("\n Your balance is : "+ amount +"\n");
                }
            else{
                System.out.println("\n Wrong pin entered \n");
            }
            contin();
            break;

            case 4:
                System.out.println("\n Thanks to visiting \n");
                break;
            default:
                System.out.println("\n Invalid number and try again \n enter only 1 to 4");
                contin();
                break;
        }       
    }
}


public class AtmMain {
    public static void main(String[] hab){
        AtmMini w=new AtmMini();
        w.contin();
    }
}
