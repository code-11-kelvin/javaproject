import java.util.Scanner;
public class Pine {
    private double length;
    private double width;
    private double area;
    private int drawss;
    private double cost;
    private double drawerCost = 0;
    private double costPerTable;
    private double compinedCost;
    private int numberOfTables;
    private double totalCost;
    private double extraCharge = 0;
    private double discount = 0.05;
    private double customerDiscount;
    private double subTotals;
    private double paidAmount;
    private double balance;

    public void DisplayPine() {
        Scanner Pinebres = new Scanner(System.in);

        System.out.println("\n\n \u001B[36m                                          ENTER THE DETAILS OF YOUR CUSTOMED TABLE TO YOUR PREFERENCE :  \u001B[0m  \n");
        System.out.print("\n \u001B[30;47m Length of the Table in CM :  \u001B[0m  ");
        length = Pinebres.nextDouble();
        System.out.println("\n \u001B[30;47m You gave : "+length+"CM for your legnth. \u001B[0m  ");
        System.out.print("\n \u001B[30;47m Width of the Table in CM :   \u001B[0m  ");
        width = Pinebres.nextDouble();
        System.out.println("\n \u001B[30;47m You gave : "+width+" CM for your width \u001B[0m  ");
        System.out.print("\n \u001B[30;47m Number of Tables :           \u001B[0m  ");
        numberOfTables = Pinebres.nextInt();
        System.out.println("\n \u001B[30;47m Your tables are : "+numberOfTables+" tables \u001B[0m  ");
        System.out.print("\n \u001B[30;47m Number of Draws :            \u001B[0m  ");
        drawss = Pinebres.nextInt();
        System.out.println("\n \u001B[30;47m You provided : "+drawss+" draws       \u001B[0m  ");



        while (drawss > 6) {
            System.out.println("\n\u001B[31m THE MAXIMUM NUMBER OF DRAWS IN A TABLE ARE 6. \u001B[0m\n");
            System.out.print(" \u001B[30;47m NUMBER OF DRAWS :           \u001B[0m  ");
            drawss = Pinebres.nextInt();
            System.out.println("\n \u001B[30;47m You provided : "+drawss+" draws       \u001B[0m  ");
                        //Pinebres.close();
        }

        area = length * width;


    }


