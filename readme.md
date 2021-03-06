# Basic Maven Project

[![Maven Central](https://img.shields.io/maven-central/v/com.paipeng/gcm.svg)][maven-repo]

[![Release docs](https://img.shields.io/badge/docs-release-blue.svg)][site-release]
[![Development docs](https://img.shields.io/badge/docs-develop-blue.svg)][site-develop]

[![Release javadocs](https://img.shields.io/badge/javadocs-release-blue.svg)][javadoc-release]
[![Development javadocs](https://img.shields.io/badge/javadocs-develop-blue.svg)][javadoc-develop]

A basic Maven project created from the Basic Maven Archetype.

This should be set up correctly before use. Remember to verify, and change if needed, at least the following data:

- Links on the readme, POM and Maven site (repositories, issues, etc)
- Project info on the POM.
- License, if not using the MIT one (POM, readme and LICENSE file)
- This readme description
- This documentation on the Maven site

## Documentation
Documentation is always generated for the latest release:

- The [latest release documentation page][site-release].
- The [the latest release Javadoc site][javadoc-release].

Documentation is also generated from the latest snapshot, taken from the 'develop' branch:

- The [the latest snapshot documentation page][site-develop].
- The [the latest snapshot Javadoc site][javadoc-develop].

The site sources come along the source code, so it is always possible to generate them using the Maven site command:

```
$ mvn site
```

## Building the code
The application is coded in Java, using Maven to handle the project's configuration and tests.

### Prerequisites
The project has been tested on the following Java versions:
* JDK 7
* JDK 8
* OpenJDK 7

All other dependencies are handled through Maven, and noted in the included POM file.

### Installing

The recommended way to install the project is by setting up the dependencies manager. To get the configuration information for this check the [Bintray repository][bintray-repo], or the [Maven Central Repository][maven-repo].

If for some reason manual installation is necesary, just use the following Maven command:

```mvn install```

## Collaborate

The project is still under ongoing development, and any help will be well received.

There are two ways to help: reporting errors and asking for extensions through the issues management, or forking the repository and extending the project.

### Issues management
Issues are managed at the GitHub [project issues page][issues].

Everybody is allowed to report bugs or ask for features.

### Getting the code
The latest version of the code can be found at the [GitHub project page][scm].

Feel free to fork it, and share the changes.

## License
The project is released under the [MIT License][license].

[bintray-repo]: https://bintray.com/bernardo-mg/maven
[maven-repo]: http://mvnrepository.com/artifact/com.paipeng/gcm
[issues]: https://github.com/bernardo-mg/gcm/issues
[javadoc-develop]: http://docs.wandrell.com/development/maven/gcm/apidocs
[javadoc-release]: http://docs.wandrell.com/maven/gcm/apidocs
[license]: http://www.opensource.org/licenses/mit-license.php
[scm]: https://github.com/bernardo-mg/gcm
[site-develop]: http://docs.wandrell.com/development/maven/gcm
[site-release]: http://docs.wandrell.com/maven/gcm
