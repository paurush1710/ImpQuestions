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

        int i = 5;
        switch(i)
        {
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }

        // nested Switch

        int id = 3;
        String department = "IT";

        switch(id){
            case 1:
                 System.out.println("Paurush Sharma");
                 break;
                
            case 2:
                 System.out.println("Ram Sharma");
                 break;
                 
            case 3:
                 System.out.println("Shyam Sharma");
                 switch(department)
                 {
                     case "IT":
                         System.out.println("Info Tech dept");
                         break;
                         
                    case "Mech":
                        System.out.println("Mechanical dept");
                        break;
                        
                    default:
                        System.out.println("No dept");
                 }
                 break;
                 
            default:
                 System.out.println("No Employee");
        }

        // enhanced nested switch

        switch(id){
            case 1 -> System.out.println("Paurush Sharma");
            case 2 -> System.out.println("Ram Sharma");
            case 3 -> {
                System.out.println("Shyam Sharma");
                switch(department){
                    case "IT"-> System.out.println("Info Tech dept");
                    case "Mech" -> System.out.println("Mechanical dept");
                    default -> System.out.println("No dept");
                }
            }
            default -> System.out.println("No emp");
        }
        
    }
}
