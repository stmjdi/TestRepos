import java.util.LinkedList;
import java.util.Scanner;

public class SearchClass { // Example code when we make 'Search Function' for web site
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String[] strs = {"hello world","hell song","jonghos","hanbunman sajang","Bear Robotics","song, hello!"};
		
		String srchThing=sc.next();
		
		LinkedList<String> llstr = new LinkedList<>();
		
		for(int i=0;i<strs.length;i++) {
			if(strs[i].contains(srchThing)) { // core part.
				llstr.add(strs[i]);
			}
		}
		
		while(!llstr.isEmpty()) {
			System.out.println(llstr.poll());
		}
	}
}
