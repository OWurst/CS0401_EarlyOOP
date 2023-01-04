public class Vehicle {
	public String vclass = "";
  	public String make = "";
	public String model = "";
	public int weight = 0;
	public String color = "";
	public double mpg = 0.0;
	public int year = 0000;
	public String notes = "System notes: \n";
	
	public Vehicle(){
	}
		public Vehicle(String vclass, String inmake, String inmodel,int inweight,String incolor,double inmpg,int inyear){
		
		setVClass(vclass);
    		setMake(inmake);
		setModel(inmodel);
		setWeight(inweight);
		setColor(incolor);
		setMPG(inmpg);
		setYear(inyear);
	}



  	public void setVClass(String in){
    		vclass = in.toUpperCase();
  	}
  	public String getVClass(){
    		return vclass;
  	}

	public  void setModel(String in){
		model = in.toUpperCase();
	}

	public  String getModel(){
		return model;
	}

	public void setMake(String in){
		make = in.toUpperCase();
	}

	public String getMake(){
		return make;
	}

	public  void setWeight(int in){
		// enforce a rule that a weight below 1000 is invalid and notify through the 'notes' field above the weight entered was invalid
		if (in < 1000)
		{
			notes += "The user entered an invalid weight of " + in + " as a weight \n";
		}
		weight = in;
	}
	public  int getWeight(){
		return weight;
	}
	public  void setColor(String in){
		color = in;
	}
	public  String getColor(){
		return color;
	}

	public  void setYear(int in){
		//make sure year isnt prior to 1930 or notify in notes an invalid year was entered
		if (in < 1930)
		{
			notes += "The user entered an invalid year of " + in +  " for vehicle model year\n";
		}
		year = in;

	}
	public  int getYear(){
		return year;
	}
	public  void setMPG(double in){
		mpg = in;
	}
	public  double getMPG(){
		return mpg;
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
