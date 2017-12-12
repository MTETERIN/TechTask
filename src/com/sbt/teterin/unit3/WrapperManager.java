package com.sbt.teterin.unit3;
import com.sbt.teterin.unit2.LinkedListOutput;

/**
 * Created by MrYcropchick on 12.12.2017.
 */
/**
 * Strategy Pattern
 */
public class WrapperManager {
    private String inputTweet ;
    private LinkedListOutput tweetFeatures ;

    public WrapperManager(String inputTweet,LinkedListOutput tweetFeatures ) {
        this.inputTweet = inputTweet;
        this.tweetFeatures = tweetFeatures;
    }
    /**
     * Wraps the data in the appropriate tags. If it is necessary
     */
    public String wrap()
    {
        StringBuilder result = new StringBuilder();
        StringBuilder textOutput;
        while(tweetFeatures.head!= null)
        {
            String subString = inputTweet.substring(tweetFeatures.head.getStartPosition(), tweetFeatures.head.getEndPosition());
            textOutput = new  StringBuilder(tweetFeatures.head.getWrapper().wrapText(subString));
            result.append(textOutput);
            tweetFeatures.head = tweetFeatures.head.getNext();
        }
        return result.toString();
    }

}
