
import java.util.Scanner;

public class Main {    
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
            char choice = 'y';
        while(choice == 'y' || choice == 'Y'){
        System.out.print("Enter the Value for Angle 1 : ");
        int angle1 = sc.nextInt();
        System.out.print("Enter the Value for Angle 2 : ");
        int angle2 = sc.nextInt();
        
        Triangle triangle = new Triangle();
        triangle.setAngle1(angle1);
        triangle.setAngle2(angle2);
        triangle.calculateThirdAngle();
        int thirdAngle = triangle.getAngle3();
            System.out.print("Third Angle is : " +  thirdAngle);
            System.out.println("");
          String type = triangle.typeOfTriangle();
            System.out.print("Type of Triangle is : "+ type);
            System.out.println("");
            
           boolean isvalid = true;
            while(isvalid){
            System.out.print("\nWould You like to run again : (y for Yes) : ");
            choice = sc.next().charAt(0);
                if(choice !='y' && choice !='Y' && choice != 'n' && choice != 'N'){
                    System.out.println("Invalid Input plz .. enter (y for yes and n for no) : ");
                    isvalid = true;
                }
                else{
                    isvalid=false;
                }
            }
            
            System.out.println("-----------------------------------\n\n");
            
        }
        }catch(Exception e){
            System.out.println("Type of Angle Should be Number (inteager) ");
        }

    }
}
