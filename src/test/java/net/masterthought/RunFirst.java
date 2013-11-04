package net.masterthought;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options( tags = "@first", format = "json:target/first.json")
public class RunFirst {
}
