package com.example.dio

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val resultado = resultados
        // se ficar com a "variavel vermelha" apertar em "import" que irá linkar.

        btCalcular.setOnClickListener {
            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val nota3 = Integer.parseInt(nota3.text.toString())
            val nota4 = Integer.parseInt(nota4.text.toString())
            // Media do aluno 4 notas divididas por 4
            val media = (nota1+nota2+nota3+nota4)/4
            val faltas = Integer.parseInt(faltas.text.toString())

            // Media do aluno
            if (media >= 6 && faltas <= 10) {
                resultado.setText("Aluno foi Aprovado!!" + "\n" + "Nota Final: " + media + "\n"+ "Faltas: " + faltas)
                resultado.setTextColor(Color.BLUE)
                // mostra o resultado em azul se aprovado
            }
            else {
                resultado.setText("Aluno foi Reprovado!!" + "\n" + "Nota Final: " + media + "\n"+ "Faltas: " + faltas)
                resultado.setTextColor(Color.RED)
                // mostra o resultado em vermelho se reprovado
            }
        }
    }
}
