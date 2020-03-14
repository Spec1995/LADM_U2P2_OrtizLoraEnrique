package mx.edu.ladm_u2p2_ortixloraenrique

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.drawable.Drawable
import android.media.MediaPlayer
import android.view.MotionEvent
import android.view.View

class Lienzo(p:MainActivity) : View(p) {
    // se requiere p para que view sepa cual activity va a trabajar
    var puntero = p
    /*var cx = 150f
    var cy = 150f
    var tx = 733f
    var ty = 818f*/
    var burbuja = FiguraGeometrica(150, 150, 120)
    //var cuadrado = FiguraGeometrica(733, 818, 200, 200)
    //var rectangulo = FiguraGeometrica(400, 1200, 400, 200)
    var burbuja2 = FiguraGeometrica(500, 1400, 50)
    var burbuja3 = FiguraGeometrica(300, 1100, 30)
    var burbuja4 = FiguraGeometrica(700, 1000, 70)
    var burbuja5 = FiguraGeometrica(100, 1200, 90)
    var burbuja6 = FiguraGeometrica(400, 1400, 20)
    var burbuja7 = FiguraGeometrica(1100, 100, 40)


    var punteroFiguraGeometrica: FiguraGeometrica? = null
    /*
    var icono = FiguraGeometrica(BitmapFactory.decodeResource(resources,R.drawable.
        iconosquirtle),100,100)
    var icono2 = FiguraGeometrica(BitmapFactory.decodeResource(resources,R.drawable.
        iconochikorita),400,100)
    var icono3 = FiguraGeometrica(BitmapFactory.decodeResource(resources,R.drawable.
        iconobullbazor),700,100)
    var icono4 = FiguraGeometrica(BitmapFactory.decodeResource(resources,R.drawable.
        iconopikachu),1000,100)
    var icono5 = FiguraGeometrica(BitmapFactory.decodeResource(resources,R.drawable.
        iconosquirtle_txt),100,1200)
    var icono6 = FiguraGeometrica(BitmapFactory.decodeResource(resources,R.drawable.
        iconochikorita_txt),100,900)
    var icono7 = FiguraGeometrica(BitmapFactory.decodeResource(resources,R.drawable.
        iconobullbazor_txt),100,600)
    var icono8 = FiguraGeometrica(BitmapFactory.decodeResource(resources,R.drawable.
        iconopikachu_txt),300,300)*/
    //var sonido1 = MediaPlayer.create(puntero, R.raw.test)


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()


        canvas.drawColor(Color.BLACK)

        //burbujas

        paint.color = Color.RED
        burbuja.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        burbuja.pintar(canvas, paint)

        //2
        paint.color = Color.BLUE
        burbuja2.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.YELLOW
        paint.strokeWidth = 10f
        burbuja2.pintar(canvas, paint)

        //3
        paint.color = Color.GRAY
        burbuja3.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GREEN
        paint.strokeWidth = 10f
        burbuja3.pintar(canvas, paint)

        //4
        paint.color = Color.MAGENTA
        burbuja4.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.RED
        paint.strokeWidth = 10f
        burbuja4.pintar(canvas, paint)

        //5
        paint.color = Color.YELLOW
        burbuja5.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.DKGRAY
        paint.strokeWidth = 10f
        burbuja5.pintar(canvas, paint)

        //6
        paint.color = Color.CYAN
        burbuja6.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        burbuja6.pintar(canvas, paint)

        //7
        paint.color = Color.LTGRAY
        burbuja7.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.YELLOW
        paint.strokeWidth = 10f
        burbuja7.pintar(canvas, paint)

        /*
        //Dibujando un círculo rojo con contorno blanco
        paint.color = Color.RED
        circulo.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo.pintar(canvas, paint)

        //Dibujando un cuadrado VERDE Contorno AZUL
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        cuadrado.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLUE
        cuadrado.pintar(canvas, paint)

        //Dibujando el rectangulo
        paint.style = Paint.Style.FILL
        paint.color = Color.YELLOW
        rectangulo.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        rectangulo.pintar(canvas, paint)

        //Dibujando 2do ciculo
        paint.color = Color.MAGENTA
        circulo2.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo2.pintar(canvas, paint)*/


