class checkyearisleaper
{
	public static void main (String[] args) throws java.lang.Exception
	{
		for ( long i = 2021; i <= 2030; i++){
		    if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
		        System.out.println(i + " is leap year");
		    }else{
		        System.out.println(i + " is not leap year");
		        
		    }   
		}
		    

	}
}