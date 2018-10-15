package mviel.pmdm.pasdeparametres;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    /*Atributs*/
    TextView paramString, paramInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        paramString = (TextView)findViewById(R.id.parametreString);
        paramInt = (TextView)findViewById(R.id.parametreInteger);

        //Agafem el bundle que ve amb l'Intent que carrega este activity

        Bundle parametresRebuts = getIntent().getExtras();
        //Agafem els paràmetres del Bundle i els mostrem als TextView corresponents
        paramString.setText(parametresRebuts.getString("parametreString"));
        paramInt.setText(""+parametresRebuts.getInt("parametreInt"));



    }
}
