package com.hazelcast.testautomation.helpers.interfaces;

import com.hazelcast.testautomation.models.PlanType;

public interface ClusterHelperI {

    void createCluster(PlanType planType);

    void deleteCluster();

    String getClusterStatus();

    boolean isListOfSharedClustersEmpty();
}