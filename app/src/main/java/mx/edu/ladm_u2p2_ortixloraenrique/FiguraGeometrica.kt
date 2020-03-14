package mx.edu.ladm_u2p2_ortixloraenrique

import android.graphics.*
import android.media.Image
import android.view.MotionEvent
import androidx.core.graphics.drawable.toIcon

class FiguraGeometrica () {
    var x = 0f
    var y = 0f
    var tipo = 1 //1 circulo 2 rectangulo 3 BITMAP
    var radio = 0f
    var ancho = 0f
    var alto = 0f
    var incX = 5
    var incY = 5
    var incGrandeX = 3
    var incGrandeY = 3
    var incChicoX = 10
    var incChicoY = 10
    var imagen : Bitmap ?= null

    constructor(x:Int, y:Int, radio:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()
        //DANDO VALOR A ANCHO Y ALTO PARA TRATAR CIRCULO COMO CUAD
        ancho = this.radio*2
        alto = ancho
    }

    constructor(x:Int, y:Int, ancho:Int, alto:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        //
        this.ancho = ancho.toFloat()
        this.alto = alto.toFloat()
        tipo = 2
    }

    constructor(icono:Bitmap,x:Int, y:Int) :this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        imagen = icono
        tipo = 3
        ancho = imagen!!.width.toFloat()
        alto = imagen!!.height.toFloat()
    }

    fun pintar(c: Canvas, p: Paint){
        when(tipo){
            1->{
                c.drawCircle(x+radio,y+radio,radio, p)
            }
            2->{
                c.drawRect(x,y,x+ancho,y+alto, p)
            }
            3->{
                c.drawBitmap(imagen!!, x, y, p)
            }
        }
    }


    fun estaEnArea(event: MotionEvent):Boolean{
        if(event.x >= x && event.x<=x+ancho){
            if(event.y >= y && event.y<=y+alto){
                return true
            }
        }
        /* when(tipo){
            1->{
                if(event.x>=x-radio && event.x<=x+radio){
                    if(event.y>=y-radio && event.y<=y+radio){
                        return true
                    }
                }
            }
            2->{

            }
        }*/
        return false
    }

    fun arrastrar(event: MotionEvent){
        x = event.x - (ancho/2)
        y = event.y - (alto/2)
        /* when(tipo){
            1->{
                x = event.x
                y = event.y
            }
            2->{

            }
        }*/

    }

    fun rebote(ancho:Int, alto:Int){
        x+= incX
        if(x<=-100 || x>=ancho){
            incX *= -1
        }
        y+= incY
        if(y<=-100 || y>=alto){
            incY *= -1
        }

    }

    fun reboteCircChico(ancho:Int, alto:Int){
        x+= incChicoX
        if(x<=-100 || x>=ancho){
            incChicoX *= -1
        }
        y+= incChicoY
        if(y<=-100 || y>=alto){
            incChicoY *= -1
        }

    }

    fun reboteCircGrande(ancho:Int, alto:Int){
        x+= incGrandeX
        if(x<=-100 || x>=ancho){
            incGrandeX *= -1
        }
        y+= incGrandeY
        if(y<=-100 || y>=alto){
            incGrandeY *= -1
        }

    }

    fun colision(objetoB: FiguraGeometrica): Boolean{

        //caso 1
        if(objetoB.estaEnArea(x+ancho,y+alto)) {
            return true


            //caso 2
            if (objetoB.estaEnArea(x, y + alto))
                return true


            //caso 3
            if (objetoB.estaEnArea(x + ancho, y + alto))
                return false

            //caso 4
            if (objetoB.estaEnArea(x + ancho, y))
                return true
            //caso 5
            if (objetoB.estaEnArea(x+ancho/2, y + alto))
                return true
            //caso 6
            if (objetoB.estaEnArea(x, y + alto/2))
                return true
            //caso 7
            if (objetoB.estaEnArea(x + ancho /2 , y))
                return true
            //caso 8
            if (objetoB.estaEnArea(x + ancho , y + alto / 2))
                return true
        }
        return false
    }

    fun estaEnArea(posX:Float,posY:Float):Boolean{


        if(posX >= x && posX <= x+ancho){
            if(posY >= y && posY <= y+alto){
                return true
            }
        }

        return false
    }
}