# TP6

### 3.

La règle éxige que chaque push sois dans une branch secondaire et que cette branch doit passer par un pull request 

Error si on essaye de push dans le main
````bash
Ethan@DESKTOP-N7IV693 MINGW64 /d/GitHub/flow-lab-Ethan-Lilian/flow-lab-Ethan-Lilian (main)
$ git push 
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 12 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 318 bytes | 318.00 KiB/s, done.
Total 3 (delta 2), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (2/2), completed with 2 local objects.
remote: error: GH013: Repository rule violations found for refs/heads/main.
remote: Review all repository rules at https://github.com/Ethan040723/flow-lab-Ethan-Lilian/rules?ref=refs%2Fheads%2Fmain
remote: 
remote: - Changes must be made through a pull request.
remote: 
To https://github.com/Ethan040723/flow-lab-Ethan-Lilian.git
 ! [remote rejected] main -> main (push declined due to repository rule violations)
error: failed to push some refs to 'https://github.com/Ethan040723/flow-lab-Ethan-Lilian.git'
````

### 9.

Dans la branche main il y a 6 commit sur les 8 commit au total de toutes les branches , cela montre que le main ç récupérer les commit du pullrequest . Mais l'issue est toujours ouverte

### 11.

On prévoie de voir un conflit comme celui ci 
````
<<<<<<HEAD
la version du pull request fusionné avec le main
====================================
la version du deuxième pull request 
<<<<<<<
````

### 12;

Résultat du conflit dans le fichier Salutation.java
````java
// Starting point for TP 06. One method, one line per member: the conflicts are real because
// everyone edits the same place, which is exactly what happens on a shared codebase.
public class Salutation {

  public static void main(String[] args) {
<<<<<<< HEAD
    System.out.println(saluer("Mr"));
=======
    System.out.println(saluer("鴨肉醃漬"));
>>>>>>> 341bc71d407f0080ee6598b51aa965d1ba37f5c5
  }

  static String saluer(String nom) {
    // TODO: chaque membre du groupe ajoute ICI sa salutation, dans sa propre branche.
<<<<<<< HEAD
    return "Guten tag, " + nom + "!";
=======
    return "您好, " + nom + "!";
>>>>>>> 341bc71d407f0080ee6598b51aa965d1ba37f5c5
  }
}
````