    public void PineCalculation() {

        if (area <= 9600) {
            cost = 42500;

        } else {
            cost = 42500 + (area - 9600) * 825;
        }
        if (area == 0) {
            cost = 0;
        }

        if (drawss > 0) {
            drawerCost = 2500 + (drawss - 1) * 2000;
        }
        costPerTable = cost + drawerCost;
        compinedCost = costPerTable * numberOfTables;


        if (numberOfTables > 0) {
            totalCost = compinedCost + extraCharge;
        } else {
            totalCost = compinedCost;
        }
        if (numberOfTables >= 2) {
            customerDiscount = totalCost * discount;
            subTotals = totalCost - customerDiscount;
            compinedCost -= discount;

        } else {
            subTotals = totalCost;
        }
        //////////////////////////////////////////////////////////
        if (area > 0 && numberOfTables > 0) {
            System.out.println("\n                                                                      \u001B[30;47m ---- >>> THE TOTAL AMOUNT FOR THE CUSTOMED TABLE IS : " + subTotals+" <<< ----\u001B[0m\n");
            Scanner mahog = new Scanner(System.in);
            System.out.print("                                                                      \u001B[30;47m ENTER AMOUNT RECEIVED : \u001B[0m ");
            paidAmount = mahog.nextDouble();
            System.out.println("\n                                                                      \u001B[30;47m Amount Received is : " + paidAmount+" KSH \u001B[0m");

            balance = paidAmount - subTotals;
        }

        System.out.println("\n KYOCERA printing ( INVOICE ) ..... \n");

        if (cost >= 1 && numberOfTables >= 1 && subTotals > 0  && paidAmount >= subTotals) {


            ///////////
            System.out.println("\n \n \n                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                      *********************************************************                                      \u001B[0m");
            System.out.println("                    \u001B[30;47m================================= <--    ANTIQUE FURNITURE KENYA LIMITED WESTLANDS NAIROBI.   --> ===================================\u001B[0m");
            System.out.println("                    \u001B[30;47m                                      *********************************************************                                      \u001B[0m");
            //System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.print("                    \u001B[30;47m                                                 \u001B[0m  ");
            System.out.print("\u001B[31;32m             INVOICE            \u001B[0m");
            System.out.println("\u001B[30;47m                                                  \u001B[0m  ");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                       <*>  YOU CHOOSE PINE WOOD FOR YOUR CUSTOMED TABLE  <*>                                        \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                       SPECIFICATIONS OF THE TABLE :                                                 \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   Length of the Table is: ..........................................    " + length + "\u001B[30;47m CM                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   Width of the Table is: ...........................................    " + width + "\u001B[30;47m CM                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   Number of Tables is: .............................................    " + numberOfTables + "\u001B[30;47m Tables                    \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   Number of Draws is: ..............................................    " + drawss + "\u001B[30;47m Draws                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   Area of the Table is: ............................................    " + area + "\u001B[30;47m CM²                  \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            //System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                         ITEM CHARGES :                                                              \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   Cost of the Table is ..............................................   KSH : " + cost + "\u001B[30;47m               \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   Cost of : " + drawss + " drawers is ............................................   KSH : " + drawerCost + "\u001B[30;47m                \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   Cost of 1 table with : " + drawss + " Drawers is ...............................   KSH : " + costPerTable + "\u001B[30;47m               \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   Cost of : " + numberOfTables + " Complete Tables is .....................................  KSH : " + compinedCost + "\u001B[30;47m             \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                             DISCOUNT AND EXTRA CHARGE :                                             \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   ANTIQUE FURNITURES CUSTOMER DISCOUNT : ...............................    " + discount + "\u001B[30;47m %                  \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   Extra Charge for Using Pine is : .....................................   KSH : " + extraCharge + "\u001B[30;47m             \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   Total with extra charge : ............................................   KSH : " + totalCost + "\u001B[30;47m          \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   Customer Discount : ..................................................   KSH : " + customerDiscount + "\u001B[30;47m              \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   SUB TOTALS : .........................................................   KSH : " + subTotals + "\u001B[30;47m          \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                          TOTALS :                                                                   \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   Total Cost for : " + numberOfTables + " Tables is .................................   KSH : " + subTotals + "\u001B[30;47m                  \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   Money Paid ...................................................   KSH : " + paidAmount + "\u001B[30;47m                   \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   CHANGE (BALANCE) .............................................  KSH : " + balance + "\u001B[30;47m                \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                          ◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘                   \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                         THANK YOU FOR CHOOSING ANTIQUE FURNITURES !!                                \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                       CUSTOMER COPY                                                 \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                ** PLEASE RETAIN RECEIPT **                                          \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                          ◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘                   \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47mCode by kelvin and Doris : mailto:kelvindorisjavaproject@gmail.com                                                                   \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                  1.                                                                 \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");


        } else {
            System.out.println(balance);
// if Table is equal to 0 and one of the dimension is 0 Code;

            System.out.println("\n \n \n                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                      *********************************************************                                      \u001B[0m");
            System.out.println("                    \u001B[30;47m================================= <--    ANTIQUE FURNITURE KENYA LIMITED WESTLANDS NAIROBI.   --> ===================================\u001B[0m");
            System.out.println("                    \u001B[30;47m                                      *********************************************************                                      \u001B[0m");
            //System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.print("                    \u001B[30;47m                                                 \u001B[0m  ");
            System.out.print("\u001B[31;32m             INVOICE            \u001B[0m");
            System.out.println("\u001B[30;47m                                                  \u001B[0m  ");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                           <*>  YOU CHOSE PINE WOOD FOR YOUR CUSTOMED TABLE  <*>                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                       SPECIFICATIONS OF THE TABLE :                                                 \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   Length of the Table is: ..........................................    " + length + "\u001B[30;47m cm                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   Width of the Table is: ...........................................    " + width + "\u001B[30;47m cm                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   Number of Tables is: .............................................    " + numberOfTables + "\u001B[30;47m Tables                    \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   Number of Draws is: ..............................................    " + drawss + "\u001B[30;47m Draws                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   Area of the Table is: ............................................    " + area + "\u001B[30;47m CM²                  \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                 COMMENT :                                                           \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                 <*>   KINDLY THE SPECIFICATIONS OF THE TABLES CANNOT BE MET:    <*>                                 \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   ⁍ THE NUMBER OF TABLES YOU PROVIDED IS : ...........................    " + numberOfTables + " Tables                  \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   ⁍ AND THE LENGTH YOU PROVIDED IS : .................................    " + length + " CM                   \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   ⁍ WIDTH YOU PROVIDED IS  : .........................................    " + width + " CM                   \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                   ⁍ WHILE THE AREA OF YOUR TABLE IS : ................................    " + area + " CM²                 \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                      <*> KIND REQUEST THE COMPANY DOES NOT ACCEPT PARTIAL PAYMENTS ALL AMOUNT IS TO BE PAID IN FULL <*>             \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                     YOU OUTSTANDING BALANCE IS : KSH :- "+balance+"                                         \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                          ◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘                   \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                         THANK YOU FOR CHOOSING ANTIQUE FURNITURES !!                                \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                       CUSTOMER COPY                                                 \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                ** PLEASE RETAIN RECEIPT **                                          \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                          ◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘                   \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47mCode by kelvin and Doris : mailto:kelvindorisjavaproject@gmail.com                                                                   \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                  1.                                                                 \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");
            System.out.println("                    \u001B[30;47m                                                                                                                                     \u001B[0m");

        }


    }

}
