// Have the function TreeConstructor(strArr) take the array of strings stored in strArr, 
// which will contain pairs of integers in the following format: (i1,i2), 
// where i1 represents a child node in a tree and the second integer i2 signifies that 
// it is the parent of i1. 

// For example: if strArr is ["(1,2)", "(2,4)", "(7,2)"], then this forms the following tree:
// which you can see forms a proper binary tree. 
// Your program should, in this case, return the string true because a valid binary tree can be formed. 
// If a proper binary tree cannot be formed with the integer pairs, then return the string false. 
// All of the integers within the tree will be unique, which means there can only be one node 
// in the tree with the given integer value.

import java.util.*; 

public class TreeConstructor {

  public static String function (String[] strArr) {
    List<String> children = new ArrayList<>();
    List<String> parents = new ArrayList<>();
    String child = null;
    String parent = null;
    int countMax = 2;

    for (int i = 0; i < strArr.length; i++) {
      child = strArr[i].split(",")[0].replace('(', ' ');
      parent = strArr[i].split(",")[1].replace(')', ' ');
      children.add(child);
      parents.add(parent);

       if (Collections.frequency(children, child) >= countMax
       || Collections.frequency(parents, parent) > countMax) {
         return "false";
       }
    }
    return "true";
  }

  public static void main (String[] args) {  
    System.out.print(function (new String[] {"(1,2)", "(2,4)", "(7,2)"})); 
  }
}
