import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanobje = new Scanner(System.in);
        int usercode;
        int attempts = 0;
        int attemptIsLeft = 3;
        String redBold = "\u001B[31;2m";
        String reset = "\u001B[0m";
        System.out.println("\n                                            ******* --> PROJECT BY :");
        System.out.println("                                                                  NAME :- KELVIN M. WAMBUA.   ADM:-  20-0259");
        System.out.println("                                                                  NAME :- DORIS B. OGEGA.    ADM:-  19-0541");
        while (attempts < attemptIsLeft) {

            System.out.print("\n                                                      Enter your username : ");
            String userName = scanobje.nextLine();
            System.out.print("\n                                                      Enter your password : ");
            //special code;
            //System.console to encrypt passwords:
            String passWordmn = scanobje.nextLine();

            Login loginobj = new Login(userName, passWordmn);

            if (loginobj.validate()) {
                System.out.println("\n");
                System.out.println("                                                                            LOGIN SUCCESSFUL : ");
               System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________");
                System.out.println("\u001B[35m                                                                                  ADMIN\u001B[0m");
                System.out.println("                                                                            *** WELCOME *** ");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                CompanyLogo bodyobj = new CompanyLogo();
                bodyobj.displayMessage();
                admin adminobj = new admin();
                System.out.println("\n");

                //========================================================================================================================================================================================================

                System.out.println("\n                                                                     ***********************************");
                System.out.println("\u001B[38;2;255;165;0m                                                                  <****> STANDARD TABLE & BASE PRICE : <****> \u001B[0m");
                System.out.println("                                                                     ***********************************");
                System.out.println(adminobj.displayDimensions());
                System.out.print("\n                                       LONG : "); System.out.print("[30;47m              120                        CM. [0m");

                System.out.print("                      WIDE : ");System.out.println("[30;47m              80                   CM. [0m");

                System.out.print("\n                                       AREA : ");System.out.print("[30;47m              9600                       CM. [0m");

                System.out.print("  CM SQUARE ABOVE STANDARD : ");System.out.println("[30;47m              00                   CM² [0m");

                //========================================================================================================================================================================================================

                System.out.println(adminobj.displayWoodavailable());
                System.out.print("                                   MAHOGANY : "); System.out.println("[30;47m              AVAILABLE              [0m\n");
                System.out.print( "                                       PINE : "); System.out.println("[30;47m              AVAILABLE              [0m\n");
                System.out.print("                                        OAK : ");System.out.println("[30;47m              AVAILABLE              [0m\n");

                //========================================================================================================================================================================================================

                System.out.println(adminobj.displaybaseprice());
                System.out.println("                      MAHOGANY : \n");
                System.out.print( "         STANDARD PRICE : "); System.out.print("[30;47m KSH :         42500                [0m\n");

                System.out.println("\n                     PINE : \n");
                System.out.print( "         STANDARD PRICE : "); System.out.print("[30;47m KSH :         42500                [0m\n");

                System.out.println("\n                      OAK : \n");
                System.out.print( "         STANDARD PRICE : "); System.out.print("[30;47m KSH :          42500               [0m\n");

                //========================================================================================================================================================================================================
                System.out.println("\n                                                                                  STANDARD NUMBER OF DRAWS:\n");
                System.out.print( "MAXIMUM NUMBER OF DRAWS : "); System.out.print("[30;47m               6                    [0m\n");

                //========================================================================================================================================================================================================
                System.out.print("\n\n                                                      ENTER USER CODE TO USE USER PAGE : ");
                usercode = scanobje.nextInt();
                //***********////
                if(usercode == 1234) {

                    //System.out.println("\n\u001B[35m                                                                                  USER : \u001B[0m");
                    System.out.println("\n_______________________________________________________________________________________________________________________________________________________________________________________");
                    System.out.println("\u001B[35m                                                                                    USER\u001B[0m");
                    System.out.println("                                                                              *** WELCOME ***");
                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

                    //========================================================================================================================================================================================================
                    Selector selectwud = new Selector();
                    selectwud.selectWood();

                    //========================================================================================================================================================================================================
                }
                else {
                    System.out.println(redBold+"\n                                                                  ERROR >  "+reset);
                    System.out.println(redBold+"\n                                                  THE USER CODE PROVIDED IS INCORRECT. "+reset);
                }
                break;
            } else if (!loginobj.getUserName().equals("123")) {
                System.out.println(redBold+"\n                                                     Incorrect Username.\n"+reset);
            } else if (!loginobj.getPassWord().equals(("admin"))) {
                System.out.println(redBold+"                                                     Incorrect Password"+reset);
            }
            attempts++;

            int attemptsLeft = attemptIsLeft - attempts;

            if (attemptsLeft > 0) {
                if (attemptsLeft == 1) {
                    System.out.println(redBold+"\n                                            ** Final attempt ** "+reset);
                } else {
                    System.out.println(redBold+"                                           ** You have - -" + attemptsLeft + "- -Login attempts remaining. ** "+reset);
                }
            }
        }

        if (attempts == attemptIsLeft) {
            System.out.println(redBold+"                                           ** Maximum login attempts exceeded. ** "+reset);
        }
    }
}