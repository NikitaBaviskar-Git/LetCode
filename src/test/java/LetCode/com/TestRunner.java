package LetCode.com;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"C:\\Users\\HP\\eclipse-workspace\\LetCode_TestingHub\\src\\test\\resources\\Features\\DragAndDrop.feature"},
		glue= {"LetCode.com"},
		plugin= {"pretty","html:target/LetCode-DragDrop.html"})

public class TestRunner extends AbstractTestNGCucumberTests
{
	
}
