import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;
import java.util.function.Function;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Solution {

	public static void main(String[] args) {

//  Ways to Initialize a list

//		List<Integer> list = Arrays.asList(2,5,1,8,9,10,12,7);              // Arrays.asList() -> Immutable, will thrown exception on add,delete
//		List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4));      // Mutable -> Alternate to Arrays.asList() 
//		List<Integer> list3 = Stream.of(1,2,3).collect(Collectors.toList());

		List<Integer> list = Arrays.asList(2, 5, 1, 8, 9, 10, 12, 7);

		// Find first element in the list

		list.stream().findFirst().ifPresent(System.out::println);

//		Optional<Integer> findF = list.stream().findFirst();          // Without ifPresent()
//		System.out.println("Find First"+findF.get().intValue());

//  Find total count of elements in the list

		long count = list.stream().count(); // Return type of count is LONG
		System.out.println(count);

//  Find Max number
		int max = list.stream().max(Integer::compare).get(); // .max() -> Return Object<Integer>, We'll have to retrieve
																// the value by max.get().intValue()
		System.out.println("Max : " + max); // max().get() -> Return Integer value
//		Optional<Integer> max2 = list.stream().max(Integer::compare);
//		System.out.println(max2.get());

//  Find Min Value

		int min = list.stream().min(Integer::compare).get();
		System.out.println("Min : " + min);

//  Find max element in an Array

		int[] arr = { 17, 2, 9, 5, 344, 213, 98, 100 };
		int arrMax = Arrays.stream(arr).max().getAsInt();
		System.out.println("Array Max : " + arrMax);

		arrMax = Arrays.stream(arr).boxed().max(Integer::compare).get();
		System.out.println("Array Max using stream terminal fn : " + arrMax);

//  Sort Map based on Values

		Map<String, Integer> map = new HashMap<>();
		map.put("name1", 3);
		map.put("name2", 27);
		map.put("name3", 17);
		map.put("name5", 68);
		map.put("name6", 48);

		map.entrySet().stream().sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue())).forEach(System.out::println);

//  Sort Map based on key

		map.entrySet().stream().sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
				.forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

//  Find max value in map
		map.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).findFirst()
				.ifPresent(System.out::println);

//  Find 2nd Highest number in Map
		map.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).skip(1).findFirst()
				.ifPresent(System.out::println);

//  Find 3rd Highest from List

		list.stream().sorted((e1, e2) -> e2.compareTo(e1)).skip(2).findFirst().ifPresent(System.out::println);

//  Find 3rd highest from ArrayList
    
		Arrays.stream(arr).boxed().sorted((e1, e2) -> e2.compareTo(e1)).skip(2).findFirst()
				.ifPresent(System.out::println);
		int l = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
		System.out.println(l);

//  Sort a List

		list.stream().sorted().forEach(System.out::println);
		// map.entrySet().stream().sorted().forEach(System.out::println); // Throws
		// exception as key or value has to be mentioned for comparison

		// Sort an Array
		int[] arr2 = { 3, 1, 7, 90, 32, 65, 13, 24 };
		Arrays.parallelSort(arr2);
		Arrays.stream(arr2).forEach(System.out::println);
		Arrays.stream(arr2).sorted().skip(2).findFirst().ifPresent(System.out::println); // No need of using boxed
		Arrays.stream(arr2).boxed().sorted().skip(2).findFirst().ifPresent(System.out::println); // Will work -> Same
																									// Result

//  Finding out all Even numbers in List

		list.stream().filter(e -> e % 2 == 0).forEach(System.out::println);

//  Finding out all Odd numbers in List

		list.stream().filter(e -> e % 2 != 0).forEach(e -> System.out.print(e + " "));

//  Find all Numbers starting with 1

		list.stream().map(e -> "" + e).filter(e -> e.startsWith("1")).forEach(System.out::println);
		list.stream().map(e -> "" + e).filter(e -> e.startsWith("1")).sorted().forEach(System.out::println); // Sorted
																												// Order

//  Finding numbers ending with 5

		list.stream().map(n -> n + "").filter(n -> n.endsWith("5")).forEach(System.out::println);

