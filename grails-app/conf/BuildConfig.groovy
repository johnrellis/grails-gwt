grails.project.dependency.resolution = {
  inherits("global")
  log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
  repositories {
    grailsPlugins()
    grailsHome()
    grailsCentral()
    mavenCentral()
    grailsRepo "http://grails.org/plugins"

  }
  dependencies {
    //for the release plugin..
    build "org.apache.httpcomponents:httpclient:4.0.3"
    build "org.apache.ivy:ivy:2.2.0"
    test "org.spockframework:spock-grails-support:0.6-groovy-1.7"
  }
  plugins {
    compile ":maven-publisher:0.8.1"
    test(":spock:0.6") { exclude "spock-grails-support" }
    compile(":new-doc:0.3.2") { exclude "xom" }
  }
}

grails.release.scm.enabled = false

// Needed to run commands locally that trip over the GWT_HOME check.
gwt { version = "2.4.0" }

grails.project.dependency.distribution = {
 //put errigal repos here and do not check in!

}