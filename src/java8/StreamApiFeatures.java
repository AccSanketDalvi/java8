package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*This program demonstrates various methods provided by streams in java8*/
public class StreamApiFeatures {

	public static void main(String[] args) {
		String[] strArray = new String[] {"january","february","march","april","may","jun","july","august","september","october","november","december"};
		List<String> list = Arrays.asList(strArray);
		list.stream().forEach(System.out::println);
		
		/*filter predicate is used to filter the values*/
		System.out.println("************************************************************");
		list.stream().filter(f -> f.startsWith("j", 0)).forEach(System.out::println);
		
		/*Demonstration of the stream joining by method*/
		System.out.println("************************************************************");
		System.out.println(list.stream().collect(Collectors.joining(" + ")));

	}
}
