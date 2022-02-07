// Have the function MovingMedian(arr) read the array of numbers stored in arr 
// which will contain a sliding window size, N, as the first element in the array 
// and the rest will be a list of numbers. 
// Your program should return the Moving Median for each element based on the element
// and its N-1 predecessors, where N is the sliding window size. 
// The final output should be a string with the moving median corresponding to each entry 
// in the original array separated by commas.

// Note that for the first few elements (until the window size is reached), 
// the median is computed on a smaller number of entries. 

//For example: if arr is [3, 1, 3, 5, 10, 6, 4, 3, 1] 
// then your program should output "1,2,3,5,6,6,4,3"

import java.util.*; 

class MovingMedian {
  public static String function (int[] arr) {
    int slidingWindowSize = arr[0];
    LinkedList<Integer> list = new LinkedList<>();
    for (int item : arr) {
      list.add(item);
    }
    list.pop(); //remove the first element
    //DEBUG: System.out.println("LinkedList:" + list);
    List<Integer> leadingList = new ArrayList<>();
    List<Integer> answers = new ArrayList<>();

    for (int i = 0; i < list.size(); i++) {
      if (i == 0) {
        if (slidingWindowSize > list.size()) {
          slidingWindowSize = list.size();
        }
        for (int j = 0; j < slidingWindowSize; j++) {
          leadingList.add(list.get(j));
          //DEBUG: System.out.println("i: " + i + ", Leading list size: " + leadingList);
          answers.add(getMedian(leadingList));
        }
      } else if (i != 0 && i <= list.size() - slidingWindowSize) {
        List<Integer> movingList = new ArrayList<>();
        int count = 0;
        while (count < slidingWindowSize) {
          movingList.add(list.get(i+count));
          count++;
        }
        //DEBUG: System.out.println("i: " + i + ", Moving list size: " + movingList);
        answers.add(getMedian(movingList));
      }
    }

    StringBuilder builder  = new StringBuilder();
    for (int i = 0; i < answers.size(); i++) {
      builder.append(String.valueOf(answers.get(i)));
      if (i < answers.size()-1) {
        builder.append(",");
      }
    }
    return builder.toString();
  }

  private static int getMedian(List<Integer> list) {
    Collections.sort(list); 
    int median = 0;
    if (list.size() % 2 == 0) {
      //NOTE: even size: the average of the two middle elements.
      median = (list.get(list.size()/2) + list.get(list.size()/2 -1)) / 2;
      //DEBUG: System.out.println("even median: " +  median);
    } else {
      //NOTE: odd size: the center-most element is the median.
      median = list.get(list.size()/2);
      //DEBUG: System.out.println("odd median: " +  median);
    }
    return median; 
  }

  public static void main (String[] args) {  
    System.out.print(function (new int[] {3, 1, 3, 5, 10, 6, 4, 3, 1})); 
  }
}