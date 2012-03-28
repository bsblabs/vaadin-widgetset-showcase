# Vaadin WidgetSet Showcase

This project demonstrates the use of Maven multi-modules build where the widgetset of the application is built in a separate jar file.

WidgetSet compilation may take some time with lots of add-ons. This project demonstrates an alternative solution based on Maven that only enables the compilation when a Maven profile is enabled. This has two main advantage:

- The widgetset compilation can be triggered on demand
- Since the widgetset project is disabled in your IDE, you can force a clean build without loosing the widgetset compilation
- This is a more decent alternative to the ones compiling the widgetset directly in your source directory

# Building from Source

Clone the git repository using the URL on the Github home page:

    $ git clone git@github.com:bsblabs/vaadin-widgetset-showcase.git
    $ cd vaadin-embed

## Command Line

Use Maven, then on the command line:

    $ mvn install

Note that you need access not only to the central repository but also to the vaadin add-ons directory since this sample is obviously a add-ons to showcase a custom widgetset compilation. If the `vaadin-addons` repository is not configured in your environment, you can enable it with the `bootstrap` profile

    $ mvn install -Pbootstrap

# Usage

The name of the Maven profile to use to trigger the widgetset compilation is `all`. Please make sure to run at least on full build with this profile enabled so that your local repository is refreshed with the result of the compilation

    $ mvn install -Pall

Do not forget to add the `bootstrap` profile as well if you don't have access to the vaadin add-ons repository.