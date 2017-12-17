package omy.boston.standardactbar;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView touchableText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        touchableText = (TextView) findViewById(R.id.touchableTekst);
        touchableText.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                showHideActionBar();
            }
        });
    }

    public void showHideActionBar(){
        ActionBar actBar = getSupportActionBar();
        if (actBar.isShowing()){
            actBar.hide();
        }else{
            actBar.show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_add:
                Toast.makeText(MainActivity.this, "Nešto je dodano :)", Toast.LENGTH_LONG).show();
                break;
            case R.id.action_edit:
                Toast.makeText(MainActivity.this, "Nešto je uređivano O:)", Toast.LENGTH_LONG).show();
                break;
            case R.id.action_cancel:
                Toast.makeText(MainActivity.this, "nešto je otkazano ;)", Toast.LENGTH_LONG).show();
                break;
            case R.id.action_delete:
                Toast.makeText(MainActivity.this, "Nešto je izbrisano...", Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }
}
