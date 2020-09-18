package ir.alirezaiyan.dependencyinjection.hilt.core;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import ir.alirezaiyan.dependencyinjection.hilt.core.domain.Database;

@InstallIn(ApplicationComponent.class)
@Module
public class CoreModule {

    @Singleton
    @Provides
    static Context provideContext(Application app){
        return app;
    }

    @Provides
    public Database provideDatabase(Context context) {
        return new Database(context);
    }

}
