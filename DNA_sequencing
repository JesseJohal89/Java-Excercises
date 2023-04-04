/*
program that determines whether there is a protein in a strand of DNA.

A protein has the following qualities:

It begins with a “start codon”: ATG.
It ends with a “stop codon”: TGA.
In between, each additional codon is a sequence of three nucleotides.

*/
public class DNA {

 
 
  public static void main(String[] args) {
 
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-

    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

    String dna = dna1;

    System.out.println(dna);
    System.out.println(dna.length());

    // Find start codon: 
    int start = dna.indexOf("ATG");
    System.out.println("Start: " + start);

    // Find end codon: 
    int stop = dna.indexOf("TGA");
    System.out.println("Stop: " + stop);

    // Find correct number of nucleotides: 
    int ExcessNucleotides = (stop - start) % 3;
    System.out.println("Excess Nucleotides: " + ExcessNucleotides);

    // find sequence of nucleotides
    String nucleotides = dna.substring(start+3, stop);
    System.out.println("Nucleotides: " + nucleotides);

    // proteins: 
    if(start != -1 && stop != -1 && (stop - start) % 3 == 0) {
      System.out.println("DNA strand contains a start & stop codon + correct number of nucleotides");

      String protein = dna.substring(start, stop+3);
      System.out.println("Protein: " + protein);
    }
    else {
      System.out.println("No protien found");
    }
 
  }
 
}
