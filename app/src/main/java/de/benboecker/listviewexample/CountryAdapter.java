package de.benboecker.listviewexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by Benni on 26.10.16.
 */

public class CountryAdapter extends ArrayAdapter<Country> {
    public CountryAdapter(Context context, ArrayList<Country> countries) {
        super(context, 0, countries);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the data item for this position
        Country country= getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.country_row, parent, false);
        }

        // Lookup view for data population
        TextView textViewName = (TextView) convertView.findViewById(R.id.countryName);
        TextView textViewCapital = (TextView) convertView.findViewById(R.id.countryCapital);
        TextView textViewPopulation = (TextView) convertView.findViewById(R.id.countryPopulation);
        TextView textViewFlag = (TextView) convertView.findViewById(R.id.countryFlag);

        // Populate the data into the template view using the data object
        textViewName.setText(country.name);
        textViewCapital.setText("Hauptstadt:\t " + country.capital);
        textViewPopulation.setText("Einwohner:\t " + NumberFormat.getNumberInstance(Locale.GERMANY).format(country.poulation));
        textViewFlag.setText(country.flag);

        // Return the completed view to render on screen
        return convertView;
    }
}
