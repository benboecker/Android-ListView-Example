package de.benboecker.listviewexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    private ArrayList<Country> countries = Country.all();
    private ArrayAdapter<Country> countryAdapter = null;
    private ListView listView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
 		toolbar.setTitle("Custom Adapter & Layout");

        String[] capitals = new String[]{
				"Berlin", "Amsterdam", "London", "Madrid", "Paris", "Rom", "Prag"
		};
		ArrayAdapter<String> arrayAdapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1, capitals);

		this.countryAdapter = new CountryAdapter(this, this.countries);

		this.listView = (ListView) findViewById(R.id.list_view);
		this.listView.setAdapter(this.countryAdapter);
		//this.listView.setAdapter(arrayAdapter);
    }
}
