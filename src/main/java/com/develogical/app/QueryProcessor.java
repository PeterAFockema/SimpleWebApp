package com.develogical.app;

public class QueryProcessor {
    public String process(final String query) {
        String returnStatement = "";
        if (query.toLowerCase().contains("shakespeare")) {
            returnStatement = "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("another")) {
            returnStatement = "another";
        }
        return returnStatement;
    }
}
