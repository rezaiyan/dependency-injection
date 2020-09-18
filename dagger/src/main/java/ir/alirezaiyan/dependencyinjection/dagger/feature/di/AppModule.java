package ir.alirezaiyan.dependencyinjection.dagger.feature.di;

import dagger.Module;
import dagger.Provides;
import ir.alirezaiyan.dependencyinjection.dagger.core.data.DiRepository;
import ir.alirezaiyan.dependencyinjection.dagger.feature.DaggerPresenter;

@Module
public class AppModule {

    @Provides
    public DaggerPresenter providePresenter(DiRepository repository) {
        return new DaggerPresenter(repository);
    }

}
