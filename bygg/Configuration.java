/**
 * Copyright (C) 2004 - 2009 Shopzilla, Inc. 
 * All rights reserved. Unauthorized disclosure or distribution is prohibited.
 */

import com.pettermahlen.bygg.configuration.ByggConfiguration;

/**
 * TODO: document this class!
 *
 * @author Petter Måhlén
 * @since 04/03/2011
 */
public class Configuration {
    public static ByggConfiguration configuration() {
        return new ByggConfiguration() {
            public String vardet() {
                return "hej";
            }
        };
    }
}
