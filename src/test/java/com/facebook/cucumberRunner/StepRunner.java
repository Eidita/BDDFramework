package com.facebook.cucumberRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin={"pretty" , "html:target/facebookReport.html"},
features="src/test/resources/featuresForFacebook",
glue="com.facebook.stepDefination",
tags="@scenarioOutline",
snippets=SnippetType.CAMELCASE
)
public class StepRunner {

}
