package com.chaos.dmfragmentexampletwo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

public class FragmentExampleActivity extends FragmentActivity implements
ToolbarFragment.ToolbarListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_example);
    }
    public void onButtonClick(int fontsize, String text) {
        TextFragment textFragment =
                (TextFragment)
                        getSupportFragmentManager().findFragmentById(R.id.text_fragment);
        textFragment.changeTextProperties(fontsize, text);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_fragment_example,
                menu);
        return true;
    }
}
