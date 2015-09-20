/** File:   WordData.java
 *  Created by J. Gardeski on 09/17/15
 *
 *  Last Modified on 09/17/15
 *  NOTES:
 *      -
 */
package com.CC2UC;

/** The WordData class is meant to capture
 *  all the elements of a vocabulary word:
 *  the word itself, part of speech, an
 *  example sentence, and the definition.
 */
public class WordData {
    /***************
     *  Constants  *
     ***************/

    /************************
     *  Instance Variables  *
     ************************/
    private String word;
    private String partOfSpeech;
    private String exampleSentence;
    private String definition;

    /******************
     *  Constructors  *
     ******************/

    /** Creates a WordData object where all instance variables are given meaningful data.
     *
     *  @param theWord              -   the vocabulary word
     *  @param thePartOfSpeech      -   the part of speech specific to the word-definition pairing
     *  @param theExampleSentence   -   a sentence illustrating usage of the word
     *  @param theDefinition        -   the word's definition corresponding to the part of speech
     */
    public WordData(String theWord, String thePartOfSpeech, String theExampleSentence, String theDefinition) {
        word = theWord;
        partOfSpeech = thePartOfSpeech;
        exampleSentence = theExampleSentence;
        definition = theDefinition;
    }

    /***********************
     *  Getters & Setters  *
     ***********************/
    public String getWord() { return word; }
    public String getPartOfSpeech() { return partOfSpeech; }
    public String getExampleSentence() { return exampleSentence; }
    public String getDefinition() { return definition; }

    public void setWord(String newWord) { word = newWord; }
    public void setPartOfSpeech(String newPartOfSpeech) { partOfSpeech = newPartOfSpeech; }
    public void setExampleSentence(String newExampleSentence) { exampleSentence = newExampleSentence; }
    public void setDefinition(String newDefinition) { definition = newDefinition; }

    /**********************
     *  Object Overrides  *
     **********************/
    public String toString() {
        return  "Word: " + getWord() +
                "\nPart of Speech: " + getPartOfSpeech() +
                "\nExample Sentence: " + getExampleSentence() +
                "\nDefinition: " + getDefinition();
    }
}
