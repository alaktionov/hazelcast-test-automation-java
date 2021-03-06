package logic.helpers.interfaces;

public interface ApplicationManagerI {

    NavigationHelperI getNavigationHelper();

    UserHelperI getUserHelper();

    ClusterHelperI getClusterHelper();

    void stop();
}