        burbuja.pintar(canvas,paint)
        burbuja2.pintar(canvas,paint)
        burbuja3.pintar(canvas,paint)
        burbuja4.pintar(canvas,paint)
        burbuja5.pintar(canvas,paint)
        burbuja6.pintar(canvas,paint)
        burbuja7.pintar(canvas,paint)
        //burbuja8.pintar(canvas,paint)


    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        puntero.setTitle("")
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                /*
                //REVISAMOS QUIEN ESTA EN AREA
                if (icono.estaEnArea(event)) {
                    punteroFiguraGeometrica = icono
                    puntero.setTitle("ESTA EN PIKACHU")
                    //sonido1.start()
                }*/
                /*
                if (circulo.estaEnArea(event)) {
                    punteroFiguraGeometrica = circulo
                    puntero.setTitle("TOCASTE CIRCULO")
                }
                if (cuadrado.estaEnArea(event)) {
                    punteroFiguraGeometrica = cuadrado
                    puntero.setTitle("TOCASTE CUADRADO")
                }
                if (rectangulo.estaEnArea(event)) {
                    punteroFiguraGeometrica = rectangulo
                    puntero.setTitle("TOCASTE RECTANGULO")
                }
                if (circulo2.estaEnArea(event)) {
                    punteroFiguraGeometrica = circulo2
                    puntero.setTitle("TOCASTE CIRCULO2")
                }*/
            }
            MotionEvent.ACTION_MOVE -> {

                /*
                if (punteroFiguraGeometrica != null) {
                    punteroFiguraGeometrica!!.arrastrar(event)

                    if(punteroFiguraGeometrica == icono){
                        if(icono.colision(icono5)){
                            icono.imagen = null
                            icono5.imagen = null
                        }
                    }
                    if(punteroFiguraGeometrica == icono2){
                        if(icono2.colision(icono6)){
                            icono2.imagen = null
                            icono6.imagen = null

                        }
                    }
                    if(punteroFiguraGeometrica == icono3){
                        if(icono3.colision(icono7)){
                            icono3.imagen = null
                            icono7.imagen = null

                        }
                    }
                    if(punteroFiguraGeometrica == icono4){
                        if(icono4.colision(icono8)){
                            icono4.imagen = null
                            icono8.imagen = null

                        }
                    }

                    if(punteroFiguraGeometrica == cuadrado){
                        if(cuadrado.colision(rectangulo)){
                            puntero.setTitle("CUADRADO COLISION RECTANGULO")
                        }
                    }
                    if(punteroFiguraGeometrica == circulo){
                        if(circulo.colision(cuadrado)){
                            puntero.setTitle("CIRCULO COLISION CUADRADO")
                        }
                    }
                    if(punteroFiguraGeometrica == circulo){
                        if(circulo.colision(rectangulo)){
                            puntero.setTitle("CIRCULO COLISION RECTANGULO")
                        }
                    }
                    if(punteroFiguraGeometrica == circulo){
                        if(circulo.colision(circulo2)){
                            puntero.setTitle("CIRCULO COLISION CIRCULO2")
                        }
                    }
                }*/

            }
            MotionEvent.ACTION_UP -> {
                punteroFiguraGeometrica = null
            }
        }
        invalidate()
        return true
    }


    fun animarCirculo() {
        // circulo2.rebote(width, height)
        burbuja.reboteCircGrande(width,height)
        burbuja2.rebote(width,height)
        burbuja3.reboteCircChico(width,height)
        burbuja4.rebote(width,height)
        burbuja5.reboteCircGrande(width,height)
        burbuja6.reboteCircChico(width,height)
        burbuja7.reboteCircChico(width,height)
        //burbuja8.rebote(width,height)

        invalidate()
    }

}