// Have the function WordCount(str) take the str string parameter being passed and 
// return the number of words the string contains

// (e.g. "Never eat shredded wheat or cake" would return 6). 
// Words will be separated by single spaces.

class WordCount {

  public static int function (String str) {
    return str.split(" ").length;
  }

  public static void main (String[] args) {  
    System.out.print(function("Coderbyte")); 
  }
}