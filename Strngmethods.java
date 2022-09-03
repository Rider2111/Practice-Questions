 /*Some basic Java String Methods. */
 public class Strngmethods {

    public static void main(String args[]){
        String p="Life is like a box of chocolates. You never know what you're gonna get";
        String q="Online classes are extremely drowsy";
        System.out.println("Original strings are \np:- "+ p + "\nq:- "+q+ "\n");
        System.out.println("Now applying various string methods:- ");
        System.out.println("toLowercase method converts the string to lower case: "+ q.toLowerCase());
        System.out.println("toUpperCase method converts the string to upper case : "+ p.toUpperCase());
        System.out.println("Trim method removes spaces: "+ q.trim());
        System.out.println("The char at method gives value of an elemnt at a given index in this case index is 5 that is: "+ p.charAt(5));
        System.out.println("The lenght() method gives value of String in this case for String q is : " + q.length() );
        String r=String.format("The value of string p is: %s",p);
        System.out.println("String format returns p formatted string like this: \n"+ r);
        System.out.println("The substring method works like this in p: "+ p.substring(2,6));
        System.out.println("Boolean contain method is used to check for a value: "+ p.contains("is"));
        System.out.println("Boolean equals method to check for equality which would false for these strings : "+ p.equals(q));
        System.out.println("Empty() method to check whether the string is empty: "+ p.isEmpty()); 
        System.out.println("Concat() method is used to concatenate one string after another like this: \n" + p.concat(q));
        System.out.println("Replace() method to replace occurences: " + q.replace("extremely","very"));
        System.out.println(String.join("drowsy", "sleepy"));
        System.out.println("Intern() method returns an interned string like this: "+ p.intern());
        int ind=p.indexOf("like");
        System.out.println("indexof checks the index: "+ ind);
    }           
}
