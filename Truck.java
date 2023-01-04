public class Truck extends Vehicle {
	private int seating;
  	private int hauling;

	public void setSeating(int in){
		seating = in;
	}

	public int getSeating(){
		return seating;
	}

  	public void setHauling(int in){
    	hauling = in;
  	}

  	public int getHauling(){
    	return hauling;
  	}

	public void stats(){
		System.out.println("Vehicle class is " + vclass);
		System.out.println("Vehicle make name: " + make);
		System.out.println("Vehicle model name: " + model);
		System.out.println("Vehicle model year: " + year);
		System.out.println("Vehicle weight is: " + weight);
		System.out.println("Vehicle color is: " + color);
		System.out.println("Vehicle EPA rated MPG: " + mpg);
		System.out.println("Vehicle seating capacity: " + seating); //extra line of output to show the extra datafield
    	System.out.println("Vehicle hauling capacity: " + hauling);
		System.out.println(notes);
	}
}
