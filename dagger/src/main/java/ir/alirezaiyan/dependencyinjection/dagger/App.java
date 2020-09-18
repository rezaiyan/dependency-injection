package ir.alirezaiyan.dependencyinjection.dagger;

import android.app.Application;

import ir.alirezaiyan.dependencyinjection.dagger.core.CoreComponent;
import ir.alirezaiyan.dependencyinjection.dagger.tools.AppComponentProvider;


public class App extends Application implements AppComponentProvider {

    private CoreComponent coreComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        coreComponent = DaggerCoreComponent.factory().create(this);
    }

    @Override
    public CoreComponent getComponent() {
        return coreComponent;
    }
}
