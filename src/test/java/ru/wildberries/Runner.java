package ru.wildberries;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import ru.sbtqa.tag.pagefactory.Tag;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = {"pretty"},
        glue = {"ru.sbtqa.tag.stepdefs",
                "ru.your.project.stepdefs", "ru/wildberries/steps"},
        features = {"src/test/resources/features/"},
        tags = {"@test"}
)

public class Runner extends Tag{}