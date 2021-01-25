package heon_bonus;
import java.util.Scanner;
import java.util.ArrayList;

public class Sale_bonus {
	
	public static void main(String[] args) {
		
		//Get number of salesperson
		
		Scanner scan = new Scanner(System.in);
		System.out.println ("How many salepersons' bonus to calculate? ");
		int n = scan.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		
		int offset = 0 ;
		String name,psA,psB,psC;
		double bonusA,bonusB,bonusC ;
		
		//Get input of sale info from n salesperson
		
		for (int i = 1 ; i<= n ; i ++) {
			System.out.println ("\nEnter name of "+i+ "-st salesperson: ");
			list.add(scan.next());
			System.out.println ("Product-A sales: RM");
			list.add(scan.next());
			System.out.println ("Product-B sales: RM");
			list.add(scan.next());
			System.out.println ("Product-C sales: RM");
			list.add(scan.next());
			
		}

		for(int j = 1; j <= n ; j++) {
			name = list.get(offset);
			psA = list.get(offset+1);
			psB = list.get(offset+2);
			psC = list.get(offset+3);
			offset = offset+4;
			
			//Change String into double
			
			double productA = Double.parseDouble(psA);
			double productB = Double.parseDouble(psB);
			double productC = Double.parseDouble(psC);
			
			//Calculate percentage of achievement
			
			double achA = productA / 5000 *100;
			double achB = productB / 1000 *100;
			double achC = productC / 2500 *100;
			
			//Determine bonus for Product A
			
			if (achA >= 80) {
				bonusA = 0.25;
			} else if (achA >= 50) {
				bonusA = 0.15 ;
			} else if (achA >= 20) {
				bonusA = 0.05 ;
			} else {
				bonusA = 0.00 ;
			}
			
            //Determine bonus for Product B
			
			if (achB >= 80) {
				bonusB = 0.25;
			} else if (achB >= 50) {
				bonusB = 0.15 ;
			} else if (achA >= 20) {
				bonusB = 0.05 ;
			} else {
				bonusB = 0.00 ;
			}
			
            //Determine bonus for Product C
			
			if (achC >= 80) {
				bonusC = 0.25;
			} else if (achC >= 50) {
				bonusC = 0.15 ;
			} else if (achC >= 20) {
				bonusC = 0.05 ;
			} else {
				bonusC = 0.00 ;
			}
			
			//Calculation
			
			double valueA = bonusA * productA ; 
			double valueB = bonusB * productB ; 
			double valueC = bonusC * productC ; 
			double totalbonus = valueA + valueB + valueC ; 
				
			//Display the bonus of salesperson
			
			System.out.println("\nBonus for "+ name +":");
			System.out.println("P-A:("+ bonusA*100 + "%) RM" + String.format("%.2f", valueA ));
			System.out.println("P-B:("+ bonusB*100 + "%) RM" + String.format("%.2f", valueB ));
			System.out.println("P-C:("+ bonusC*100 + "%) RM" + String.format("%.2f", valueC ));
			System.out.println("========================");
			System.out.println("TOTAL BONUS: RM"+ String.format("%.2f", totalbonus ));
			System.out.println("========================");
			
		}
		System.out.println(list);
	}
	

}
