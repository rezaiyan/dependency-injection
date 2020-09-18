package ir.alirezaiyan.dependencyinjection.dagger.core.utils;

import androidx.lifecycle.ViewModelProvider;

import dagger.Binds;
import dagger.Module;

/**
 * @author Ali (alirezaiyann@gmail.com)
 * @since 4/16/2020 12:40 PM.
 */
@Module
public abstract class ViewModelFactoryModule {

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);

}
