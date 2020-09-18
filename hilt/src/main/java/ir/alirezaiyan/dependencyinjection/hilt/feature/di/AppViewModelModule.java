package ir.alirezaiyan.dependencyinjection.hilt.feature.di;

import androidx.lifecycle.ViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.multibindings.IntoMap;
import ir.alirezaiyan.dependencyinjection.hilt.core.utils.ViewModelKey;
import ir.alirezaiyan.dependencyinjection.hilt.feature.HiltViewModel;

/**
 * @author Ali (alirezaiyann@gmail.com)
 * @since 8/16/2020 12:00 PM.
 */
@Module
@InstallIn(ActivityComponent.class)
abstract class AppViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(HiltViewModel.class)
    abstract ViewModel daggerViewModel(HiltViewModel viewModel);

}
