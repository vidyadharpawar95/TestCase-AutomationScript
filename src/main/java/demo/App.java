/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;
import java.io.IOException;
import java.net.MalformedURLException;


public class App {
    public void getGreeting() throws InterruptedException, MalformedURLException {
        // Amazon obj= new Amazon(); //Initialize your test class
        //  w3WinHandle obj= new w3WinHandle();
      // hyperLinks obj= new hyperLinks();
      //   NestedFrames obj=new NestedFrames();
       Imdb_ratings obj= new Imdb_ratings();
       

        //TODO: call your test case functions one after other here
          obj.testCase01();
        
        //END Tests


       obj.endTest(); // End your test by clearning connections and closing browser
      
    }

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        new App().getGreeting();
    }
}
