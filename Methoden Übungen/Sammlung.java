
/**
 * A set of methods for training.
 *
 * @author Porygon
 * @version beta1
 */
public class Sammlung
{
    // instance variables 
    String zeichenkette = "Hallo Welt"; // oder =wort ""
    char zeichen = 'k';
    int zahl = 96; // kann keine kommazahl sein
    //float kommazahl = 66.5;
    // EigeneKlasse eigenesObjekt;
    boolean wahrFalschAussage;

    /**
     * Constructor for objects of class Methoden
     */
    public Sammlung()
    {
        
    }

    /**
     * Check for the existence of char in String
     *
     * @param  c -> a char to be found in a given String
     * @param s -> a String in which a char is to be found
     * @return    boolean(true/false) for existence of char within String
     */
    public boolean istCharInString(char c, String s)
    {
        char[] chars = s.toLowerCase().toCharArray();
        c = Character.toLowerCase(c);
        for (char item : chars) {
            if (item == c) {
                return true;
            } else {
                continue;
            }
        }
        return false;
    }
    
    /**
     * Check for the amount of char in String
     *
     * @param  c -> a char to be found in a given String
     * @param s -> a String in which the amount of a char is checked
     * @return    boolean(true/false) for existence of char within String
     */
    public int mengeAnCharInString(char c, String s)
    {
        char[] chars = s.toLowerCase().toCharArray();
        c = Character.toLowerCase(c);
        int amount = 0;
        for (char item : chars) {
            if (item == c) {
                amount = amount +1;
            } else {
                continue;
            }
        }
        return amount;
    }
    
    /**
     * Turn the last 3 character of a String to UPPERCASE
     *
     * @param s -> a String in which the amount of a char is checked
     * @return    changed String
     */
    public String changeLastThreeCharToUpper(String s)
    {
        char[] chars = s.toLowerCase().toCharArray();
        for (int i = 1; i <= 3; i++) {
            //check for negative position in array and if dont continue
            chars[chars.length -i] = Character.toUpperCase(chars[chars.length -i]);
        }
        String changedString = new String(chars);
        return changedString;
    }
    
    
    public void loops() {
    
        for (int i = 0; i<3; i++) {
            System.out.println("hello world!"); // say "hello world" 3 times
        }
        
        int j = 0;
        while (j<3) { //solange true -> ausführen
            System.out.println("hello world!"); // say "hello world" 3 times
            j++;
        }
        
        int k = 0;
        do {
            System.out.println("hello world!"); // say "hello world" 3 times
            k++;
        }while (k<3);
        
    }
    
    public void verzweigungen() {
        
        int j = 0;
        if (j<3) { // wenn true -> ausführen
            System.out.println("hello world!"); // say "hello world" 1 times
            j++;
        } else if (j<2) {
            System.out.println("hello world!"); // say "hello world" 1 times
            j++;
        } else {
        
        }
        
    }
}
