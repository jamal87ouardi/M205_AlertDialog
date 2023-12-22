package com.example.m205_alertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener{

            val alertDialogBuilder = AlertDialog.Builder(this)

            // Titre de l'AlertDialog
            alertDialogBuilder.setTitle("Titre de l'alerte")

            // Message à afficher dans l'AlertDialog
            alertDialogBuilder.setMessage("Ceci est un message d'alerte.")

            // Bouton positif (bouton OK dans cet exemple)
            alertDialogBuilder.setPositiveButton("OK") { dialog: DialogInterface, which: Int ->
                // Code à exécuter lorsque l'utilisateur appuie sur le bouton OK
                dialog.dismiss() // Fermer l'AlertDialog
            }

            // Bouton négatif (facultatif)
            alertDialogBuilder.setNegativeButton("Annuler") { dialog: DialogInterface, which: Int ->
                // Code à exécuter lorsque l'utilisateur appuie sur le bouton Annuler
                dialog.dismiss() // Fermer l'AlertDialog
            }

            // Afficher l'AlertDialog
            val alertDialog = alertDialogBuilder.create()
            alertDialog.show()

        }
    }
}