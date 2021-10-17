package logic.helpers.managers;

import io.qameta.allure.Step;
import logic.helpers.interfaces.ClusterHelperI;
import logic.models.PlanType;

public class ClusterHelper extends DriverBasedHelper implements ClusterHelperI {

    public ClusterHelper(ApplicationManager manager) {
        super(manager.getWebDriver());
    }

    @Step("User creates a new cluster with a plan: '{0}'")
    @Override
    public void createCluster(PlanType planType) {
        pageManager.homePage.clickNewClusterButton();
        pageManager.plansPage.clickCreateClusterButton();
        pageManager.createClusterPage.clickCreateFreeClusterButton();
        pageManager.confirmationPage.clickContinueCreatingClusterButton();
    }

    @Step("User deletes the previously created plan")
    @Override
    public void deleteCluster() {
        pageManager.clusterDetailsPage.clickDeleteClusterAndConfirm();
    }

    @Override
    public String getClusterStatus() {
        return pageManager.clusterDetailsPage.getClusterStatus();
    }

    @Override
    public boolean isListOfSharedClustersEmpty() {
        return pageManager.homePage.isSharedClustersListEmpty();
    }
}