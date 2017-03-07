package css.cis3334hailey.assignment7;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView tvFlooringResult;
    String width;
    String length;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);

        tvFlooringResult = (TextView) findViewById(R.id.textViewFlooringResult);

        Bundle extras = getIntent().getExtras();


        width = extras.getSerializable("width").toString();
        length = extras.getSerializable("length").toString();


        double width2 = Double.parseDouble(width);
        double length2 = Double.parseDouble(length);

        tvFlooringResult.setText("The width is " + width2 + " feet and the length is " + length2 + " feet so the flooring needed is "+ width2 * length2);

    }
}

