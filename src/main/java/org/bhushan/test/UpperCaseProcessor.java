package org.bhushan.test;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.Locale;

public class UpperCaseProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        final String message = exchange.getIn().getBody(String.class);
        exchange.getIn().setBody(message.toUpperCase(Locale.ROOT));
    }
}
