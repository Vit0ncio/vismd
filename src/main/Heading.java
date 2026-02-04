public class Heading {
  Bold bold = new Bold();

  public String which_heading(String text) {
    if (text.startsWith("# "))
      return "\033[4m" + text.toUpperCase() + bold.contain_bold(text);
    else if (text.startsWith("## "))
      return "\033[4m" + text;
    else if (text.startsWith("### "))
      return text;
    else
      return null;
  }
}
