package net.masterthought;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options( tags = "@second", format = "json:target/second.json")
public class RunSecond {
}
