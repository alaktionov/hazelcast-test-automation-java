package tests.helpers.interfaces;

import tests.models.PlanType;

public interface ClusterHelperI {

    void createCluster(PlanType planType);

    void deleteCluster();

    String getClusterStatus();

    boolean isListOfSharedClustersEmpty();
}