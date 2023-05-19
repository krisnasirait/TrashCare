package com.trashcare.adm

import android.app.Application
import android.content.Context
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

class TrashCareAdminApp : Application() {
    override fun onCreate() {
        super.onCreate()

        context = applicationContext
        
        startKoin {
            androidLogger()
            androidContext(this@TrashCareAdminApp)
            module {
                // TODO: add modules here 
            }
        }

    }

    companion object {
        lateinit var context: Context
    }
}