package com.sbt.teterin.unit3;

/**
 * Created by MrYcropchick on 12.12.2017.
 */
public class UserName implements Wrapper {
    @Override
    public String wrapText(String text) {
        return "<a href=\"http://twitter.com/"+text+"\">"+ text + "</a>";
    }
}
