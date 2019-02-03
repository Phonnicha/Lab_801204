package th.ac.su.ict.phonnicha.homework2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button one, two, three, four, five, six;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvShow = (TextView)findViewById(R.id.colorCode);

        one = (Button)findViewById(R.id.btn1);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);

        one.setOnClickListener(new Click());
        two.setOnClickListener(new Click());
        three.setOnClickListener(new Click());
        four.setOnClickListener(new Click());
        five.setOnClickListener(new Click());
        six.setOnClickListener(new Click());



    }
    public class Click implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn1:
                    tvShow.setText("235, 225, 221");
                    tvShow.setBackgroundColor(0xFFEBE1DD);
                    break;
                case R.id.btn2:
                    tvShow.setText("236, 203, 202");
                    tvShow.setBackgroundColor(0xFFECCBCA);
                    break;
                case R.id.btn3:
                    tvShow.setText("116, 131, 156");
                    tvShow.setBackgroundColor(0xFF74839C);
                    break;
                case R.id.btn4:
                    tvShow.setText("153, 169, 191");
                    tvShow.setBackgroundColor(0xFF99A9BF);
                    break;
                case R.id.btn5:
                    tvShow.setText("194, 204, 213");
                    tvShow.setBackgroundColor(0xFFC2CCD5);
                    break;
                case R.id.btn6:
                    tvShow.setText("221, 226, 229");
                    tvShow.setBackgroundColor(0xFFDDE2E5);
                    break;
                default:




            }
        }
    }
}
