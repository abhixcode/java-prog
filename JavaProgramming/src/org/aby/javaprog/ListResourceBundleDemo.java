package org.aby.javaprog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListResourceBundle;
import static java.lang.System.out;

public class ListResourceBundleDemo extends ListResourceBundle{
	
	//ListResourceBundle is an abstract class with abstract method getContents()
	//getContents should be implemented in the derived class
	//Keys are always Strings, values can be any type of Object
	
	protected Object[][] getContents(){
		return new Object[][] {
				{"FILE_NOT_FOUND", "File could not be found"},
				{"FILE_EXISTS","The file already exists"},
				{"UNKNOWN", "Unknown problem with application"},
				{"PREFIXES", new ArrayList<String>(Arrays.asList("Mr.","Ms.","Dr."))}
		};
	}

	public static void main(String[] args) {
		out.println("ListResourceBundleDemo");
		
		ListResourceBundleDemo listResource = new ListResourceBundleDemo();
		out.println(listResource.getString("FILE_NOT_FOUND"));
		out.println(listResource.getString("FILE_EXISTS"));
		out.println(listResource.getString("UNKNOWN"));
		out.println(listResource.getObject("PREFIXES"));
		
		@SuppressWarnings("unchecked")
		ArrayList<String> prefix_list = (ArrayList<String>) listResource.getObject("PREFIXES");
		for(String salutation: prefix_list){
			out.println(salutation);
		}

	}

}
