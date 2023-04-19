package org.itstep.module10.hw1;

public class Validator {
  public boolean isValid(String line) {
    return ((checkFirstFormatLine(line) && (line.length() == 14)) || (checkSecondFormatLine(line) && (line.length() == 12)));
  }

  private boolean checkFirstFormatLine(String line) {
    boolean checkFirstArray = false;
    boolean checkSecondArray = false;
    boolean checkThirdArray = false;
    String[] arrFirst = line.split(" ");
    char[] checkFirstElement = arrFirst[0].toCharArray();
    boolean checked = checkFirstElement[0] == '(' && checkFirstElement[4] == ')';

    if ((arrFirst.length == 2) && checked) {
      String[] arrSecond = arrFirst[1].split("-");
      char[] firstCharArray = arrFirst[0].replaceFirst("\\(", "").replaceFirst("\\)", "").toCharArray();
      char[] secondCharArray = arrSecond[0].toCharArray();
      char[] thirdCharArray = arrSecond[1].toCharArray();
      checkFirstArray = isCheckFirstArray(checkFirstArray, firstCharArray);
      checkSecondArray = isCheckFirstArray(checkSecondArray, secondCharArray);
      checkThirdArray = isCheckFirstArray(checkThirdArray, thirdCharArray);
    }
    return checkFirstArray && checkSecondArray && checkThirdArray;
  }

  private boolean checkSecondFormatLine(String line) {
    String[] arrFirst = line.split("-");
    boolean checkFirstArray = false;
    boolean checkSecondArray = false;
    boolean checkThirdArray = false;
    if (arrFirst.length == 3) {
      char[] firstCharArray = arrFirst[0].toCharArray();
      char[] secondCharArray = arrFirst[1].toCharArray();
      char[] thirdCharArray = arrFirst[2].toCharArray();
      checkFirstArray = isCheckFirstArray(checkFirstArray, firstCharArray);
      checkSecondArray = isCheckFirstArray(checkSecondArray, secondCharArray);
      checkThirdArray = isCheckFirstArray(checkThirdArray, thirdCharArray);
    }
    return checkFirstArray && checkSecondArray && checkThirdArray;
  }

  private boolean isCheckFirstArray(boolean arrayCheck, char[] array) {
    for (char checkChar : array) {
      if (!Character.isDigit(checkChar)) {
        arrayCheck = false;
        break;
      }
      arrayCheck = true;
    }
    return arrayCheck;
  }
}
