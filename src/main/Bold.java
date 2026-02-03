public class Bold {
  public static void contain_bold(String text) {
    if (text.contains("**")) {
      IO.println("\033[1m" + text);
    }
  }
}
