public class Bold {
  public void contain_bold(String text) {
    if (text.contains("**")) {
      IO.println("\033[1m" + text);
    }
  }
}
