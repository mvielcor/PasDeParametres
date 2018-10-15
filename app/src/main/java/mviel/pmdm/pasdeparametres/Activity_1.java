package mviel.pmdm.pasdeparametres;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_1 extends AppCompatActivity {


    /*Declarem els atributs de la classe que necessitarem
    * 2 Editext i 1 button*/
    EditText parametre_a_enviar_1, parametre_a_enviar_2;
    Button b_enviar_parametres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        /*Enllacem els atributs de la classe amb l'element de l'xml que representaran */
        parametre_a_enviar_1 = (EditText) findViewById(R.id.editText);
        parametre_a_enviar_2 = (EditText) findViewById(R.id.editText2);
        b_enviar_parametres = (Button) findViewById(R.id.button);

        /* Afegim un listener al botó */
        b_enviar_parametres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Creem l'Intent
                Intent i = new Intent(getApplicationContext(),Activity2.class);
                // Creem l'objecte Bundle
                Bundle b = new Bundle();
                // Afegim al Bundle els paràmetres que volem passar

                String nom = parametre_a_enviar_1.getText().toString();
                int edat;
                try {
                    edat =Integer.parseInt(parametre_a_enviar_2.getText().toString());
                }catch(NumberFormatException nfe){
                    edat=0;
                }

                b.putString("parametreString",nom);
                b.putInt("parametreInt",edat);
                //Afegim el Bundle a l'Intent
                i.putExtras(b);
                //Carreguem l'Activity2
                startActivity(i);
            }
        });
    }


}
