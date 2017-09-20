import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
/**Project 3.
*/
public class Lab3 {
/**
 * Retrieve contents from a URL and return them as a string.
 *
 * @param url url to retrieve contents from
 * @return the contents from the url as a string, or an empty string on error
 */
      public static String urlToString(final String url) {
          Scanner urlScanner;
           try {
               urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
              } catch (IOException e) {
             return "";
             }
         String contents = urlScanner.useDelimiter("\\A").next();
            urlScanner.close();
            return contents;
           }

       public static void main(final String[] args) {

               System.out.println("Enter the url of an article");
               Scanner stdin = new Scanner(System.in);
               String url = stdin.nextLine();
               String contents = urlToString(url);
               String[] words = contents.split(" ");
               int wordLength = words.length;
               System.out.print("The word number of this article is ");
               System.out.println(wordLength);

               int totalLength = contents.length();
               final int numberOfWord = 6;
               final int numberPlusOne = 7;
               int index = 0;
               int countUnique = 0;
               while (index < (totalLength - numberPlusOne)) {
                String testPrince = contents.substring(index, index + numberOfWord);
                if (testPrince.equals("Prince")) {
                    countUnique++;
                    index++;
                } else {
                    index++;
                }
               }
               System.out.print("There are ");
               System.out.print(countUnique);
               System.out.println(" Prince, if case sensitive");

               index = 0;
               countUnique = 0;
               while (index < (totalLength - numberPlusOne)) {
                   String testPrince = contents.substring(index, index + numberOfWord);
                   if (testPrince.equalsIgnoreCase("Prince")) {
                       countUnique++;
                       index++;
                   } else {
                       index++;
                   }
                  }
                  System.out.print("There are ");
                  System.out.print(countUnique);
                  System.out.println(" Prince, ignoring case");

                 }
      }
