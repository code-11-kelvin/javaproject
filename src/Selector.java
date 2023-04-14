import java.util.Scanner;
class Selector {
    public void selectWood(){
        Scanner scanobje = new Scanner(System.in);
        System.out.println("                                                        TYPE OF WOOD & CODE: \n");
        System.out.println("                                                       CODE:                       TYPE OF WOOD: \n");
        System.out.println("                                                        1 :                          Mahogany");
        System.out.println("                                                        2 :                          Pine");
        System.out.println("                                                        3 :                          Oak");

        int woodSelected = 0;
        System.out.println("\n \u001B[36m                                          ENTER THE CODE FOR THE TYPE OF WOOD YOU WOULD LIKE TO USE FOR YOUR TABLE : \u001B[0m  \n");
        System.out.print(" \u001B[30;47m CODE :                       \u001B[0m  ");

        while(woodSelected < 1 || woodSelected >3) {
            woodSelected = scanobje.nextInt();
            if(woodSelected < 1 || woodSelected >3){
                System.out.println("\n\u001B[31m SORRY, THE WOODCODE YOU ENTERED DOES NOT EXIST!! \u001B[0m\n");
                System.out.print(" \u001B[30;47m CODE :                       \u001B[0m  ");
            }
            scanobje.nextLine();
        }
        switch (woodSelected){
            case 1:
                Mahogany mahoganyobj = new Mahogany();
                mahoganyobj.DisplayMahogany();
                mahoganyobj.MahoganyCalculation();
                break;
            case 2:
                Pine pineobj = new Pine();
                pineobj.DisplayPine();
                pineobj.PineCalculation();
                break;
            case 3:
                Oak oakobj = new Oak();
                oakobj.DisplayOak();
                oakobj.OakCalculation();
                break;
            default:
                System.out.println("\n\u001B[31m Sorry, THE WOODCODE YOU ENTERED DOES NOT EXIST!! \u001B[0m\n");
                System.out.print(" \u001B[30;47m CODE :                       \u001B[0m  ");

                break;
        }
    }
}
