package wedu.uw.ischool.zachaz.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(tag, "onCreate fired: ${savedInstanceState.toString()}")
    }

    override fun onStart() {
        super.onStart()
        Log.i(tag, "onStart fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag, "onResume fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i(tag, "onPause event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i(tag, "onStop event fired")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(tag, "onRestart event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag, "onDestroy event fired")
        Log.e(tag, "We're going down, Captain!")
    }
}