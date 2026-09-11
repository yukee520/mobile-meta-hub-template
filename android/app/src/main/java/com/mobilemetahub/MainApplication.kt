package com.mobilemetahub

import android.app.Application
import com.facebook.react.ReactApplication
import com.facebook.react.ReactNativeHost
import com.facebook.react.ReactPackage
import com.facebook.react.shell.MainReactPackage
import com.facebook.react.defaults.DefaultReactNativeHost
import com.facebook.soloader.SoLoader

class MainApplication : Application(), ReactApplication {

  private val _reactNativeHost: ReactNativeHost =
      object : DefaultReactNativeHost(this) {
        override fun getPackages(): List<ReactPackage> {
          val packages = ArrayList<ReactPackage>()
          packages.add(MainReactPackage())
          return packages
        }

        override fun getJSMainModuleName(): String = "index"

        override fun getUseDeveloperSupport(): Boolean {
          return try {
            val clazz = Class.forName("${packageName}.BuildConfig")
            clazz.getField("DEBUG").getBoolean(null)
          } catch (e: Exception) {
            false
          }
        }

        override val isNewArchEnabled: Boolean
          get() = try {
            val clazz = Class.forName("${packageName}.BuildConfig")
            clazz.getField("IS_NEW_ARCHITECTURE_ENABLED").getBoolean(null)
          } catch (e: Exception) {
            false
          }

        override val isHermesEnabled: Boolean
          get() = try {
            val clazz = Class.forName("${packageName}.BuildConfig")
            clazz.getField("IS_HERMES_ENABLED").getBoolean(null)
          } catch (e: Exception) {
            true
          }
      }

  override fun getReactNativeHost(): ReactNativeHost {
    return _reactNativeHost
  }

  override fun onCreate() {
    super.onCreate()
    SoLoader.init(this, false)
  }
}
