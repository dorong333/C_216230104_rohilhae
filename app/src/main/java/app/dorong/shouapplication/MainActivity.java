package app.dorong.shouapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void onClick(View view)
    {
        Intent intent = new Intent(this, SubActivity.class);
        startActivity(intent);
    }

        EditText editText=(EditText)findViewById(R.id.edit_id);
        EditText editPassword=(EditText)findViewById(R.id.edit_password);
        Button buttonLogin=(Button)findViewById(R.id.button_login);

}
