package org.aby.javaprog;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
import static java.lang.System.out;

public class ResourceBundleDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ResourceExamples.properties file is placed inside the package
		ResourceBundle bundle = ResourceBundle.getBundle("org/aby/javaprog/ResourceExamples");
		ResourceBundle bundle_sp = ResourceBundle.getBundle("org/aby/javaprog/ResourceExamples", new Locale("sp"));
		Enumeration<String> keys = bundle.getKeys();
		while(keys.hasMoreElements()){
			String key = (String)keys.nextElement();
			out.println(key + " : " + bundle.getString(key));
		}
		
		keys = bundle_sp.getKeys();
		while(keys.hasMoreElements()){
			String key = (String)keys.nextElement();
			out.println(key + " : " + bundle_sp.getString(key));
		}
	}
}
