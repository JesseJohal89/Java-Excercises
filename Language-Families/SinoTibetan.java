class SinoTibetan extends Language {

    SinoTibetan(String languageName, int speakers) {
    super(languageName, speakers, "Asia", "subject-object-verb");

        if (languageName.contains("Chinese")) {
          this.wordOrder = "subject-verb-object";
        }
        else if (languageName.contains("Bai")) {
          this.wordOrder = "subject-verb-object";
        }
        else if (languageName.contains("Karenic")) {
          this.wordOrder = "subject-verb-object";
        }
        else if (languageName.contains("Mruic")) {
          this.wordOrder = "subject-verb-object";
        }
  }

}
