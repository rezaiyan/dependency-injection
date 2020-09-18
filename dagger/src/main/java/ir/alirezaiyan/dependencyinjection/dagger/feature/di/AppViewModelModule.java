package ir.alirezaiyan.dependencyinjection.dagger.feature.di;

import androidx.lifecycle.ViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import ir.alirezaiyan.dependencyinjection.dagger.core.utils.ViewModelFactoryModule;
import ir.alirezaiyan.dependencyinjection.dagger.core.utils.ViewModelKey;
import ir.alirezaiyan.dependencyinjection.dagger.feature.DaggerViewModel;

/**
 * @author Ali (alirezaiyann@gmail.com)
 * @since 8/16/2020 12:00 PM.
 */
@Module(includes = ViewModelFactoryModule.class)
abstract class AppViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(DaggerViewModel.class)
    abstract ViewModel daggerViewModel(DaggerViewModel viewModel);

}
