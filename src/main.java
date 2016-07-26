import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class main {
	public static void main(String[] args) {
		List<String> string = new ArrayList<>();
		string.add("abc");
		string.add("def");
		string.add("ght");
		int k=0;		
		for(int i=0; i<6 ;i++){
			for(int j=0; j<6 ;j++){
				string.add("sdfa");
				//System.out.println(string.get(k++));
			
			}
		}
		
		
		Iterator it = string.iterator();
		  while(it.hasNext()){  
			   System.out.println(it.next());
			   }  
	}

}
