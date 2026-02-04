public class Bold {
  public String contain_bold(String text) {
    if (text.startsWith("**") || text.startsWith("# "))
      return "\033[1m";
    else
      return null;
  }
}
