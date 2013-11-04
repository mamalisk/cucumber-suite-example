package net.masterthought;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        RunFirst.class,
        RunSecond.class // RunAcceptanceOne and RunAcceptanceTwo are Cucumber launchers
})
public class SuiteClass {
}
