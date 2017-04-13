package cdc.mitrais.jamal;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;



public class OutputGeneratorTest {
String inputFile = "enable1-word-list.txt";
String searchFile ="searchParameter.txt";
String organismFile="organism-list.txt";
	@Test
	public void nLetterWord() throws Exception {	
		assertEquals(OutputGenerator.nLetterWord(inputFile, 10), "aardwolves");
	}
	
	@Test
	public void abcWord() throws Exception{	
		assertEquals(OutputGenerator.abcWord(inputFile), "abacuses");
	}
	
	@Test
	public void abcWordMixedCase() throws Exception{	
		assertEquals(OutputGenerator.abcWordMixedCase(inputFile), "abacuses");
	}
	
	@Test
	public void longestWordWithout() throws Exception{	
		assertEquals(OutputGenerator.longestWordWithout(inputFile, "a", "e"), "psychophysiologists");
	}
	
	@Test
	public void shortestWordWith() throws Exception{	
		assertEquals(OutputGenerator.shortestWordWith(inputFile, "q"), "qat");
	}
	
		
	@Test
	public void storeOrganismList() throws Exception{
		String outputFile = "organism-list-done.txt";
		OutputGenerator.storeOrganismList(organismFile, outputFile);
		assertNotNull(Paths.get(outputFile));
		List<String> result = Files.lines(Paths.get(outputFile)).collect(Collectors.toList());
//		assertEquals(result.get(0), "BOWWOW!");
//		assertEquals(result.get(1), "BOWWOWED!");
//		assertEquals(result.get(2), "BOWWOWING!");
//		assertEquals(result.get(61), "WOWSERS!");
//		assertEquals(result.size(), 62);
	}
	

	
	
}
