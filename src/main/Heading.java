public class Heading {
  public String which_heading(String text) {
    if (text.startsWith("# "))
      return "\033[4m" + "\033[1m" + text;
    else if (text.startsWith("## "))
      return "\033[4m" + text;
    else if (text.startsWith("### "))
      return text;
    else
      return null;
  }
}
