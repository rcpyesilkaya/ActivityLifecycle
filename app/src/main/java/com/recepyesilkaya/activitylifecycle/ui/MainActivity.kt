package com.recepyesilkaya.activitylifecycle.ui

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.recepyesilkaya.activitylifecycle.R
import com.recepyesilkaya.activitylifecycle.util.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        "onCreate".log()
    }

    override fun onStart() {
        super.onStart()
        "onStart".log()
    }

    override fun onRestart() {
        super.onRestart()
        "onRestart".log()
    }

    override fun onResume() {
        super.onResume()
        "onResume".log()
    }

    override fun onPause() {
        super.onPause()
        "onPause".log()
    }

    override fun onDestroy() {
        super.onDestroy()
        "onDestroy".log()
    }

    override fun onStop() {
        super.onStop()
        "onStop".log()
    }

    override fun onContentChanged() {
        super.onContentChanged()
        "onContentChanged".log()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        "onBackPressed".log()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        "onOptionsItemSelected".log()
        return super.onOptionsItemSelected(item)
    }

    override fun onOptionsMenuClosed(menu: Menu?) {
        super.onOptionsMenuClosed(menu)
        "onOptionsMenuClosed".log()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        "onCreateOptionsMenu".log()
        return super.onCreateOptionsMenu(menu)
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        "onPrepareOptionsMenu".log()
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        "onRestoreInstanceState".log()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        "onSaveInstanceState".log()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        "onConfigurationChanged".log()
    }

    override fun startActivityForResult(intent: Intent?, requestCode: Int) {
        super.startActivityForResult(intent, requestCode)
        "startActivityForResult".log()
    }

    override fun onUserInteraction() {
        super.onUserInteraction()
        "onUserInteraction".log()
    }
}