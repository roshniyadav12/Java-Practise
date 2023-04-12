import java.io.File;
import java.io.IOException;
public class File1{
	public static void main(String args[]){
		try{File f1=new File("D:Student.txt");
				if(f1.createNewFile()){
					System.out.println(f1.getName()+"is created");
				}
		else{
			System.out.println("q");
		}}
		catch(IOException e){
		System.out.println("Unexpected Error");
		}
	}
}