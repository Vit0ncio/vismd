package main;

public class Bold {
  public void contain_bold(String text) {
    if (text.contains("**")) {
      IO.println("\u001B[1m" + text);
    }
  }
}
