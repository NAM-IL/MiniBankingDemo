package hristostefanov.starlingdemo

import android.app.Application
import androidx.lifecycle.ViewModelProvider
import hristostefanov.starlingdemo.presentation.ViewModelFactory
import hristostefanov.starlingdemo.util.ApplicationComponent
import hristostefanov.starlingdemo.util.DaggerApplicationComponent

class App : Application() {
    companion object {
        lateinit var instance: App
    }

    init {
        instance = this
    }

    val component: ApplicationComponent = DaggerApplicationComponent.create()

    // using a variable here to allow replacing with a factory that provides
    // mocked view models when running UI unit tests
    var viewModelFactory: ViewModelProvider.Factory = ViewModelFactory(component)
}