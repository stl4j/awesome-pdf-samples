package com.github.stl4j.awesomepdf.samples;

import com.github.stl4j.awesomepdf.converter.PdfConverter;

public class PdfConverterSamples {

    public static void main(String[] args) throws Exception {
        PdfConverter.fromExcel("test.xlsx").toPDF();
    }

}
