public class RomanToInt {
    public static int romanToInt(String s) {
        int value = 0;
        for(int i = 0; i < s.length(); i++){
            //first we  check if the character is not the last one
            if((i+1) < s.length()){
                //comparing it with the next character
                if(valueOf(s.charAt(i)) >= valueOf(s.charAt(i+1))){
                    value += valueOf(s.charAt(i));
                }
                else{
                    value += valueOf(s.charAt(i+1)) - valueOf(s.charAt(i));
                    i++;
                }
            }
            //if it is the last one, we just add it's value
            else{
                value += valueOf(s.charAt(i));
            }
        }
        return value;
    }

    private static int valueOf(char roman) {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }

    public static void main (String[] args) {
        //II (2), III(3), IV(4), XXVII(27)
        romanToInt("IV");
    }
}
