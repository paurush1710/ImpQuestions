HashMap<String, Integer> hm = new HashMap<String, Integer>();
 
        // enter data into hashmap
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);

         Map<Object, Object> hm2 = hm.entrySet().stream()
        .sorted(Entry.comparingByValue())
        .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,e2)-> e1, LinkedHashMap::new));
        
        System.out.println(hm2);

// {Chemistry=45, Operating System=64, English=79, Networking=80, Maths=86, Hindi=95, Java=97}

       hm.entrySet().stream().sorted((e1,e2) -> e1.getValue().compareTo(e2.getValue())).forEach(e -> System.out.println(e.getKey()+" "+e.getValue()));
     
------------------------------------------

Map<String, Long> map = str.stream(split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting());
sysout(map);

------------------------------------------

