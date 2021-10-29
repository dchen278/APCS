public class extraEnd {
  public String extraEnd(String str) {
  String lastChars = str.substring(str.length() - 2, str.length());
  return lastChars+lastChars+lastChars;
}
}
