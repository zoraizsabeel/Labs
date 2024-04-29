import java.util.Scanner;

public class Lab2 {
    public static Boolean checkState(String t, String s)
    {
        t = t.replaceAll(" ", "");
        s = s.replaceAll(" ", "");
        int tSize = t.length();
        int sSize = s.length();
        if(tSize == sSize)
        {
            return true;
        }
        else{
            return false;
        }
        
    }

    public static Boolean anagram(String t, String s)
    {
        int size = t.length();
        //if t.lenght == s.length and !t.equalTo(s)
        //  loop through charachters in t and check for the characheters in s
        // if all are true return true;
        Boolean condition = checkState(t, s);
        if(condition)
        {
            for(int i = 0; i < size; i++)
            {
                for(int j = 0; j < size; j++)
                {
                    if(t.charAt(i) == s.charAt(j)){
                        break;
                    }
                    else if (j == size-1 && t.charAt(i) != s.charAt(j))
                    {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;

    }

    public static void main(String[] args)
    {
        String t; 
        String s;
        Scanner scan = new Scanner(System.in);

        System.out.println("first :");
        t = scan.next();
        System.out.println("next: ");
        s = scan.next();

        
        System.out.println(anagram(t, s));
    }






}
