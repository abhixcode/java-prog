package org.aby.javaprog;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TryWithResourcesDemo {

	public static void main(String[] args) {
		
		try(BufferedReader reader = Files.newBufferedReader(Paths.get(new URI("file:/D:/DevX/Git/java-prog/JavaProgramming/src/org/aby/javaprog/dataread.txt")), Charset.defaultCharset());
				BufferedWriter writer = Files.newBufferedWriter(Paths.get(new URI("file:/D:/DevX/Git/java-prog/JavaProgramming/src/org/aby/javaprog/datawrite.txt")), Charset.defaultCharset())){
			String input;
			while((input = reader.readLine()) != null){
				writer.write(input);
				writer.newLine();
			}
		}catch(URISyntaxException | IOException e){
			e.printStackTrace();
		}

	}

}
