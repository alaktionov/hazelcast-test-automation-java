package tests;

import logic.helpers.interfaces.ApplicationManagerI;
import logic.helpers.managers.ApplicationManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

/**
 * Base class for all the JUnit-based test classes
 */
public class BaseTest {

    protected ApplicationManagerI app;

    @BeforeEach
    public void setUp() {
        app = new ApplicationManager();
    }

    @AfterEach
    public void tearDown() {
        app.stop();
    }
}