package ir.alirezaiyan.dependencyinjection.hilt.core.utils;

import androidx.lifecycle.ViewModelProvider;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

/**
 * @author Ali (alirezaiyann@gmail.com)
 * @since 4/16/2020 12:40 PM.
 */
@Module
@InstallIn(ActivityComponent.class)
public abstract class ViewModelFactoryModule {

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);

}
