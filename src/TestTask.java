import com.sbt.teterin.unit1.Feed;
import com.sbt.teterin.unit2.TweetFeatures;
import com.sbt.teterin.unit3.*;

/**
 * Created by MrYcropchick on 12.12.2017.
 */
public class TestTask {

    public static void main(String[] args)
    {
        Feed feed = new Feed("Obama visited Facebook headquarters: http://bit.ly/xyz @elversatile");
        TweetFeatures tweetFeatures = new TweetFeatures();
        tweetFeatures.getOutput().add(0,5,new Entity());
        tweetFeatures.getOutput().add(5,14,new NormalText());
        tweetFeatures.getOutput().add(14,22,new Entity());
        tweetFeatures.getOutput().add(22,37,new NormalText());
        tweetFeatures.getOutput().add(37,54,new Link());
        tweetFeatures.getOutput().add(54,56,new NormalText());
        tweetFeatures.getOutput().add(56,67,new UserName());
        WrapperManager wrapperManager = new WrapperManager(feed.getOutput(),tweetFeatures.getOutput());
        String result = wrapperManager.wrap();
        System.out.println(result);
    }
}
