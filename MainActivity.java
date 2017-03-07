package css.cis3334hailey.assignment7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etWidth, etLength;
    Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etWidth = (EditText) findViewById(R.id.editTextWidth);
        etLength = (EditText) findViewById(R.id.editTextLength);
        btnResult = (Button) findViewById(R.id.buttonResult); }



    public void onClickResult(View view){

                String width = etWidth.getText().toString();
                String length = etLength.getText().toString();



                Intent secActIntent = new Intent (this, ResultActivity.class);

                secActIntent.putExtra("width", width);
                secActIntent.putExtra("length", length);
                startActivity(secActIntent);
            }
        }
