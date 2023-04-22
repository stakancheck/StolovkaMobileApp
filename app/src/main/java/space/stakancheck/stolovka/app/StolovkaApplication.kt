/*
 * Copyright (c) 2023. Artem Sukhanov
 * Site: https://stakancheck.github.io
 */

package space.stakancheck.stolovka.app

import android.app.Application
import com.google.android.material.color.DynamicColors
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class StolovkaApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        DynamicColors.applyToActivitiesIfAvailable(this)
    }

}