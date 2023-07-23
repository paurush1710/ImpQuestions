import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
//		1. Finding out all Even numbers in List
		
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,22);
		list.stream().filter(n -> n%2==0).forEach(System.out::println);
//      list.stream().filter(n -> n%2==0).forEach(e-> {System.out.println(e);});
//		output - 10,8,98,22

//		2. Find all numbers starting with 1
		list.stream().map(s -> s+"").filter(s -> s.startsWith("1")).forEach(System.out::println);
		
//		2.a Finding numbers ending with 5
		
		list.stream().map(n->n+"").filter(n->n.endsWith("5")).forEach(System.out::println);
		
//		3. find duplicate elements in a given integers list
		
		List<Integer> myList = Arrays.asList(879,10,20,30,10,15,8,23,18,8);
		Set<Integer> set = new HashSet<>();
		myList.stream().filter(s-> !set.add(s)).forEach(System.out::println);
		
//		4. find the first element of the list
		
		list.stream().findFirst().ifPresent(System.out::println);
		myList.stream().findFirst().ifPresent(System.out::println);
		
//		5. find the total number of elements present in the list
		
		long count = list.stream().count();
		System.out.println("Count : "+count);
		count = myList.stream().count();
		System.out.println("Count : "+count);
		
//		6. find the maximum value element present in it using Stream
		
		int max = list.stream().max(Integer::compare).get();
		System.out.println("Max : "+max);
		max = myList.stream().max(Integer::compare).get();
		System.out.println("Max : "+max);
		
//		7. Given a String, find the first non-repeated character in it using Stream
		
		String input = "Java articles are Great";
		
		Character result = input.chars()
				.mapToObj(s-> Character.toLowerCase(Character.valueOf((char)s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting() ))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue()==1L)
				.map(entry-> entry.getKey())
				.findFirst()
				.get();
		
		System.out.println(result);
		
//		8. Given a String, find the first repeated character in it using Stream functions
		
		String input2 = "Java Articles are Awesome";
		
		Character result2 = input2.chars()
				.mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e->e.getValue()>1L)
				.map(e->e.getKey())
				.findFirst()
				.get();
		System.out.println(result2);
		
//		9. list of integers, sort all the values present in it
		
		List<Integer> list9 = Arrays.asList(10,15,8,49,18,43);
		list9.stream().sorted().forEach(System.out::println);
		
//		10. list of integers, sort all the values present in it in descending order
		
		list9.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
//	    11. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
		
		List<Integer> list11 = Arrays.asList(1,2,3,4,1,5);

		List<Integer> list11a = Arrays.asList(1,2,3,4,5,6);
		
		Set<Integer> set11 = new HashSet<>();
		List<Integer> x= list11.stream().filter(e-> !set11.add(e)).collect(Collectors.toList());
		
		if(x.size()==0) {
			System.out.println("Distinct Element:x");
		}
		
		if(x.size()>0) {
			System.out.println("Duplicate element present:x");
		}
		
		Set<Integer> set11a = new HashSet<>();
		System.out.println();
		List<Integer> xa = list11a.stream().filter(e-> !set11a.add(e)).collect(Collectors.toList());
		
		if(xa.size()==0) {
			System.out.println("Distinct Element:xa");
		}
		
		if(xa.size()>0) {
			System.out.println("Duplicate element present:xa");
		}
		
//		12. get the current date and time using Java 8 Date and Time API
		
		System.out.println("Current local Date: "+java.time.LocalDate.now());
		System.out.println("Current local Time: "+java.time.LocalTime.now());
		System.out.println("Current Local Date and Time: "+java.time.LocalDateTime.now());
		
//		13. Concatenate 2 Streams
		
		List<String> l1 = Arrays.asList("Ram","Shyam");
		List<String> l2 = Arrays.asList("Sita","Gita","Veena");
		Stream<String> concatStream = Stream.concat(l1.stream(), l2.stream());
		System.out.println();
