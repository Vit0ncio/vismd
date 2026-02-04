public class Italic {
  public String contain_italic(String text) {
    if (text.startsWith("*"))
      return "\033[3m" + text;
    else
      return null;
  }
}
