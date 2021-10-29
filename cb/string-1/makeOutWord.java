public class makeOutWord {
  public String makeOutWord(String out, String word) {
  String firstPart = out.substring(0,2);
  String secondPart = out.substring(2, 4);

  return firstPart + word + secondPart;
}
}
