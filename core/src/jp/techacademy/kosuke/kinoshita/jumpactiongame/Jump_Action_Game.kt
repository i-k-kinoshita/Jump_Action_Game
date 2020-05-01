package jp.techacademy.kosuke.kinoshita.jumpactiongame

import com.badlogic.gdx.Game
import com.badlogic.gdx.graphics.g2d.SpriteBatch

class Jump_Action_Game : Game() {
    lateinit var batch: SpriteBatch

    override fun create() {
        batch = SpriteBatch()

        // GameScreenを表示する
        setScreen(GameScreen(this))
    }
}
