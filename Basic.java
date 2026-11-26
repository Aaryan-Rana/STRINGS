public class Basic {
    public static void main(String[] args) {
        String firstName = "Aaryan";
        System.out.println(firstName); 
        System.out.println(firstName.length());
        System.out.println(firstName.chars());
        System.out.println(firstName.charAt(2));
        System.out.println(firstName.toLowerCase());
        System.out.println(firstName.toUpperCase());
        System.out.println(firstName.substring(3));
        // System.out.println(firstName.equals());

        //STRING COMPARISON

       String a = new String("JAVA");
       String b = new String("JAVA");
       System.out.println(a == b);
       System.out.println(a.equals(b));

    //STRING CONCATENATION 

       String name = "Aaryan";
       int age = 19;
       String message = "Name: " + name + " , Age: " + age;
       System.out.println(message);

    }
    
}
