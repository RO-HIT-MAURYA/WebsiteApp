package rohit.maurya.websiteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onButtonClick(View view)
    {
        String url = ((EditText)findViewById(R.id.editText)).getText().toString();
        String title = ((EditText)findViewById(R.id.eT)).getText().toString();

        Intent intent = new Intent(this,WebViewActivity.class);
        intent.putExtra("url",url);
        intent.putExtra("title",title);
        startActivity(intent);

    }
}
