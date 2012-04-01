# Vaadin WidgetSet Showcase

This project demonstrates the use of a Maven multi-modules build where the widgetset of the application is built in a separate jar file. It also showcase how a Vaadin application can be started very easily, either using a Maven command or directly in your IDE without the need to install a servlet container.

WidgetSet compilation may take some time with lots of add-ons. This project demonstrates an alternative solution based on Maven that only enables the compilation when a Maven profile is active. This has several advantages:

- The widgetset compilation can be triggered on demand instead of slowing down your multi-modules build all the time
- Since the widgetset project is disabled in your IDE, you can force a clean build without loosing the widgetset compilation
- This is a more decent alternative to the ones compiling the widgetset directly in your source directory. No need to commit generated code but you keep the benefit of caching it. You can even share it very easily by deploying a `SNAPSHOT` to your corporate Maven repository.

# Building from Source

Clone the git repository using the URL on the Github home page:

    $ git clone git@github.com:bsblabs/vaadin-widgetset-showcase.git
    $ cd vaadin-widgetset-showcase

## Command Line

Use Maven, then on the command line:

    $ mvn install

Note that you need access not only to the central repository but also to the vaadin add-ons repository since this sample is obviously using an add-on to showcase a custom widgetset compilation. If the `vaadin-addons` repository is not configured in your environment, you can enable it with the `bootstrap` profile

    $ mvn install -Pbootstrap

Note that in that case, any further command explained in this document should enable this profile as well. If that bugs you, you can always enable the profile in your local settings (`~/.m2/settings.xml`) using the [activeProfiles](http://maven.apache.org/guides/introduction/introduction-to-profiles.html) element.

# Usage

The name of the Maven profile to use to trigger the widgetset compilation is `all`. Please make sure to run at least on full build with this profile active so that your local repository is refreshed with the result of the compilation.

    $ mvn install -Pall

Once the project has been built, you no longer need to compile the widgetset unless you upgrade Vaadin or any of the add-on you may use, or you add a new add-on.

## Start the application using Cargo

[Cargo](http://cargo.codehaus.org/) is a very nice library to manipulate containers. This showcase configures the maven plugin with Tomcat. To start cargo, go to the `wizard-sample-server` module and use the `cargo:run` command to start the server

    $ cd wizard-sample-server
    $ mvn package cargo:run

Note that if you have already built the application, the `package` goal is not necessary.

## Start the application from the IDE

You can also very easily start this application using the [Embed for Vaadin add-on](https://vaadin.com/directory#addon/embed-for-vaadin). Open the `StartApp` class and execute the main method. This will start an embed tomcat container configured for that Vaadin application. It will also open your default browser at the proper location.

For more details about this add-on, see [our blog post](http://labs.bsb.com/2012/03/embed-for-vaadin).