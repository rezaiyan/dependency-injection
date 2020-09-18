package ir.alirezaiyan.dependencyinjection.hilt.feature.di;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import ir.alirezaiyan.dependencyinjection.hilt.core.data.DiRepository;
import ir.alirezaiyan.dependencyinjection.hilt.feature.HiltPresenter;

@InstallIn(ActivityComponent.class)
@Module
public class AppModule {

    @Provides
    public HiltPresenter providePresenter(DiRepository repository) {
        return new HiltPresenter(repository);
    }
}
