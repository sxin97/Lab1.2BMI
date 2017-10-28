package my.edu.tarc.lab12bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText h_input, w_input;
    private TextView result;
    private ImageView chgImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        h_input=(EditText)findViewById(R.id.h_input);
        w_input=(EditText)findViewById(R.id.w_input);
        result=(TextView)findViewById(R.id.result);
        chgImage=(ImageView)findViewById(R.id.chgImage);

    }

    public void calculate_BMI(View view){


        double kg =Double.parseDouble(w_input.getText().toString());
        double m =Double.parseDouble(h_input.getText().toString());
        double result2 = kg/(m*m);

        result.setText(getResources().getString(R.string.word)+" "+String.format("%.2f",result2));

        if (result2<=18.5)
            chgImage.setImageResource(R.drawable.under);
        else if(result2>=25)
            chgImage.setImageResource(R.drawable.over);
        else
            chgImage.setImageResource(R.drawable.normal);
    }
    public void resetBMI(View view){


        h_input.setText("");
        w_input.setText("");
        result.setText("");
        chgImage.setImageResource(R.drawable.empty);
    }

}
