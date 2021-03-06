//Global variables
buildWithAnt{
	PROJECT_ID = "1320"			//The gitlab project ID. It can be found in the gitlab project interface.

	MODULE_DIR = "efr32bg22_micriumos-configuration"				// The name of the project into which your MODULE_FILENAME is. Default value is : "" . So leave blank if your MODULE_FILENAME is in the root of your gitlab project.
	//MODULE_FILENAME= ""				// The module filename. Default value is : module.ivy. Set it if yours is different.
	LABEL = "microej_sdk&&iar"					// The label where build must be run. Default value is : public. Set it if yours is different.
	
	//ANT_VERSION = ""				// The version of ant by Microej. Default value is : MMM MicroEJ 5.1.0. Set it if yours is different.
	ANT_PROPERTIES = "-Declipse.home=c:/jenkinsTools/common/microej/eclipse/microej-sdk-20.10/win64 -Dskip.publish=false"				// The properties run with ant. Default value is already set. Add specific properties if necessary. As ('-DnameOfProperties=valueofProperty').
	//ANT_VERBOSE = ""				// Default value is : false. Set true if you want the verbose mode. 

	//PATTERN_JUNIT = ''				// The pattern Junit for test report. This default value is : '**/target~/test/xml/**/*test-report.xml, **/target~/test/xml/**/*Test.xml'. Set it if you want to use different one.
}
