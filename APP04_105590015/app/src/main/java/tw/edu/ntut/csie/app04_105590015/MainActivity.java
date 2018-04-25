package tw.edu.ntut.csie.app04_105590015;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {

    private TextView mTxtList;
    private Button mBtnOK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTxtList = (TextView) findViewById(R.id.txtList);
        mBtnOK = (Button) findViewById(R.id.btnOK);
        ArrayAdapter<CharSequence> arrAdapWeekday =
                ArrayAdapter.createFromResource(this, R.array.list,
                        android.R.layout.simple_list_item_1);
        setListAdapter(arrAdapWeekday);

        ListView listview = getListView();
        listview.setOnItemClickListener(listViewOnItemClick);
        mBtnOK.setOnClickListener(btnOKOnClick);
    }

    private AdapterView.OnItemClickListener listViewOnItemClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view,
                                int position, long id) {
            // 在TextView元件中顯示使用者點選的項目名稱。
            mTxtList.setText(mTxtList.getText().toString()+" "+((TextView) view).getText());
        }
    };

    private View.OnClickListener btnOKOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            mTxtList.setText("");
        }
    };
}
