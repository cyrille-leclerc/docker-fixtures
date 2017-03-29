package org.jenkinsci.test.acceptance.docker.fixtures;

import org.jenkinsci.test.acceptance.docker.DockerFixture;

/**
 * Fixture capable of running java programs and git over ssh.
 *
 * @author Cyrille Le Clerc
 */
@DockerFixture(id="javagit", ports={22,8080})
public class JavaGitContainer extends JavaContainer {
}
