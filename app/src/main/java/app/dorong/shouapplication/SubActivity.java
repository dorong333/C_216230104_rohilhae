package app.dorong.shouapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SubActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = new Intent(this, Sub2Activity.class);
        startActivity(intent);
    }


    public void onClick(View view)
    {
        Intent intent = new Intent(this, Sub2Activity.class);
        startActivity(intent);

        finish();
    }



    /*Toast toast = Toast.makeText(this, "슈어플에 오신걸 환영합니다:)", Toast.LENGTH_SHORT);
    toast.show(); */

}


