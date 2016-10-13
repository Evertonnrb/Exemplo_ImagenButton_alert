package br.com.fabricadeprogramador.buttonandimagen;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //Alerta para imagenButton
    public void alerta1(View view){
        AlertDialog alertDialog;
        alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Bem vindo");
        alertDialog.setMessage("Testanto o click da imagem");
        alertDialog.show();
    }
    //Alerta para os boto~es
    public void alertaX(View view){
        //Acessando o botao com um casting Button para view
        Button x = (Button)view;
        String msg = "Testando o botão X";
        //Concatenando a msgm do click
        msg = msg.concat(x.getText().toString());
        //Instanciar a janela de dialogo
        AlertDialog a;
        a = new AlertDialog.Builder(this).create();
        a.setTitle("Janela do botao X");
        a.setTitle("Você apertou o botão X");
        //passanda a string msg para o alert
        a.setMessage(msg);
        a.show();
    }
    //Alerta para os boto~es
    public void alertaY(View view){
        //Acessando o botao com um casting Button para view
        Button x = (Button)view;
        String msg = "Testando o botão X";
        //Concatenando a msgm do click
        msg = msg.concat(x.getText().toString());
        //Instanciar a janela de dialogo
        AlertDialog a;
        a = new AlertDialog.Builder(this).create();
        a.setTitle("Janela do botao Y");
        a.setTitle("Você apertou o botão Y");
        //passanda a string msg para o alert
        a.setMessage(msg);
        a.show();
    }
}
