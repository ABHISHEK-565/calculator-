package com.example.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var isNewOp = true
    var oldNumber = ""
    var op =""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun backEvent(view: View) {

    }



    fun numberEvent(view: View) {
if (isNewOp)
    input_value.setText("")
            isNewOp = false

        var buclick:String = input_value.text.toString()
         var buselect:Button = view as Button
        when(buselect.id){
            bu1.id->{buclick+="1"}
            bu2.id->{buclick+="2"}
            bu3.id->{buclick+="3"}
            bu4.id->{buclick+="4"}
            bu5.id->{buclick+="5"}
            bu6.id->{buclick+="6"}
            bu7.id->{buclick+="7"}
            bu8.id->{buclick+="8"}
            bu9.id->{buclick+="9"}
            bu0.id->{buclick+="0"}
            budot.id->{buclick+="."}
        }
        input_value.setText(buclick)
    }
    fun operatorEvent(view: View) {
        isNewOp =true
        oldNumber = input_value.text.toString()
        var buselect:Button = view as Button
        when(buselect.id) {
            bumultiply.id -> { op = "*" }
            buplus.id -> { op = "+" }
            buminus.id -> { op = "-" }
            budivide.id -> { op = "/" }
            bumultiply.id -> { op = "*" }
            bupercent.id -> { op = "%" }
        }
        input_value.append(op)}
    fun clearEvent(view: View) {

        input_value.setText("0")
        result.setText("")
        isNewOp=true
    }
    fun equalEvent(view: View) {

        var newNumber:String = input_value.text.toString()
        var res : Double = 0.0
        when(op){
            "+" -> {res=oldNumber.toDouble() + newNumber.toDouble()}
            "-" -> {res=oldNumber.toDouble() - newNumber.toDouble()}
            "*" -> {res=oldNumber.toDouble() * newNumber.toDouble()}
            "/" -> {res=oldNumber.toDouble() / newNumber.toDouble()}
            "%" -> {res=newNumber.toDouble()/100 }
        }
        result.setText(res.toString())
        input_value.setText(res.toString())
    }

}