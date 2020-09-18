package ir.alirezaiyan.dependencyinjection.hilt.core.data.di;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import ir.alirezaiyan.dependencyinjection.hilt.core.data.DiRepository;
import ir.alirezaiyan.dependencyinjection.hilt.core.data.DiRepositoryImpl;
import ir.alirezaiyan.dependencyinjection.hilt.core.domain.Database;

@InstallIn(ApplicationComponent.class)
@Module
public class DataModule {

    @Provides
    public DiRepository provideDiRepository(Database database){
        return new DiRepositoryImpl(database);
    }

}
