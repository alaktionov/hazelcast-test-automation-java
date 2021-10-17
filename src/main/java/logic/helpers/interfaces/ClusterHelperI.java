package logic.helpers.interfaces;

import logic.models.PlanType;

public interface ClusterHelperI {

    void createCluster(PlanType planType);

    void deleteCluster();

    String getClusterStatus();

    boolean isListOfSharedClustersEmpty();
}