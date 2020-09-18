package ir.alirezaiyan.dependencyinjection.dagger.feature.di;

import dagger.Component;
import ir.alirezaiyan.dependencyinjection.dagger.core.CoreComponent;
import ir.alirezaiyan.dependencyinjection.dagger.feature.DaggerActivity;

@Component(dependencies = CoreComponent.class, modules = {AppModule.class, AppViewModelModule.class})
public interface AppComponent {

    void inject(DaggerActivity activity);
}
