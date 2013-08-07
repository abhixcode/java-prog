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
		Locale currentLocale = Locale.US;
		String property_file_path = "org/aby/javaprog/ResourceExamples";
		//ResourceExamples.properties file is placed inside the package
		ResourceBundle bundle = ResourceBundle.getBundle(property_file_path, currentLocale);
		ResourceBundle bundle_sp = ResourceBundle.getBundle(property_file_path, new Locale("sp"));
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
