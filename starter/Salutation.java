// Starting point for TP 06. One method, one line per member: the conflicts are real because
// everyone edits the same place, which is exactly what happens on a shared codebase.
public class Salutation {

  public static void main(String[] args) {
    System.out.println(saluer("鴨肉醃漬"));
  }

  static String saluer(String nom) {
    return "您好, " + nom + "!";
  }
}
