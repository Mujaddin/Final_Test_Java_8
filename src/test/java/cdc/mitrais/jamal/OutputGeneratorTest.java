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
public void viewOrganismList() throws Exception{
	String outputFile = "organism-list-done.txt";
	OutputGenerator.viewOrganismList(organismFile, outputFile, "Amoeba");;
	assertNotNull(Paths.get(outputFile));
	List<String> result = Files.lines(Paths.get(outputFile)).collect(Collectors.toList());

}
	@Test
	public void storeOrganismList() throws Exception{
		String outputFile = "organism-list-done.txt";
		OutputGenerator.storeOrganismList(organismFile, outputFile);
		assertNotNull(Paths.get(outputFile));
		List<String> result = Files.lines(Paths.get(outputFile)).collect(Collectors.toList());

	}
	

	
	
}
