package de.benboecker.listviewexample;

import java.util.ArrayList;

/**
 * Created by Benni on 26.10.16.
 */

public class Country {
    String name = "";
    String capital = "";
    long poulation = 0;
    String flag = "";

    public Country(String name, String capital, long population, String flag) {
        this.name = name;
        this.capital = capital;
        this.poulation = population;
        this.flag = flag;
    }

    public static ArrayList<Country> all() {
        ArrayList<Country> allCountries = new ArrayList<>();

        allCountries.add(france);
        allCountries.add(germany);
        allCountries.add(italy);
        allCountries.add(japan);
        allCountries.add(netherlands);
        allCountries.add(portugal);
        allCountries.add(spain);
        allCountries.add(usa);
        allCountries.add(unitedKingdom);

        return allCountries;
    }

    private static Country france = new Country("Frankreich", "Paris", 66836154, "\uD83C\uDDEB\uD83C\uDDF7");
    private static Country germany = new Country("Deutschland", "Berlin", 80722792, "\uD83C\uDDE9\uD83C\uDDEA");
    private static Country italy = new Country("Italien", "Rom", 62007540, "\uD83C\uDDEE\uD83C\uDDF9");
    private static Country japan = new Country("Japan", "Tokio", 126702133, "\uD83C\uDDEF\uD83C\uDDF5");
    private static Country netherlands = new Country("Niederlande", "Amsterdam", 17016967, "\uD83C\uDDF3\uD83C\uDDF1");
    private static Country portugal = new Country("Portugal", "Lissabon", 10833816, "\uD83C\uDDF5\uD83C\uDDF9");
    private static Country spain = new Country("Spanien", "Madrid", 48563476, "\uD83C\uDDEA\uD83C\uDDF8");
    private static Country unitedKingdom = new Country("Vereinigtes Königreich", "London", 64430428, "\uD83C\uDDEC\uD83C\uDDE7");
    private static Country usa = new Country("Vereinigte Staaten", "Washington", 323995528, "\uD83C\uDDFA\uD83C\uDDF8");
}