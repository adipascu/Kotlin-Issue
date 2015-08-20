package ro.adipascu.kotlinissue.io

import android.app.Activity
import android.util.Log

/**
 * Created by Adrian Pascu on 8/20/2015.
 * mail@adipascu.ro
 */

abstract class AbstractActivity : Activity() {
    protected fun parentMethod() {
        Log.i("AbstractActivity", "parentMethod")
    }
}