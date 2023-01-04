public class Motorcycle extends Vehicle {

  public  void setWeight(int in){
    // enforce a rule that a weight below 1000 is invalid and notify through the 'notes' field above the weight entered was invalid
    if (in > 1000)
    {
      notes += "The user entered an invalid weight of " + in + " as a weight \n";
    }
    weight = in;
  }
	public void stats(){
    System.out.println("Vehicle class is " + vclass);
		System.out.println("Vehicle make name: " + make);
		System.out.println("Vehicle model name: " + model);
		System.out.println("Vehicle model year: " + year);
		System.out.println("Vehicle weight is: " + weight);
		System.out.println("Vehicle color is: " + color);
		System.out.println("Vehicle EPA rated MPG: " + mpg);
		System.out.println(notes);


	}


}
