package com.develogical.app;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.assertThat; // --> deprecated
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {
    private final QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutAnother() {
        assertThat(queryProcessor.process("another"), containsString("another"));
    }

    @Test
    public void isNotCaseSensitive() {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }
}
