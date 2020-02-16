package java8;

import java.util.Arrays;
import java.util.List;
/*This program demonstrates various methods provided by streams in java8*/
public class StreamApiFeatures {

	public static void main(String[] args) {
		String[] strArray = new String[] {"january","february","march","april","may","jun","july","august","september","october","november","december"};
		List<String> list = Arrays.asList(strArray);
		list.stream().forEach(System.out::println);

	}
}
