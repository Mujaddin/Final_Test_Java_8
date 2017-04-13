package cdc.mitrais.jamal;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OutputGenerator {
	  
public static void viewOrganismList(String searchFile, String outputFile, String searchParams) throws Exception{
	List<String> organismList = Files.lines(Paths.get(searchFile),StandardCharsets.UTF_8)
			.filter(s->s.contains(searchParams))
			.map(s->s.replace(searchParams,""))
			.map(s->s.replace("_", ""))
			.sorted()
			.collect(Collectors.toList());
			organismList.forEach(System.out::println);
	 Files.write(Paths.get(outputFile), organismList, Charset.defaultCharset());
}
	 	  
	  
	public static void storeOrganismList(String searchFile, String outputFile) throws Exception {
		
		List<String> organismList= Files.lines(Paths.get(searchFile),StandardCharsets.UTF_8)
	    		.filter(s->s.contains("Mammals"))
	    		 .map(s->s.replace("Mammals", ""))
	    		 .map(s->s.replace("_", ""))
	    		.sorted()
	    		.collect(Collectors.toList());
		  Files.write(Paths.get(outputFile), organismList, Charset.defaultCharset());
	}
	
	public static void storeOrganismList(String searchFile, String searchType, String outputFile) throws Exception {
		// TODO Auto-generated method stub
		List<String> organismList= Files.lines(Paths.get(searchFile),StandardCharsets.UTF_8)
	    		.filter(s->s.contains(searchType))
	    		 .map(s->s.replace(searchType, ""))
	    		 .map(s->s.replace("_", ""))
	    		  .sorted()
	    		.collect(Collectors.toList());
		  Files.write(Paths.get(outputFile), organismList, Charset.defaultCharset());
	}	
		
	
	
	private OutputGenerator() {} // Uninstantiatable class
	}