import java.util.Scanner;
public class controlstatement {
    public static void main(String[] args){
        final double product_1=2.98;
        final double product_2=4.50;
        final double product_3=9.98;
        final double product_4=6.49;
        final double product_5=6.87;

        Scanner scanner = new Scanner(System.in);
        double totalRetailValue = 0.0;

        System.out.println("Enter the number and quantity sold");
        System.out.println("Enter the negative product to stop" );

        while(true){
            System.out.println("product number:");
            int productNumber = scanner.nextInt();
            if(productNumber < 0){
                break;

            }
            System.out.println("quality sold:");
            int qualitySold = scanner.nextInt();

            double productPrice;
            switch(productNumber){

                case 1:
                      productPrice = product_1;
                      break;
                case 2:
                      productPrice = product_2;
                      break;
                 case 3:
                      productPrice = product_3;
                      break;
                 case 4:
                       productPrice = product_4;
                       break;
                 case 5:                  
                     productPrice = product_5;
                       break;
                 default :
                       System.out.println("Invalid product number:" +productNumber);
                       continue;
                       
            }

            totalRetailValue = totalRetailValue + (productPrice*qualitySold);
        }

        System.out.printf("total retail value of all products sold: $%.2f%n",totalRetailValue);
        scanner.close();
    }
    
}
