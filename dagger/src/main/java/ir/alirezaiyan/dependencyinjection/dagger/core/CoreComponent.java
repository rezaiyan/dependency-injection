package ir.alirezaiyan.dependencyinjection.dagger.core;

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;
import ir.alirezaiyan.dependencyinjection.dagger.core.data.DiRepository;
import ir.alirezaiyan.dependencyinjection.dagger.core.data.di.DataModule;


@Component(modules = {
        CoreModule.class,
        DataModule.class
})
public interface CoreComponent {
    DiRepository provideDiRepository();

    @Component.Factory
    interface Factory {
        CoreComponent create(@BindsInstance Application application);
    }
}
