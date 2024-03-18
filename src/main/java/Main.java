// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.io.*;
class demo{
  void fileinput(String filename) throws IOException{
    FileInputStream in_file = new FileInputStream(filename);
    int b;
    while((b = in_file.read())!=-1){
      System.out.print((char)b);
    }in_file.close();
  }
  void fileoutput(String filename) throws IOException{
    FileOutputStream out_file = new FileOutputStream(filename);
    String text = "Hello World";
    byte[] bytes = text.getBytes();
    out_file.write(bytes);
    out_file.close();
  }
}
public class Main {
  public static void main(String[] args) {
    demo obj = new demo();
    try{obj.fileinput("input.txt");
        //This line is working of Seen in the file input.txt
       obj.fileoutput("output.txt");
      //This line is working of Seen in the file output.txt
    } 
    catch(IOException e){
      System.out.println("File not found");
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}