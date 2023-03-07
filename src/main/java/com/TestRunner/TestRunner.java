package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="Test Feature",
glue="com.stepDefinition",
tags = "@CucuTest",
plugin= {"pretty","html:target/cucumberHTMLRep.html"})
public class TestRunner {
	

}
