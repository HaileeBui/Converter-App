package com.example.asus.converterapp;

public class Converter {// used to convert all the units with different methods

    public static double convertLengthUnits (double inserted, String fromUnit, String toUnit) {

        double result = 0.0; //will hold result value

        String fU = fromUnit.toLowerCase();
        String tU = toUnit.toLowerCase();

        switch(fU) {
            case "millimetre": { //first spinner selected as millimetre
                switch(tU) { //second spinner selections
                    case "millimetre": result = inserted; break;
                    case "centimetre": result = inserted * 0.1d; break;
                    case "metre": result = inserted * 0.001d; break;
                    case "kilometre": result = inserted * 0.000001d; break;
                    case "mile": result = inserted * 0.0000006213712d; break;
                    case "feet": result = inserted * 0.00328084d; break;
                    case "yard": result = inserted * 0.0010936133333d; break;
                }
                break;
            }
            case "centimetre": {
                switch(tU) {
                    case "millimetre": result = inserted * 0.1d; break;
                    case "centimetre": result = inserted; break;
                    case "metre": result = inserted * 0.1d; break;
                    case "kilometre": result = inserted * 0.00001d; break;
                    case "mile": result = inserted * 0.000006213712d; break;
                    case "feet": result = inserted * 0.0328084d; break;
                    case "yard": result = inserted * 0.01093613d; break;
                }
                break;
            }
            case "metre": {
                switch(tU) {
                    case "millimetre": result = inserted * 1000d; break;
                    case "centimetre": result = inserted * 100d; break;
                    case "metre": result = inserted; break;
                    case "kilometre": result = inserted * 0.001d; break;
                    case "mile": result = inserted * 0.0006213712d; break;
                    case "feet": result = inserted * 3.28084d; break;
                    case "yard": result = inserted * 1.093613d; break;
                }
                break;
            }
            case "kilometre": {
                switch(tU){
                    case "millimetre": result = inserted * 1000000d; break;
                    case "centimetre": result = inserted * 100000d; break;
                    case "metre": result = inserted * 1000d; break;
                    case "kilometre": result = inserted; break;
                    case "mile": result = inserted * 0.6213712d; break;
                    case "feet": result = inserted * 3280.84d; break;
                    case "yard": result = inserted * 1093.613d; break;
                }
                break;
            }
            case "mile": {
                switch(tU) {
                    case "millimetre": result = inserted * 1609344d; break;
                    case "centimetre": result = inserted * 160934.4d; break;
                    case "metre": result = inserted * 1609.344d; break;
                    case "kilometre": result = inserted * 1.609344d; break;
                    case "mile": result = inserted; break;
                    case "feet": result = inserted * 5280d; break;
                    case "yard": result = inserted * 1760d; break;
                }
                break;
            }
            case "feet": {
                switch(tU) {
                    case "millimetre": result = inserted * 304.8d; break;
                    case "centimetre": result = inserted * 30.48d; break;
                    case "metre": result = inserted * 0.3048d; break;
                    case "kilometre": result = inserted * 0.0003048d; break;
                    case "mile": result = inserted * 0.0001893939d; break;
                    case "feet": result = inserted; break;
                    case "yard": result = inserted * 0.3333333d; break;
                }
                break;
            }
            case "yard": {
                switch(tU) {
                    case "millimetre": result = inserted * 914.4d; break;
                    case "centimetre": result = inserted * 91.44d; break;
                    case "metre": result = inserted * 0.9144d; break;
                    case "kilometre": result = inserted * 0.0009144d; break;
                    case "mile": result = inserted * 0.0005681818d; break;
                    case "feet": result = inserted * 3d; break;
                    case "yard": result = inserted; break;
                }
                break;
            }
        }

        return result;
    }

    public static double convertSpeedUnits(double inserted, String fromUnit, String toUnit) {

        double result = 0.0; //will hold result value

        String fU = fromUnit.toLowerCase();
        String tU = toUnit.toLowerCase();

        switch (fU) {
            case "m/s": { //first spinner selected as millimetre
                switch (tU) { //second spinner selections
                    case "m/s":
                        result = inserted;
                        break;
                    case "ft/s":
                        result = inserted * 3.28084d;
                        break;
                    case "mi/h":
                        result = inserted * 2.236936d;
                        break;
                    case "km/h":
                        result = inserted * 3.6d;
                        break;
                }
                break;
            }
            case "ft/s": {
                switch (tU) {
                    case "m/s":
                        result = inserted * 0.3048d;
                        break;
                    case "ft/s":
                        result = inserted;
                        break;
                    case "mi/h":
                        result = inserted * 0.6818182d;
                        break;
                    case "km/h":
                        result = inserted * 1.097280033d;
                        break;
                }
                break;
            }

            case "mi/h": {
                switch (tU) {
                    case "m/s":
                        result = inserted * 0.447040013456d;
                        break;
                    case "ft/s":
                        result = inserted * 1.466667d;
                        break;
                    case "mi/h":
                        result = inserted;
                        break;
                    case "km/h":
                        result = inserted * 1.60934432d;
                        break;
                }
                break;
            }
            case "km/h": {
                switch (tU) {
                    case "m/s":
                        result = inserted * 0.2777778d;
                        break;
                    case "ft/s":
                        result = inserted * 0.9113444d;
                        break;
                    case "mi/h":
                        result = inserted * 0.6213712d;
                        break;
                    case "km/h":
                        result = inserted;
                        break;
                }
                break;
            }
        }
        return result;
    }