//  Sort by Marks

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("Math", 98);
		hm.put("Data Structure", 85);
		hm.put("Database", 91);
		hm.put("Java", 95);
		hm.put("Operating System", 79);
		hm.put("Networking", 80);

		hm.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).forEach(System.out::println);

//      One Way to Store Map in List by using Entry
//      List<Entry<String, Integer>> l = hm.entrySet().stream().sorted((e1,e2)-> e2.getValue().compareTo(e1.getValue())).collect(Collectors.toList());
//      2nd Way - Fetch out value or key with help of Map and then store
//      List<Integer> l = hm.entrySet().stream().sorted((e1,e2)-> e2.getValue().compareTo(e1.getValue())).map(e-> e.getValue()).collect(Collectors.toList());
//      Storing values again Map don't make sense as order is not maintained
//      Map<String,Integer> map2 = hm.entrySet().stream().sorted((e1,e2)-> e2.getValue().compareTo(e1.getValue())).collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));

//	Program to perform cube on list elements and filter numbers greater than 50

		List<Integer> list2 = Arrays.asList(1, 3, 4, 7, 10, 17);

		list2.stream().map(e -> e * e * e).filter(e -> e > 50).forEach(System.out::println);

//  Convert each element of the list to UpperCase

		List<String> names = Arrays.asList("aA", "bac", "xxz");
		names.stream().map(String::toUpperCase).forEach(System.out::println);
		names.stream().map(String::toLowerCase).forEach(System.out::println);

//  Count each element/word from the String ArrayList in Java8

		List<String> name = Arrays.asList("AA", "BB", "CC", "BB", "AA");
		Map<String, Long> map3 = name.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map3);
//		name.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().forEach(System.out::println);;

//	Find only duplicate elements with its count from the String ArrayList

		name.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).forEach(System.out::println);

//	Print the count of each character in a String

		String s = "string data to count each character";
		Map<String, Long> map4 = Arrays.stream(s.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));

		System.out.println(map4);

//	Get the current date and time using Java 8 Date and Time API

		System.out.println("Current local Date: " + java.time.LocalDate.now());
		System.out.println("Current local Time: " + java.time.LocalTime.now());
		System.out.println("Current Local Date and Time: " + java.time.LocalDateTime.now());

//	Concatenate 2 Streams

		List<String> l1 = Arrays.asList("Ram", "Shyam");
		List<String> l2 = Arrays.asList("Sita", "Gita", "Veena");
		Stream<String> concatStream = Stream.concat(l1.stream(), l2.stream());
		System.out.println();
//		concatStream.forEach(System.out::print);
		concatStream.forEach(e -> {
			System.out.print(e + " ");
		});

//	Given an integer array nums, return true if any value appears at least twice in the array, 
//	and return false if every element is distinct

		List<Integer> list11 = Arrays.asList(1, 2, 3, 4, 1, 5);

		List<Integer> list11a = Arrays.asList(1, 2, 3, 4, 5, 6);

		Set<Integer> set11 = new HashSet<>();
		List<Integer> x = list11.stream().filter(e -> !set11.add(e)).collect(Collectors.toList());

		if (x.size() == 0) {
			System.out.println("Distinct Element:x");
		}

		if (x.size() > 0) {
			System.out.println("Duplicate element present:x");
		}

		Set<Integer> set11a = new HashSet<>();
		System.out.println();
		List<Integer> xa = list11a.stream().filter(e -> !set11a.add(e)).collect(Collectors.toList());

		if (xa.size() == 0) {
			System.out.println("Distinct Element:xa");
		}

		if (xa.size() > 0) {
			System.out.println("Duplicate element present:xa");
		}

//	Given a String, find the first non-repeated character in it using Stream

		String input = "Java articles are Great";
		Character c = input.chars().mapToObj(e -> Character.toLowerCase(Character.valueOf((char) e)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1L).map(e -> e.getKey()).findFirst().get();

		System.out.println(c);

//	Given a String, find the first repeated character in it using Stream functions

		String input2 = "Java Articles are Awesome";
		Character result2 = input2.chars().mapToObj(e -> Character.toLowerCase(Character.valueOf((char) e)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() > 1L).map(e -> e.getKey()).findFirst().get();
		System.out.println(result2);

	}

}
