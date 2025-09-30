// Name: Jian Acol
// Description: This program will create methods in which it works with strings and modifies them.

public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    //Precondition: None
    //Postcondition: will add the input onto the end of the letters string
    public void add(String word){
        letters += word;
    }


    //Use Math.random() to get a random character from the letters string and return it.
    //Precondition: Must characters inside of letters string to properly work
    //Postcondition: returns a random letter from the letters string
    public char randomLetter(){
        int number = (int) (Math.random() * letters.length());
        return letters.charAt(number);
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    //Precondition: Must already have something in the company string and letters string
    //Postcondition: WIll return letters with the company name directly in the middle of the said string.
    public String companyCentered(){
        int middle = (letters.length()/2);
        return letters.substring(0,middle) + company + letters.substring(middle);
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    //Precondition: Must have a letters string
    //Postcondtion: If there is a vowel(s) in the letters string, the first instance of a vowel is removed.
    public void removeFirstVowel(){
        letters = letters.replaceFirst("[AEIOUaeiou]", "");
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    //Precondition: Must already have something in the letters string
    //Postcondition: It will return letters with the specified number of letters removed at a random place in the string.
    public void removeSome(int num){
        int index = (int) (Math.random() * (letters.length() - num));
        letters = letters.substring(0,index) + letters.substring(index + num);
    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    //Precondition: It will still run, but needs the word "word" in the letters string to properly work
    //Postcondition: It makes letters remove the word "word" in the letters string
    public void removeWord(String word){
        letters = letters.replace("word", "");
    }
}
