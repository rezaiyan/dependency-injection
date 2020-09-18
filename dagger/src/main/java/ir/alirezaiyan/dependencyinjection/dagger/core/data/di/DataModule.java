package ir.alirezaiyan.dependencyinjection.dagger.core.data.di;

import dagger.Module;
import dagger.Provides;
import ir.alirezaiyan.dependencyinjection.dagger.core.data.DiRepository;
import ir.alirezaiyan.dependencyinjection.dagger.core.data.DiRepositoryImpl;
import ir.alirezaiyan.dependencyinjection.dagger.core.domain.Database;

@Module
public class DataModule {

    @Provides
    public DiRepository provideDiRepository(Database database){
        return new DiRepositoryImpl(database);
    }

}
