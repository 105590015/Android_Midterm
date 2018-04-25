package tw.edu.ntut.csie.app01_105590015;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTxtLevel;
    private EditText mEditScore;
    private Button mbtnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTxtLevel=(TextView)findViewById(R.id.txtLevel);
        mEditScore=(EditText)findViewById(R.id.editScore);
        mbtnOK=(Button)findViewById(R.id.btnOK);

        mbtnOK.setOnClickListener(btnOKOnClick);
    }
    private View.OnClickListener btnOKOnClick=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            letterGrade lg=new letterGrade();
            int score = Integer.parseInt(mEditScore.getText().toString());
            char level=lg.getLetterGrade(score);
            if(level!='X')
                mTxtLevel.setText("等第:"+level);
            else
                mTxtLevel.setText("輸入分數應介於[0-100]");
        }
    };
}
