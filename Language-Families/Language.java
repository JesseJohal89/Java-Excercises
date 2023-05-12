/*
LEARN JAVA
Language Families

Your Language Inheritance package has three Java files:

Language.java: for the Language parent class, which serves as the template for all languages.
Mayan.java: for Mayan, a child class of Language modeled after the Mayan language family.
SinoTibetan.java: for SinoTibetan, a child class of Language modeled after the Sino-Tibetan language family.
Build out a Java package with these classes to model real-world language families.

To run your code: java Language
To compile your code: javac Language.java

*/

class Language {
 
  protected String langName;
  protected int numSpeakers;
  protected String regionsSpoken;
 
  protected String wordOrder;

  public Language(String langName, int numSpeakers, String regionsSpoken, String wordOrder) {
        this.langName = langName;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
  }

  public void getInfo() {
    System.out.println(this.langName + " is spoken by " + this.numSpeakers +  " people mainly in " + this.regionsSpoken+ ".");
    System.out.println("The language follows the word order: " + this.wordOrder + ".");
  }

 
  public static void main(String[] args) {
   
    Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
    spanish.getInfo();

    Mayan jakaltek = new Mayan("Jakaltek", 34500);
    jakaltek.getInfo();
 
    SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1080000000);
    mandarin.getInfo();
 
    SinoTibetan burmese = new SinoTibetan("Burmese", 33000000);
    burmese.getInfo();
 


  }
 
}
