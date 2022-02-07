// Have the function RectangleArea(strArr) take the array of strings stored in strArr, 
// which will only contain 4 elements and be in the form (x y) where x and y are both integers,
// and return the area of the rectangle formed by the 4 points on a Cartesian grid. 
// The 4 elements will be in arbitrary order. 

// For example: if strArr is ["(0 0)", "(3 0)", "(0 2)", "(3 2)"] 
// then your program should return 6 
// because the width of the rectangle is 3 and the height is 2 
// and the area of a rectangle is equal to the width * height.

class RectangleArea {

 public static Integer function (String[] strArr) {
    Integer x = Integer.parseInt(strArr[0].split("[^\\d-]+")[1]);
    Integer y = Integer.parseInt(strArr[0].split("[^\\d-]+")[2]);
    boolean isXset = false;
    boolean isYset = false;

    for (int i = 0; i < strArr.length; i++) {
      if (!isXset && x != Integer.parseInt(strArr[i].split("[^\\d-]+")[1])) {
        x = x - Integer.parseInt(strArr[i].split("[^\\d-]+")[1]);
        isXset = true;
      }
      if (!isYset && y != Integer.parseInt(strArr[i].split("[^\\d-]+")[2])) {
        y = y - Integer.parseInt(strArr[i].split("[^\\d-]+")[2]);
        isYset = true;
      }
    }
    return Math.abs(x * y);
  }

  public static void main (String[] args) {  
    System.out.print(function (new String[] {"(0 0)", "(3 0)", "(0 2)", "(3 2)"})); 
  }
}