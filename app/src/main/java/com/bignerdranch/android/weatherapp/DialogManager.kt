package com.bignerdranch.android.weatherapp

import android.app.AlertDialog
import android.widget.EditText
import android.content.Context
import android.content.DialogInterface
import android.graphics.Color
import com.bignerdranch.android.weatherapp.adapters.WeatherAdapter

object DialogManager {

    fun searchByNameDialog(context: Context, listener: Listener){
        val builder = AlertDialog.Builder(context)
        val edName = EditText(context)
        builder.setView(edName)
        val dialog = builder.create()
        dialog.setTitle("Город")



        dialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK"){ _ , _ ->
            listener.onClick(edName.text.toString())
            dialog.dismiss()
        }
        dialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Отменить"){ _ , _ ->
            dialog.dismiss()
        }
        dialog.show()

        //цвет кнопок
        dialog.getButton(AlertDialog.BUTTON_POSITIVE).setBackgroundColor(Color.BLUE)
        dialog.getButton(AlertDialog.BUTTON_NEGATIVE).setBackgroundColor(Color.DKGRAY)




    }
    interface Listener{
        fun onClick(name: String?)
    }
}


