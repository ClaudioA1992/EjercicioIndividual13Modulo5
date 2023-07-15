package cl.awakelab.ejercicioindividual13modulo5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.text.NumberFormat
import java.util.Currency
import kotlin.math.ceil
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main() {
    println("Ingrese dos números")
    try {
        var numero1: Double = readLine()!!.toDouble()
        var numero2: Float = readLine()!!.toFloat()
        suma(numero1, numero2)
    } catch(e: Exception) {
        println("Error en ingreso de números: " + e)
    }

    println("Ingrese un número a redondear")
    try {
        var numero: Double = readLine()!!.toDouble()
        redondeo(numero)
    } catch (e: Exception) {
        println(e)
    }

    println("Ingrese un número a mostrar como euro")
    try {
        var numero: Double = readLine()!!.toDouble()
        muestraResultado(numero)
    } catch (e: Exception) {
        println("Número con error: " + e)
    }
}

fun suma(numero1: Double, numero2: Float) : Double {
    println(numero1 + numero2)
    return numero1 + numero2
}

fun redondeo(numero: Double) : Int {
    //val numeroRedondeado: Int = Math.ceil(numero).toInt()
    val numeroRedondeado: Double = ceil(numero)
    println(numero.roundToInt())
    return numero.roundToInt()
}

fun muestraResultado(numero: Double) : String {

    val format: NumberFormat = NumberFormat.getCurrencyInstance()
    format.setMaximumFractionDigits(2)
    format.setCurrency(Currency.getInstance("EUR"))
    println(format.format(numero))
    return format.format(numero)

}

