package config;

public class Constants {
	//This is the list of System Variables
    //Declared as 'public', so that it can be used in other classes of this project
    //Declared as 'static', so that we do not need to instantiate a class object
    //Declared as 'final', so that the value of this variable can be changed
    // 'String' & 'int' are the data type for storing a type of value	
	public static final String URL = "http://www.store.demoqa.com";
	public static final String Path_TestData = "C://WorkSpace//Workspace//KeywordDriven//src//dataEngine//DataEngine.xlsx";
	public static final String Path_OR = "C://WorkSpace//Workspace//KeywordDriven//src//config//OR.properties";
	public static final String File_TestData = "DataEngine.xlsx";

	//List of Data Sheet Column Numbers
	public static final int Col_TestCaseID = 0;	
	public static final int Col_TestScenarioID =1 ;
	public static final int Col_PageObject =4 ;
	public static final int Col_ActionKeyword =5 ;
	public static final int Col_RunMode = 2 ;
	//Test Case Result Column
	public static final int Col_Result =3 ;
	// Test Steps Result Column
	public static final int Col_TestStepResult = 7;
	public static final int Col_TestStepFailScreenShot = 8;
	//List of Data Engine Excel sheets
	public static final String Sheet_TestSteps = "Test Steps";
	public static final String Sheet_TestCases = "Test Cases";
	// List of Test Data
	public static final String UserName = "bhavik";
	public static final String Password = "Qwer123$";
	
	//Result column data
	public static final String KEYWORD_FAIL = "FAIL";
	public static final String KEYWORD_PASS = "PASS";
	
	
	public static final String screenshotName = "TestScreen";
	public static final int Col_DataSet =6 ;
	
}
