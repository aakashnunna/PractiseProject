package com.aakash.spliterator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;

public class CreatingSpliterator {
	
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		
		Path path = Paths.get("C:\\Users\\annunna\\Documents\\workspace-sts-aakashourse\\JavaCol\\src\\com\\aakash\\spliterator\\people.txt");
		
		try {
			
			Stream<String> lines = Files.lines(path);
			System.out.println("lines "+lines);
			
			Spliterator<String> lineSpliterator = lines.spliterator();
			
			Spliterator<Person> peopleSpliterator = null;
			
			lines.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
