package com.rafaelo.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void PressionarBotao(View view){
        TextView tvFrase = findViewById(R.id.tvFrase);
        String[] frases = {
                "Começar o dia com um pensamento positivo pode ser a chave para atrair coisas boas. Que tal tentar? Comece o dia com força, energia e determinação, com estas frases positivas de motivação.",
                "Levanta, sacode a poeira, dá a volta por cima.",
                "Respire fundo e fique atento às surpresas deliciosas que a vida preparou para você!",
                "Nem todos os dias são bons, mas há algo bom em cada dia.",
                "Respeite sua mente e trate seu corpo com carinho.",
                "Um passo de cada vez. Até meio passo serve. Siga firme, não há motivo para ter pressa.",
                "Suba o primeiro degrau com fé. Não é necessário que você veja toda a escada, apenas dê o primeiro passo.",
                "Para hoje, vou usar minha melhor roupa: a fé.",
                "Toda manhã você tem duas escolhas: continuar dormindo com seus sonhos ou acordar e persegui-los!",
                "A cada novo dia, a cada momento, temos a nossa disposição a maravilhosa possibilidade do encontro, que traz em si infinitas oportunidades. Precisamos apenas estar atentos.",
                "O otimismo é a fé em ação. Nada se pode levar a efeito sem otimismo.",
                "Dentro de você, há uma luz muito forte! Acredite nela e deixe que ela ilumine o seu dia.",
                "Comece seu dia com um sorriso que venha lá de dentro da alma.",
                "A sua irritação não solucionará problema algum. O seu mau humor não modifica a vida. Não estrague o seu dia.",
                "Uma injeção de positividade logo de manhã é que todo mundo gostaria de ter. Mas e se na verdade já tivéssemos essa possibilidade? Que tal pensar no amanhecer como uma nova chance de começar?",
                "Lembre-se que, quando a vida te derrubar, você pode sempre se levantar!",
                "Seja como as plantas que têm seus diferentes ciclos. Há fases difíceis e outras mais fáceis, mas todas são importantes para o nosso crescimento.",
                "Vamos inventar o amanhã no lugar de se preocupar com o que aconteceu ontem.",
                "As pessoas mais felizes não têm as melhores coisas. Elas sabem fazer o melhor das oportunidades que aparecem em seus caminhos.",
                "Ninguém, além de você, está no controle de sua felicidade. Portanto, ajuste as velas e corrija e rumo.",
                "Imagine uma nova história para sua vida e acredite nela.",
                "Você tem que acordar cada manhã com determinação se você pretende ir para a cama com satisfação.",
                "Meta do dia: agradecer.",
                "Pensar em quem compartilha a vida com você é uma das formas mais bonitas de encontrar energia!",
                "Todos os dias são diferentes. Basta observar o que a natureza tem para te oferecer.",
                "Hoje acordei pra viver, levantar e seguir em frente. Porque a vida sempre pede um pouco mais da gente.",
                "A força mais potente do universo é a fé.",
                "Um homem criativo é motivado pelo desejo de alcançar, não pelo desejo de vencer os outros.",
                "Acredite em milagres, mas não dependa deles.",
                "Cada segundo é tempo para mudar tudo para sempre.",
                "Não importa a cor do céu, quem faz o dia lindo é você.",
                "A beleza começa quando você decide ser você mesma.",
                "Se quer viver uma vida feliz, amarre-se a um objetivo, não às pessoas ou aos objetos."
        };

        int aleatorio = new Random().nextInt(frases.length);


        tvFrase.setText(frases[aleatorio]);
    }
}