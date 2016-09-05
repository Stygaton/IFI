import java.util.Scanner;
import java.io.*;
class Skriveeksempel {
public static void main(String[] args) throws Exception {
skrivTilFil();
}
public static void skrivTilFil() throws Exception {
PrintWriter writer = new PrintWriter("utfil.txt");
// skrive
for (int i = 0; i < 10; i++) {
writer.println(i);
}
// lukke
writer.close();
}
}