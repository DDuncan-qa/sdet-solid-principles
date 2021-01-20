package com.qa.isp;

public class Converter implements CsvToExcelConverter, ExcelToCsvConverter {

    @Override
    public Csv ExcelToCsv() {
        Csv toConvert = new Csv();
        // CSV -> Excel conversion logic
        return toConvert;
    }

    @Override
    public Excel CsvToExcel() {
        Excel toConvert = new Excel();
        /// Excel -> CSV conversion logic
        return toConvert;
    }
}