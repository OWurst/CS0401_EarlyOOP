import java.util.*;
import java.util.Scanner;
import java.io.*;
public class Fleet{
	public static void main(String[] args) throws Exception{

		ArrayList<Vehicle> cars = new ArrayList<Vehicle>();

		Scanner kbd = new Scanner(System.in);
		System.out.print("Please enter the name of the file you would like read: ");

		File infile = new File(kbd.next());
		Scanner fileReader = new Scanner(infile);

		while(fileReader.hasNextLine()){
			String vType = fileReader.next();
			if(vType.equals("A")){    /////// first value on all lines of file must be A,T, or MC for specific vehicle class
				String make = fileReader.next();    //other values must be stored in this order, remember different vehicles require slightly different values
				String model = fileReader.next();
				int weight = fileReader.nextInt();
				String color = fileReader.next();
				int year = fileReader.nextInt();
				double mpg = fileReader.nextDouble();
				int seating = fileReader.nextInt();

				Car car = new Car();

				car.setVClass("A");
				car.setMake(make);
				car.setModel(model);
				car.setWeight(weight);
				car.setColor(color);
				car.setYear(year);
				car.setMPG(mpg);
				car.setSeating(seating);

				cars.add(car);
			}
			else if (vType.equals("T"))
			{
				String make = fileReader.next();
				String model = fileReader.next();
				int weight = fileReader.nextInt();
				String color = fileReader.next();
				int year = fileReader.nextInt();
				double mpg = fileReader.nextDouble();
				int seating = fileReader.nextInt();
				int hauling = fileReader.nextInt();

				Truck truck = new Truck();

				truck.setVClass("T");
				truck.setModel(model);
				truck.setMake(make);
				truck.setWeight(weight);
				truck.setColor(color);
				truck.setYear(year);
				truck.setMPG(mpg);
				truck.setSeating(seating);
				truck.setHauling(hauling);

				cars.add(truck);
			}
			else if (vType.equals("MC"))
			{
				String make = fileReader.next();
				String model = fileReader.next();
				int weight = fileReader.nextInt();
				String color = fileReader.next();
				int year = fileReader.nextInt();
				double mpg = fileReader.nextDouble();

				Motorcycle motorcycle = new Motorcycle();

				motorcycle.setVClass("MC");
				motorcycle.setMake(make);
				motorcycle.setModel(model);
		   		motorcycle.setWeight(weight);
				motorcycle.setColor(color);
				motorcycle.setYear(year);
				motorcycle.setMPG(mpg);

				cars.add(motorcycle);
			}
		}

		System.out.println("What vehicle class would you like to list?(A: Automobile, T: Truck, MC: Motorcycle): ");
		String search = kbd.next();
		int count = 0;

		for(Vehicle car : cars)
		{
			String vclass = car.getVClass();
			if (vclass.equals(search)) 
			{
				car.stats();
				count++;
			}					
		}

		System.out.println( count + " vehicles of the " + search + " class have been found and returned by your search");

		kbd.close();
		fileReader.close();
	}
}
