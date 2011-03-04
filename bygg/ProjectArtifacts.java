/**
 * Copyright (C) 2004 - 2009 Shopzilla, Inc. 
 * All rights reserved. Unauthorized disclosure or distribution is prohibited.
 */

import com.pettermahlen.bygg.configuration.Artifact;

/**
 * TODO: document this class!
 *
 * TODO: this should be an enum, but the Janino version I'm using doesn't support Java 5 stuff. I should
 * create my own compiling class loader implementation instead of using Janino.
 *
 * @author Petter Måhlén
 * @since 04/03/2011
 */
public class ProjectArtifacts implements Artifact {
    public static final ProjectArtifacts GUAVA = new ProjectArtifacts("com.google.guava", "guava");
    public static final ProjectArtifacts GUICE = new ProjectArtifacts("com.google.inject", "guice");

    private final String groupId;
    private final String artifactId;

    ProjectArtifacts(String groupId, String artifactId) {
        this.groupId = groupId;
        this.artifactId = artifactId;
    }


    public String groupId() {
        return groupId;
    }

    public String artifactId() {
        return artifactId;
    }
}
