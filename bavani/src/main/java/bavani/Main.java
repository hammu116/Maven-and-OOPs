package bavani;

import java.util.Scanner;

public class Main {



	

	public static void main(String[] args) {

	int tot=0;

	NewYearChocolates ob;

	System.out.println("Menu");

	System.out.println("1. Chocolate_01");

	System.out.println("2. Chocolate_02");

	System.out.println("3. Chocolate_03");

	System.out.println("4. Sweet_01");

	System.out.println("5. Sweet_02");

	System.out.println("6. Sweet_03");

	System.out.println("7. List of gifts and their weights");

	System.out.println("8. Exit");

	while(true) {

	System.out.println("Enter your choice (1-8):");

	try {

		Scanner sc=new Scanner(System.in);

	switch(sc.nextInt())

	{

	case 1: System.out.println("Enter the weight :");

			ob=new Chocolate01();

			 tot=ob.weightOfGift(sc.nextInt());

			System.out.println("The total weight is :"+tot);

			break;

	case 2: System.out.println("Enter the weight :");

			ob=new Chocolate02();

			tot=ob.weightOfGift(sc.nextInt());

			System.out.println("The total weight is :"+tot);

			break;

	case 3: System.out.println("Enter the weight :");

			ob=new Chocolate03();

			tot=ob.weightOfGift(sc.nextInt());

			System.out.println("The total weight is :"+tot);

			break;

	case 4: System.out.println("Enter the weight :");

			ob=new Sweets01();

			tot=ob.weightOfGift(sc.nextInt());

			System.out.println("The total weight is :"+tot);

			break;

	case 5: System.out.println("Enter the weight :");

			ob=new Sweets02();

			tot=ob.weightOfGift(sc.nextInt());

			System.out.println("The total weight is :"+tot);

			break;

	case 6: System.out.println("Enter the weight :");

			ob=new Sweets03();

			tot=ob.weightOfGift(sc.nextInt());

			System.out.println("The total weight is :"+tot);

			break;

	case 7:	System.out.println("The list of each gift weights as follows : ");

	    	System.out.println("Choclate_1: "+Chocolate01.mywt);

	    	System.out.println("Choclate_2: "+Chocolate02.mywt);

	    	System.out.println("Choclate_3: "+Chocolate03.mywt);

	    	System.out.println("Sweet_1:    "+Sweets01.mywt);

	    	System.out.println("Sweet_2:    "+Sweets02.mywt);

	    	System.out.println("Sweet_3:    "+Sweets03.mywt);

	    	System.out.println("-----------------");

	    	System.out.println("Total:      "+tot);

	    	System.out.println("-----------------");

	    	break;

	case 8:sc.close();

			System.out.println();	

			System.out.println("Thank you for your gifts...");

			System.out.println("Exited Successfully");

			System.exit(0);

	default: System.out.println("Enter an input (1-8)");



	

	}

	}

	catch(Exception e)

	{

		System.out.println("Enter an integer input (1-8)");

	}

	}



	}



}
