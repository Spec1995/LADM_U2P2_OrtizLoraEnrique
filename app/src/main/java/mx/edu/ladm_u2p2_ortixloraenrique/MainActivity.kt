package mx.edu.ladm_u2p2_ortixloraenrique

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var lienzo  : Lienzo ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lienzo = Lienzo(this)
        setContentView(lienzo!!)

        HiloAnimacion(this).start()
    }
}
