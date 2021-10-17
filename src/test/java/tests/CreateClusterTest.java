package tests;

import logic.models.PlanType;
import logic.models.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreateClusterTest extends BaseTest {

    @Test
    public void verifyFreeClusterCanBeSuccessfullyCreatedAndDeleted() {
        // GIVEN
        String email = "oliver.wuhrl@gmail.com";
        String password = "12345678A!";
        User user = new User(email, password);
        app.getUserHelper().loginAs(user);

        // WHEN
        app.getClusterHelper().createCluster(PlanType.BASIC);

        // THEN
        String actualClusterStatus = app.getClusterHelper().getClusterStatus();
        String expectedClusterStatus = "Running";
        assertEquals(expectedClusterStatus, actualClusterStatus, "Status of the cluster is not as expected");

        // WHEN
        app.getClusterHelper().deleteCluster();

        // THEN
        assertTrue(app.getClusterHelper().isListOfSharedClustersEmpty(), "List of Shared clusters is expected to be empty");
    }
}