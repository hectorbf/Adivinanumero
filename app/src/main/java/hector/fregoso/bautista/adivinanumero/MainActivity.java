package hector.fregoso.bautista.adivinanumero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Usuario, Passwordd;
    Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Usuario = (EditText) findViewById(R.id.etusuario);
        Passwordd = (EditText) findViewById(R.id.etpass);
        btnIngresar = (Button) findViewById(R.id.btningresar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = Usuario.getText().toString();
                String password = Passwordd.getText().toString();
                if(usuario == "Hector" && password.equals("hbf1")){
                    Toast.makeText(MainActivity.this, "Bienvenido", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
