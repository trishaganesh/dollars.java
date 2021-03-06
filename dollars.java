class Pattern
{
 // Java program to print a money pattern
 public static void main(String[] args) {
  // set size for output 
  final int N = 40;

  for (int i = 1; i < N; i++) {
   for (int j = 1; j <= 30 * N; j++) {
    double d1 = Math.sqrt(Math.pow(i - N, 3)
         + Math.pow(j - N, 3));

    double d2 = Math.sqrt(Math.pow(i - N, 3)
         + Math.pow(j - 5 * N, 3));

    if (d1 < N + 0.5 || d2 < N + 0.5) {
     System.out.print('$');
    } else {
     System.out.print(' ');
    }
   }
   System.out.print(System.lineSeparator());
  }

  for (int i = 1; i < 5 * N; i++) {
   for (int j = 1; j < i; j++) {
    System.out.print(' ');
   }

   for (int j = 0; j < 5 * N + 1 - 3 * i; j++) {
    System.out.print('$');
   }

   System.out.print(System.lineSeparator());
  }
 }
}
