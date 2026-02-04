public class Bold {
  public String contain_bold(String text) {
    if (text.startsWith("**"))
      return "\033[1m" + text;
    else
      return null;
  }
}
