package tudelft.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

  private static Map<Character, Integer> map;

  static {
    map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
  }

  public int convert(String s) {

    int convertedNumber = 0;
    for (int i = 0; i < s.length(); i++) {
      int currentNumber = map.get(s.charAt(i));
      int next = i + 1 < s.length() ? map.get(s.charAt(i + 1)) : 0;
      final boolean errorCondition01 = currentNumber == 5 && next == 10;
      final boolean errorCondition02 = currentNumber == 10 && next == 100;

      if (errorCondition01 || errorCondition02) {
        throw new IllegalArgumentException("Invalid Roman Numeral");
      }

      if (currentNumber >= next)
        convertedNumber += currentNumber;
      else
        convertedNumber -= currentNumber;
    }

    return convertedNumber;

  }
}
