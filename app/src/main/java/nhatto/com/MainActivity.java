package nhatto.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private EditText edtName;
    private EditText edtNumber;
    private EditText edtAddress;
    private EditText edtEmail;
    private Button btnSave;
    private ListView lvStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = (EditText) findViewById(R.id.edt_name);
        edtNumber = (EditText) findViewById(R.id.edt_number);
        edtAddress = (EditText) findViewById(R.id.edt_address);
        edtEmail = (EditText) findViewById(R.id.edt_email);
        btnSave = (Button) findViewById(R.id.btn_save);

        setEv();
    }

    private void setEv() {
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
