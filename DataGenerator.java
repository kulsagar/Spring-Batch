import java.util.Random;
import java.io.PrintStream;
public class DataGenerator{

	public static void main(String ... arg)throws Exception{
		int noRecords=10;
		if(arg.length !=0){
			noRecords = Integer.parseInt(arg[0]);
		}
		System.setOut(new PrintStream("registrations.csv"));
		//System.out.println("firstName,lastName,company,address,city,state,zip,county,url,phoneNumber,fax");
		for(int i=0;i<noRecords;i++){
			for(int j=0;j<11;j++){
				int n= new Random().nextInt(10)+1;
				if(n<5){
					n+=4;
				}
				switch(j){
					case 6:
						n=6;
						break;
					case 8:
						System.out.print("www.");
						break;
					case 9:
						n=10;
						break;
					case 10:
						n=10;
						break; 
				}
				for(int k=0;k<n;k++){
					if(j==6 || j==9 || j==10){
						System.out.print(new Random().nextInt(9)+1);	
					}
					else{
						if(k!=0 || j==8){
							System.out.print((char)(new Random().nextInt(26)+97));	
						}
						else{
							System.out.print((char)(new Random().nextInt(26)+65));
						}
					}
				}
				if(j==8){
					System.out.print(".com");
				}
				if(j!=10){
					System.out.print(",");
				}
			}
			System.out.println();
		}
	}
}