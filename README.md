# AndroidAutomation Framework
This Framework is made using TestNG framework. 

A test driven development approach is used using a Page object model design pattern.

A module of the application being automated is google maps. Only the search, title and Category is automated

BaseTest class consist of initial hooks that are setting up the desired capabilities and initializing the driver session.

Application config and a config reader class is present that is fetching the properties being used in the desired capabilties from the config.properties file

A page object package consist of step definition of the tests implemented in the Feature test file

A General functions class has been created using the concept of reusability of the basic interaction functions of appium

Appium version 7.6.0 
TestNG version 7.5
Also added the RU.QATOOLS.commons library version 2.0.RC6 and rg.springframework version 5.3.20. Both of these were added as there were problems being faced while reading config properties. 

Will further be developing this framework in the future adding extent-reporting, logging and more focus towards complete automation of the whole application


