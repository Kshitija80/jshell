/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TextAnalyzer;

/**
 *
 * @author kshitija
 */
public class TextAnalyzerHelper {
    
    private String inputtedText;
    private int textLength;
    private int wordCount;
    private int lineCount;
    private int tabCount;
    private int spaceCount;
    private String uniqueCharText;
    
    public TextAnalyzerHelper (String inputtedText){
        this.inputtedText = inputtedText;
        performance();
    }
    
    public int getTextLength() {
        return textLength;
    }
    
    public int getWordCount() {
        return wordCount;
    }
    
    public int getLineCount() {
        return lineCount;
    } 
    public int getTabCount () {
         return tabCount;
    }
    
    public int getSpaceCount() {
         return spaceCount;
    }
    
    public String  getUniqueCharText() {
        return uniqueCharText;
    }
    
    
    
    private void performance () {
         textLength = inputtedText.length();
         lineCount = textLength > 0 ? inputtedText.split("[\n]",-1).length:0;
         spaceCount = inputtedText.split("[\s]",-1).length-1;
         tabCount = inputtedText.split("[\t]",-1).length-1;
         wordCount = inputtedText.split("[\t\s\n]",-1).length;
    }
    
    
   public int getWordAndCharCount(String word) {

    // Word Count
    String[] str = inputtedText.splitWithDelimiters(word,0);
    
    int count=0;
    for (int i = 0; i < str.length; i++) {
        if (str[i].equals(word)) {
           count++; 
        }
    }
   return count;
   }

    
    public String toString(){
        return "TextAnalyzerHelper{" + "inputtedText=" + inputtedText +"textLength=" + textLength+ "wordsCount="+ wordCount + "lineCount=" + lineCount+ "tabCount="+ tabCount + "spaceCount=" + spaceCount+ "uniqueCharText=" + uniqueCharText + '}';
    }
    
    public static void main(String [] args){
        TextAnalyzerHelper text = new TextAnalyzerHelper ("Akahs@#$\ns\td");
        System.out.println(text);
    }
}
