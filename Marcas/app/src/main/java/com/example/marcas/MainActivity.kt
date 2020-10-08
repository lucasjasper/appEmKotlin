package com.example.marcas

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.marcas.R.drawable
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var contador = 0
        var click = 0

        val auxContador = Contador()

        imagem.setImageResource(drawable.spotify)
        p1.text = "Spotify"
        p2.text = "Facebook"
        p3.text = "Instagram"
        p4.text = "Whatsapp"

        botao.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {

                // PERGUNTA 1 - CORRETA
                if (contador == 0 && p1.isChecked) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("RESPOSTA CORRETA")
                    resultadoTexto.setTextColor(Color.GREEN)
                    resultadoImagem.setImageResource(drawable.correto)

                    imagem.setImageResource(drawable.pringles)
                    p1.setChecked(false)
                    p1.text = "Torcida"
                    p2.text = "Ruffles"
                    p3.text = "Pringles"
                    p4.text = "Doritos"

                    click = 1
                }

                // PERGUNTA 1 - INCORRETA
                if (contador == 0 && (p2.isChecked || p3.isChecked || p4.isChecked)) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("RESPOSTA INCORRETA")
                    resultadoTexto.setTextColor(Color.RED)
                    resultadoImagem.setImageResource(drawable.incorreto)

                    p1.setChecked(false)
                    p2.setChecked(false)
                    p3.setChecked(false)
                    p4.setChecked(false)
                }

                // PERGUNTA 2 - CORRETA
                if (contador == 1 && p3.isChecked) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("RESPOSTA CORRETA")
                    resultadoTexto.setTextColor(Color.GREEN)
                    resultadoImagem.setImageResource(drawable.correto)

                    imagem.setImageResource(drawable.lays)
                    p1.text = "Pingo de Ouro"
                    p2.text = "Helman Chips"
                    p3.text = "Lays"
                    p4.text = "Cebolitos"

                    p3.setChecked(false)

                    click = 1
                }

                // PERGUNTA 2 - INCORRETA
                if (contador == 1 && (p1.isChecked || p2.isChecked || p4.isChecked)) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("RESPOSTA INCORRETA")
                    resultadoTexto.setTextColor(Color.RED)
                    resultadoImagem.setImageResource(drawable.incorreto)

                    p1.setChecked(false)
                    p2.setChecked(false)
                    p3.setChecked(false)
                    p4.setChecked(false)

                    imagem.setImageResource(drawable.spotify)
                    p1.text = "Spotify"
                    p2.text = "Facebook"
                    p3.text = "Instagram"
                    p4.text = "Whatsapp"

                    click = 0
                    contador = 0
                }

                // PERGUNTA 3 - CORRETA
                if (contador == 2 && p3.isChecked) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("RESPOSTA CORRETA")
                    resultadoTexto.setTextColor(Color.GREEN)
                    resultadoImagem.setImageResource(drawable.correto)

                    imagem.setImageResource(drawable.billabong)
                    p1.text = "Billabong"
                    p2.text = "Ecko Unltd"
                    p3.text = "Abercrombie"
                    p4.text = "Hurley"

                    p3.setChecked(false)

                    click = 1
                }

                // PERGUNTA 3 - INCORRETA
                if (contador == 2 && (p1.isChecked || p2.isChecked || p4.isChecked)) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("RESPOSTA INCORRETA")
                    resultadoTexto.setTextColor(Color.RED)
                    resultadoImagem.setImageResource(drawable.incorreto)

                    p1.setChecked(false)
                    p2.setChecked(false)
                    p3.setChecked(false)
                    p4.setChecked(false)

                    imagem.setImageResource(drawable.spotify)
                    p1.text = "Spotify"
                    p2.text = "Facebook"
                    p3.text = "Instagram"
                    p4.text = "Whatsapp"

                    click = 0
                    contador = 0
                }

                // PERGUNTA 4 - CORRETA
                if (contador == 3 && p1.isChecked) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("RESPOSTA CORRETA")
                    resultadoTexto.setTextColor(Color.GREEN)
                    resultadoImagem.setImageResource(drawable.correto)

                    imagem.setImageResource(drawable.kappa)
                    p1.text = "Kappa"
                    p2.text = "Ecko Unltd"
                    p3.text = "Abercrombie"
                    p4.text = "Hurley"

                    p1.setChecked(false)

                    click = 1
                }

                // PERGUNTA 4 - INCORRETA
                if (contador == 3 && (p3.isChecked || p2.isChecked || p4.isChecked)) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("RESPOSTA INCORRETA")
                    resultadoTexto.setTextColor(Color.RED)
                    resultadoImagem.setImageResource(drawable.incorreto)

                    p1.setChecked(false)
                    p2.setChecked(false)
                    p3.setChecked(false)
                    p4.setChecked(false)

                    imagem.setImageResource(drawable.spotify)
                    p1.text = "Spotify"
                    p2.text = "Facebook"
                    p3.text = "Instagram"
                    p4.text = "Whatsapp"

                    click = 0
                    contador = 0
                }

                // PERGUNTA 5 - CORRETA
                if (contador == 4 && p1.isChecked) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("RESPOSTA CORRETA")
                    resultadoTexto.setTextColor(Color.GREEN)
                    resultadoImagem.setImageResource(drawable.correto)

                    imagem.setImageResource(drawable.mizzuno)
                    p1.text = "Umbro"
                    p2.text = "Reebok"
                    p3.text = "FILA"
                    p4.text = "Mizzuno"

                    p1.setChecked(false)

                    click = 1
                }

                // PERGUNTA 5 - INCORRETA
                if (contador == 4 && (p2.isChecked || p3.isChecked || p4.isChecked)) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("RESPOSTA INCORRETA")
                    resultadoTexto.setTextColor(Color.RED)
                    resultadoImagem.setImageResource(drawable.incorreto)

                    p1.setChecked(false)
                    p2.setChecked(false)
                    p3.setChecked(false)
                    p4.setChecked(false)

                    imagem.setImageResource(drawable.spotify)
                    p1.text = "Spotify"
                    p2.text = "Facebook"
                    p3.text = "Instagram"
                    p4.text = "Whatsapp"

                    click = 0
                    contador = 0
                }
                // PERGUNTA 6 - CORRETA
                if (contador == 5 && p4.isChecked) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("RESPOSTA CORRETA")
                    resultadoTexto.setTextColor(Color.GREEN)
                    resultadoImagem.setImageResource(drawable.correto)

                    imagem.setImageResource(drawable.knorr)
                    p1.text = "Leve"
                    p2.text = "Primor"
                    p3.text = "Knorr"
                    p4.text = "Coamo"

                    p4.setChecked(false)

                    click = 1
                }

                // PERGUNTA 6 - INCORRETA
                if (contador == 5 && (p2.isChecked || p1.isChecked || p3.isChecked)) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("RESPOSTA INCORRETA")
                    resultadoTexto.setTextColor(Color.RED)
                    resultadoImagem.setImageResource(drawable.incorreto)

                    p1.setChecked(false)
                    p2.setChecked(false)
                    p3.setChecked(false)
                    p4.setChecked(false)

                    imagem.setImageResource(drawable.spotify)
                    p1.text = "Spotify"
                    p2.text = "Facebook"
                    p3.text = "Instagram"
                    p4.text = "Whatsapp"

                    click = 0
                    contador = 0
                }
                // PERGUNTA 7 - CORRETA
                if (contador == 6 && p3.isChecked) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("RESPOSTA CORRETA")
                    resultadoTexto.setTextColor(Color.GREEN)
                    resultadoImagem.setImageResource(drawable.correto)

                    imagem.setImageResource(drawable.scania)
                    p1.text = "Russov"
                    p2.text = "Scania"
                    p3.text = "Orloff"
                    p4.text = "Askov"

                    p3.setChecked(false)

                    click = 1
                }

                // PERGUNTA 7 - INCORRETA
                if (contador == 6 && (p2.isChecked || p1.isChecked || p4.isChecked)) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("RESPOSTA INCORRETA")
                    resultadoTexto.setTextColor(Color.RED)
                    resultadoImagem.setImageResource(drawable.incorreto)

                    p1.setChecked(false)
                    p2.setChecked(false)
                    p3.setChecked(false)
                    p4.setChecked(false)

                    imagem.setImageResource(drawable.spotify)
                    p1.text = "Spotify"
                    p2.text = "Facebook"
                    p3.text = "Instagram"
                    p4.text = "Whatsapp"

                    click = 0
                    contador = 0
                }
                // PERGUNTA 8 - CORRETA
                if (contador == 7 && p2.isChecked) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("RESPOSTA CORRETA")
                    resultadoTexto.setTextColor(Color.GREEN)
                    resultadoImagem.setImageResource(drawable.correto)

                    imagem.setImageResource(drawable.zowie)
                    p1.text = "SteelSeries"
                    p2.text = "Gear"
                    p3.text = "BenQ"
                    p4.text = "Zowie"

                    p2.setChecked(false)

                    click = 1
                }

                // PERGUNTA 8 - INCORRETA
                if (contador == 7 && (p3.isChecked || p1.isChecked || p4.isChecked)) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("RESPOSTA INCORRETA")
                    resultadoTexto.setTextColor(Color.RED)
                    resultadoImagem.setImageResource(drawable.incorreto)

                    p1.setChecked(false)
                    p2.setChecked(false)
                    p3.setChecked(false)
                    p4.setChecked(false)

                    imagem.setImageResource(drawable.spotify)
                    p1.text = "Spotify"
                    p2.text = "Facebook"
                    p3.text = "Instagram"
                    p4.text = "Whatsapp"

                    click = 0
                    contador = 0
                }
                // PERGUNTA 9 - CORRETA
                if (contador == 8 && p4.isChecked) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("RESPOSTA CORRETA")
                    resultadoTexto.setTextColor(Color.GREEN)
                    resultadoImagem.setImageResource(drawable.correto)

                    imagem.setImageResource(drawable.maserati)
                    p1.text = "Maserati"
                    p2.text = "Trident"
                    p3.text = "QuickSilver"
                    p4.text = "Devils Sport"

                    p4.setChecked(false)

                    click = 1
                }

                // PERGUNTA 9 - INCORRETA
                if (contador == 8 && (p2.isChecked || p1.isChecked || p3.isChecked)) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("RESPOSTA INCORRETA")
                    resultadoTexto.setTextColor(Color.RED)
                    resultadoImagem.setImageResource(drawable.incorreto)

                    p1.setChecked(false)
                    p2.setChecked(false)
                    p3.setChecked(false)
                    p4.setChecked(false)

                    imagem.setImageResource(drawable.spotify)
                    p1.text = "Spotify"
                    p2.text = "Facebook"
                    p3.text = "Instagram"
                    p4.text = "Whatsapp"

                    click = 0
                    contador = 0
                }
                // PERGUNTA 10 - CORRETA
                if (contador == 9 && p1.isChecked) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("RESPOSTA CORRETA")
                    resultadoTexto.setTextColor(Color.GREEN)
                    resultadoImagem.setImageResource(drawable.correto)

                    imagem.setImageResource(drawable.carrefour)
                    p1.text = "Extra"
                    p2.text = "Carrefour"
                    p3.text = "P&G"
                    p4.text = "Quaker"

                    p1.setChecked(false)

                    click = 1
                }

                // PERGUNTA 10 - INCORRETA
                if (contador == 9 && (p2.isChecked || p4.isChecked || p3.isChecked)) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("RESPOSTA INCORRETA")
                    resultadoTexto.setTextColor(Color.RED)
                    resultadoImagem.setImageResource(drawable.incorreto)

                    p1.setChecked(false)
                    p2.setChecked(false)
                    p3.setChecked(false)
                    p4.setChecked(false)

                    imagem.setImageResource(drawable.spotify)
                    p1.text = "Spotify"
                    p2.text = "Facebook"
                    p3.text = "Instagram"
                    p4.text = "Whatsapp"

                    click = 0
                    contador = 0
                }
                // PERGUNTA 11 - CORRETA
                if (contador == 10 && p2.isChecked) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("RESPOSTA CORRETA")
                    resultadoTexto.setTextColor(Color.GREEN)
                    resultadoImagem.setImageResource(drawable.correto)

                    imagem.setImageResource(drawable.bestbuy)
                    p1.text = "Big"
                    p2.text = "SALES"
                    p3.text = "Walmart"
                    p4.text = "BestBuy"

                    p2.setChecked(false)

                    click = 1
                }

                // PERGUNTA 11 - INCORRETA
                if (contador == 10 && (p1.isChecked || p4.isChecked || p3.isChecked)) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("RESPOSTA INCORRETA")
                    resultadoTexto.setTextColor(Color.RED)
                    resultadoImagem.setImageResource(drawable.incorreto)

                    p1.setChecked(false)
                    p2.setChecked(false)
                    p3.setChecked(false)
                    p4.setChecked(false)

                    imagem.setImageResource(drawable.spotify)
                    p1.text = "Spotify"
                    p2.text = "Facebook"
                    p3.text = "Instagram"
                    p4.text = "Whatsapp"

                    click = 0
                    contador = 0
                }
                // FINAL - CORRETA
                if (contador == 11 && p4.isChecked) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("VOCE VENCEU")
                    resultadoTexto.setTextColor(Color.YELLOW)
                    resultadoImagem.setImageResource(drawable.vitoria)

                    imagem.setImageResource(drawable.spotify)
                    p1.text = "Spotify"
                    p2.text = "Facebook"
                    p3.text = "Instagram"
                    p4.text = "Whatsapp"

                    p4.setChecked(false)

                    click = 0
                    contador = 0
                }

                // FINAL - INCORRETA
                if (contador == 11 && (p2.isChecked || p3.isChecked || p1.isChecked)) {

                    resultado.setVisibility(View.VISIBLE)
                    resultadoTexto.setText("RESPOSTA INCORRETA")
                    resultadoTexto.setTextColor(Color.RED)
                    resultadoImagem.setImageResource(drawable.incorreto)

                    p1.setChecked(false)
                    p2.setChecked(false)
                    p3.setChecked(false)
                    p4.setChecked(false)

                    imagem.setImageResource(drawable.spotify)
                    p1.text = "Spotify"
                    p2.text = "Facebook"
                    p3.text = "Instagram"
                    p4.text = "Whatsapp"

                    click = 0
                    contador = 0
                }

                contador = auxContador.somaContador(contador, click);
                click = 0

                pontos.setText(contador.toString())

            }
/*
            private fun fadeOutImage() {
                val objectAnimator: ObjectAnimator = ObjectAnimator.ofObject(
                    drawable.spotify,
                    View.ALPHA,
                    0
                )
                //Tempo, em milisegundos, da sua animação. Caso não coloque nenhum, o default é 300.
                objectAnimator.duration = 200
                /*Aqui esta a mágica. Você define o tempo (em milisegundos) para sua animação começar.
                * Ou seja, depois de 2 segundos, sua ImageView ira começar a desaparecer */
                objectAnimator.startDelay = 2000
                //Caso você queira um Listener para o termino da animação
                objectAnimator.addListener(object : AnimatorListener {
                    override fun onAnimationStart(animation: Animator) {}
                    override fun onAnimationEnd(animation: Animator) {}
                    override fun onAnimationCancel(animation: Animator) {}
                    override fun onAnimationRepeat(animation: Animator) {}
                })
                objectAnimator.start()
            }
*/
        })
    }
}