//		concatStream.forEach(System.out::print);
		concatStream.forEach(e -> {System.out.print(e+" ");});
		
//		14. Java 8 program to perform cube on list elements and filter numbers greater than 50
		
		List<Integer> l14 = Arrays.asList(1,3,4,7,10,17);
		
		l14.stream().map(e->e*e*e).filter(e->e>50).forEach(System.out::println);
		
		System.out.println();
//		15. Write a Java 8 program to sort an array and then convert the sorted array into Stream
		
		int arr[] = {99,33,25,76,49,16,100};
		Arrays.parallelSort(arr);
		Arrays.stream(arr).forEach(e-> System.out.print(e+" "));
		
//		16. How to use map to convert object into Uppercase in Java 8
		
		List<String> names = Arrays.asList("aA", "bac");
		names.stream().map(String::toUpperCase).forEach(System.out::println);
		
//		18. How to count each element/word from the String ArrayList in Java8
		
		List<String> name = Arrays.asList("AA","BB","CC","BB","AA");
		Map<String, Long> nameCount = name.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(nameCount);
		
//		19. How to find only duplicate elements with its count from the String ArrayList
		
		name.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()>1).forEach(System.out::println);
		
//		20. How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object
		
//		21. Write a Program to find the Maximum element in an array
		
		int ar[] = {17,2,9,5,344,213,98,100};
		int arMax = Arrays.stream(ar).max().getAsInt();
		System.out.println("arMax : "+arMax);
		
//		Write a program to print the count of each character in a String
		
		System.out.println("**** After 21st ***");
		String sa = "string data to count each character";
		
		Map<String, Long> mapString = Arrays.stream(sa.split(""))
		      .map(String::toLowerCase)
		      .collect(Collectors.groupingBy(str->str, LinkedHashMap::new, Collectors.counting()));
		
        System.out.println(mapString);		

		System.out.println("**** After 21st ***");
//      Max value in a MAP
        
        Map<String, Integer> map = new HashMap<>();
        map.put("name1", 3);
        map.put("name2", 23);
        map.put("name3", 17);
        map.put("name5", 68);
        map.put("name6", 68);
        
        int maxx = Collections.max(map.values());
        
        map.entrySet().stream()
        .filter(e-> e.getValue()==maxx)
        .map(e->e.getKey())
        .forEach(System.out::println);
        
        map.entrySet().stream()
        .map(e->e.getValue()).sorted().forEach(System.out::println);
        
        System.out.println();
        
        map.entrySet().stream().map(e->e.getValue()).sorted(Collections.reverseOrder())
        .forEach(e->System.out.print(e+" "));
        
//        .collect(Collectors.toList());
        
		System.out.println();
		System.out.println("--------------------------------");
		
		// DIFF B/W Map & MapToObj
		
		Stream<Object> s = Stream.of(1,2,3);
//		Stream<Object> s = Stream.of(1,2,3);   Will compile fine
//		IntStream      s = Stream.of(1,2,3);   Will give error as Stream.of RETURN type is Stream<Integer> Object based       
		
		IntStream i = IntStream.of(1,2,3);
		
//		Stream<Object> o = IntStream.of(1,2,3); Will give error, As types are different, PRIMITIVE and Object Based

		Stream<Object> o = IntStream.of(1,2,3).mapToObj(e->e); // Will work fine, as AUTOBOXING Done
//		Stream<Object> o1 = IntStream.of(1,2,3).mapToInt(e->e); // primitive is being converted to primitive, required is Object -> sO COMPILATION ERROR
		
		IntStream is = Stream.of(1,2,3).mapToInt(e->e);
		
		System.out.println("--------------------------------");

		char c = 'a';        // PRIMITIVE , Can't perform any operations
		Character c1 = 'B';  // Object type, Can perform various operations like toUpperCase()
		
		
	}

}
