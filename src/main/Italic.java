public class Italic {
  public String contain_italic(String text) {
    return "\033[3m" + text;
  }
}
