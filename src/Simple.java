import java.io.FileReader;


class Simple{
    public static void main(String args[]) throws Exception{
       System.out.println("Hello Java");
          FileReader fr=new FileReader("./data.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close(); 

  }
}
