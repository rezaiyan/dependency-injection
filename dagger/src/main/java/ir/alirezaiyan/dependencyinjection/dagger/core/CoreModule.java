package ir.alirezaiyan.dependencyinjection.dagger.core;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;
import ir.alirezaiyan.dependencyinjection.dagger.core.domain.Database;

@Module
public class CoreModule {

    @Provides
    public Context provideContext(Application application) {
        return application.getApplicationContext();
    }

    @Provides
    public Database provideDatabase(Context context) {
        return new Database(context);
    }

}
