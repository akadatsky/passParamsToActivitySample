package com.akadatsky.bundlesample2

import android.app.Activity
import android.content.Intent
import android.os.Bundle

fun openNextActivity(clazz: Class<out Activity>, params: Bundle) {
    val intent = Intent(App.appContext, clazz).apply {
        putExtras(params)
        flags = Intent.FLAG_ACTIVITY_NEW_TASK
    }
    App.appContext.startActivity(intent)
}