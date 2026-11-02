package oakline.mearbrestciso.corpapp

import android.app.Application
import oakline.mearbrestciso.corpapp.di.dataModule
import oakline.mearbrestciso.corpapp.di.dispatcherModule
import oakline.mearbrestciso.corpapp.di.viewModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class OEEOPApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        val appModules = dataModule + viewModule + dispatcherModule

        startKoin {
            androidLogger()
            androidContext(this@OEEOPApplication)
            modules(appModules)
        }
    }
}