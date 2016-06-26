import java.util.*;
import java.io.*;
public class Tutorial_Methods_Class {
    
    public ArrayList<String> ReadFile(String fileName){
        
                ArrayList<String> wordArray = new ArrayList<String>();
                String textLine;
                    try{
                FileReader fileReaderDict = new FileReader(fileName);
                BufferedReader bufferedReaderDict = new BufferedReader(fileReaderDict);
                while ((textLine = bufferedReaderDict.readLine()) != null) {
                    wordArray.add(textLine);                      
                }
                bufferedReaderDict.close();
                
            }
            
            catch (FileNotFoundException ex){
            System.out.println("Unable to Open File");
            }
             catch(IOException ex){
             System.out.println("File Not Found");
             }
    return wordArray;
    }
}



