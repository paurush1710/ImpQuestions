class Main {
    public static void main(String[] args) {
        
        String fruit = "Apple";
        
        switch(fruit)
        {
            case "Mango":
                System.out.println("This is Mango");
                break;
                
            case "Apple":
                System.out.println("This is Apple");
                break;
                
            default:
                System.out.println("Other Fruit");
        }

        // Enhanced Switch (new way)

        switch("Apple"){
            case "Apple" -> System.out.println("This is Apple");
            case "Mango" -> System.out.println("This is Mango");
            default -> System.out.println("Other Fruit");
        }
        
    }
}
