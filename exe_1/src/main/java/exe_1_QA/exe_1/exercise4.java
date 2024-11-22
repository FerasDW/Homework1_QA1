package exe_1_QA.exe_1;
//Students Feras Dwere(214225021), Tarek Saleh(316448588)
public class exercise4 {
	
	public static String Calculate(double a,double b,String mode)
	{
		if(a==b) return "two equal numbers";
		
		switch(mode)
		{
		case "regular":
			
			return (a>b)? "A":"B";
		
			
		case"negative":
			return (-a>-b)? "A":"B";
			
			
		case"reciprocals":
			 if(a==0 || b==0 ) {return("Division by zero is not allowed");}
			 
			 return ((1/a)>(1/b))? "A":"B";
		
		default:
			return "error";
		}
		
	}
}
