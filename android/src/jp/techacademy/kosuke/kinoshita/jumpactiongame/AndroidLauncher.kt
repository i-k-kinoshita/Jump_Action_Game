package jp.techacademy.kosuke.kinoshita.jumpactiongame

import android.os.Bundle

import com.badlogic.gdx.backends.android.AndroidApplication
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
import jp.techacademy.kosuke.kinoshita.jumpactiongame.Jump_Action_Game

class AndroidLauncher : AndroidApplication() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val config = AndroidApplicationConfiguration()
        initialize(Jump_Action_Game(), config)
    }
}