    public static double convertTemperatureUnits(double inserted, String fromUnit, String toUnit) {

        double result = 0.0; //will hold result value

        String fU = fromUnit.toLowerCase();
        String tU = toUnit.toLowerCase();

        switch (fU) {
            case "celsius": { //first spinner selected as millimetre
                switch (tU) { //second spinner selections
                    case "celsius":
                        result = inserted;
                        break;
                    case "fahrenheit":
                        result = inserted * 1.8d + 32;
                        break;
                    case "kelvin":
                        result = inserted + 273.15d;
                        break;
                }
                break;
            }
            case "fahrenheit": {
                switch (tU) { //second spinner selections
                    case "celsius":
                        result = (inserted - 32) * 5 / 9;
                        break;
                    case "fahrenheit":
                        result = inserted;
                        break;
                    case "kelvin":
                        result = (inserted + 459.67) * 5 / 9;
                        break;
                }
                break;
            }
            case "kelvin": {
                switch (tU) { //second spinner selections
                    case "celsius":
                        result = inserted - 273.15d;
                        break;
                    case "fahrenheit":
                        result = 9 / 5 * (inserted - 273) + 32;
                        break;
                    case "kelvin":
                        result = inserted;
                        break;
                }
                break;
            }
        }
        return result;
    }

    public static double convertVolumeUnits(double inserted, String fromUnit, String toUnit) {

        double result = 0.0; //will hold result value

        String fU = fromUnit.toLowerCase();
        String tU = toUnit.toLowerCase();

        switch (fU) {
            case "millilitre": { //first spinner selected as millimetre
                switch (tU) { //second spinner selections
                    case "millilitre":
                        result = inserted;
                        break;
                    case "litre":
                        result = inserted * 0.001d;
                        break;
                    case "gallon (us)":
                        result = inserted * 0.0002641729d;
                        break;
                    case "fluid ounce (imperial)":
                        result = inserted * 0.03519503d;
                        break;
                    case "fluid ounce (us)":
                        result = inserted * 0.03381413d;
                        break;
                }
                break;
            }
            case "litre": {
                switch (tU) { //second spinner selections
                    case "millilitre":
                        result = inserted * 1000d;
                        break;
                    case "litre":
                        result = inserted;
                        break;
                    case "gallon (us)":
                        result = inserted * 0.2641729d;
                        break;
                    case "fluid ounce (imperial)":
                        result = inserted * 35.19503d;
                        break;
                    case "fluid ounce (us)":
                        result = inserted * 33.81413d;
                        break;
                }
                break;
            }
            case "gallon (us)": {
                switch (tU) { //second spinner selections
                    case "millilitre":
                        result = inserted * 3785.4d;
                        break;
                    case "litre":
                        result = inserted * 3.7854d;
                        break;
                    case "gallon (us)":
                        result = inserted;
                        break;
                    case "fluid ounce (imperial)":
                        result = inserted * 133.2273d;
                        break;
                    case "fluid ounce (us)":
                        result = inserted * 128.000026d;
                        break;
                }
                break;
            }
            case "fluid ounce (imperial)": {
                switch (tU) { //second spinner selections
                    case "millilitre":
                        result = inserted * 28.4131d;
                        break;
                    case "litre":
                        result = inserted * 0.0284131d;
                        break;
                    case "gallon (us)":
                        result = inserted * 0.00750597d;
                        break;
                    case "fluid ounce (imperial)":
                        result = inserted;
                        break;
                    case "fluid ounce (us)":
                        result = inserted * 0.9607642d;
                        break;
                }
                break;
            }
            case "fluid ounce (us)": {
                switch (tU) { //second spinner selections
                    case "millilitre":
                        result = inserted * 29.57344d;
                        break;
                    case "litre":
                        result = inserted * 0.02957344d;
                        break;
                    case "gallon (us)":
                        result = inserted * 0.0078125d;
                        break;
                    case "fluid ounce (imperial)":
                        result = inserted * 1.040838d;
                        break;
                    case "fluid ounce (us)":
                        result = inserted;
                        break;
                }
                break;
            }
        }
        return result;
    }

}
