package logic.helpers.managers;

import logic.helpers.interfaces.ClusterHelperI;
import logic.models.PlanType;

public class ClusterHelper extends DriverBasedHelper implements ClusterHelperI {

    public ClusterHelper(ApplicationManager manager) {
        super(manager.getWebDriver());
    }

    @Override
    public void createCluster(PlanType planType) {
        pageManager.homePage.clickNewClusterButton();
        pageManager.plansPage.clickCreateClusterButton();
        pageManager.createClusterPage.clickCreateFreeClusterButton();
        pageManager.confirmationPage.clickContinueCreatingClusterButton();
    }

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