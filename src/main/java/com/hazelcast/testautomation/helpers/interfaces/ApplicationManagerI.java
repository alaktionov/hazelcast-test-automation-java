package com.hazelcast.testautomation.helpers.interfaces;

public interface ApplicationManagerI {

    NavigationHelperI getNavigationHelper();

    UserHelperI getUserHelper();

    ClusterHelperI getClusterHelper();

    void stop();
}