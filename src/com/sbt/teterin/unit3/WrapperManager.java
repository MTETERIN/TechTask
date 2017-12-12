package com.sbt.teterin.unit3;
import com.sbt.teterin.unit2.LinkedListOutput;

/**
 * Created by MrYcropchick on 12.12.2017.
 */
public class WrapperManager {
    private String inputTweet ;
    private LinkedListOutput tweetFeatures ;

    public WrapperManager(String inputTweet,LinkedListOutput tweetFeatures ) {
        this.inputTweet = inputTweet;
        this.tweetFeatures = tweetFeatures;
    }

    public String wrap()
    {
        StringBuilder sb = new StringBuilder();
        StringBuilder textOutput;
        while(tweetFeatures.head!= null)
        {
            String subString = inputTweet.substring(tweetFeatures.head.getStartPosition(), tweetFeatures.head.getEndPosition());
            textOutput = new  StringBuilder(tweetFeatures.head.getWrapper().wrapText(subString));
            sb.append(textOutput);
            tweetFeatures.head = tweetFeatures.head.getNext();
        }
        return sb.toString();
    }

}
