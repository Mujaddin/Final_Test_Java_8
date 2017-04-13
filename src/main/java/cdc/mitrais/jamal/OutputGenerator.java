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
	  
	  public static String nLetterWord(String inputFile, int wordLength) throws Exception {
		  
			    return Files.lines(Paths.get(inputFile),StandardCharsets.UTF_8).filter(s->s.length()==(wordLength))
	    		.findFirst()
	    		.get();
	  }
	  
	  public static String abcWord(String inputFile) throws Exception {
		  
	    return Files.lines(Paths.get(inputFile),StandardCharsets.UTF_8)
	    		.filter(s->s.length()==8)
	    		.filter(s->s.contains("a")&&s.contains("b")&&s.contains("c"))
	    		.findFirst()
	    		.get();
	  }
	  
	  public static String abcWordMixedCase(String inputFile) throws Exception {
		
	    return Files.lines(Paths.get(inputFile),StandardCharsets.UTF_8)
	    		.filter(s->s.length()==8)
	    		.map(s->s.toLowerCase())
	    		.filter(s->s.contains("a")&&s.contains("b")&&s.contains("c"))
	    		.findFirst()
	    		.get();
	  }
	  
	  public static String longestWordWithout(String inputFile, String letter1, String letter2) throws Exception {
		
	    return Files.lines(Paths.get(inputFile),StandardCharsets.UTF_8)
	    		.filter(s->!s.contains(letter1)&&!s.contains(letter2))
	    		.reduce((name1,name2)->name1.length() >= name2.length() ? name1 : name2)
	    		.get();
	  }
	  
	  public static String shortestWordWith(String inputFile, String letter) throws Exception {
		  
		 
	    return Files.lines(Paths.get(inputFile),StandardCharsets.UTF_8)
	    		.filter(s->s.contains(letter))
	    		.sorted()
	    		.reduce((name1,name2)->name1.length() <= name2.length() ? name1 : name2)
	    		.get();
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