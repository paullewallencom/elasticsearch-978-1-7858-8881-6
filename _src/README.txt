Elasticsearch Server Third Edition code bundle

The archive that you just unpacked contains all the files that are mentioned
in the contents of the Elasticsearch Server Third Edition book and include code
examples for chapters:
 * 2 - Indexing Your Data
 * 3 - Searching Your Data
 * 5 - Extending Your Index Structure
 * 6 - Make Your Search Better
 * 8 - Beyond Full-text Searching

We didn't include the commands that are in the book in separate files, because
we think that you will benefit by typing them yourself. By doing this you will
be able to memorize them and learn quicker.

There is one more thing we wanted you to remember. If you will try to build the
native script code that is present in the 6th Chapter - Make Your Search Better
you can just install Apache Maven (http://maven.apache.org/) and run the
following command:
mvn clean install

Maven will download all the needed dependencies and build the package for you.
You can find the archive with the plugin in the target/release subdirectory
(looking from the directory where pom.xml file is located).
