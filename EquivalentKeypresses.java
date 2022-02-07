// Have the function EquivalentKeypresses(strArr) read the array of strings stored in strArr
// which will contain 2 strings representing two comma separated lists of keypresses. 
// Your goal is to return the string true if the keypresses produce the same printable string 
// and the string false if they do not. 
// A keypress can be either a printable character or a backspace represented by -B. 
// You can produce a printable string from such a string of keypresses
// by having backspaces erase one preceding character.

import java.util.*; 

class EquivalentKeypresses {

  public static String function (String[] strArr) {
    String[] first = strArr[0].split(",");
    String[] second = strArr[1].split(",");

    List<String> firstList = new ArrayList<>();
    for (int i = 0; i < first.length; i++) {
      if (first[i].equals("-B")) {
        if (firstList.size() > 0) {
          firstList.remove(firstList.size()-1);
        }
        continue;
      } else {
        if (first[i] != "") {
         firstList.add(first[i]);
        }
      }
    }

    List<String> secondList = new ArrayList<>();
    for (int i = 0; i < second.length; i++) {
      if (second[i].equals("-B")) {
        if (secondList.size() > 0) {
          secondList.remove(secondList.size()-1);
        }
        continue;
      } else {
        if (second[i] != "") {
          secondList.add(second[i]);
        }
      }
    }

    if (firstList.size() != secondList.size()) {
      return "false";
    }

    for (int i = 0; i < firstList.size(); i++) {
      if (!firstList.get(i).equals(secondList.get(i))) {
        return "false";
      }
    }
    return "true";
  }

  public static void main (String[] args) {  
    System.out.print(function (new String[] {"a,b,c,d", "a,b,c,d,d,-B"})); 
  }
}