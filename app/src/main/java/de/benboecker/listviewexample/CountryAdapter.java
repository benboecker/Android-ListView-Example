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
        Country country = this.getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.country_row, parent, false);
        }

        // Lookup view for data population
        TextView textViewName = (TextView) convertView.findViewById(R.id.countryName);
        TextView textViewCapital = (TextView) convertView.findViewById(R.id.countryCapital);
        TextView textViewPopulation = (TextView) convertView.findViewById(R.id.countryPopulation);
        TextView textViewFlag = (TextView) convertView.findViewById(R.id.countryFlag);

        // Populate the data into the template view using the data object
        textViewName.setText(country.name);
        textViewCapital.setText("\uD83C\uDFD9\t " + country.capital);
        textViewPopulation.setText("\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC67\t " + NumberFormat.getNumberInstance(Locale.GERMANY).format(country.poulation));
        textViewFlag.setText(country.flag);

        // Return the completed view to render on screen
        return convertView;
    }
}
