package com.example;

import java.io.ByteArrayOutputStream;
import java.nio.file.Files;
import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;
import java.io.File;

public class App 
{
    public static void main( String[] args ) throws java.io.IOException
    {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PdfRendererBuilder builder = new PdfRendererBuilder();
        builder.withHtmlContent("<body>Hello World!</body>", null);
        builder.toStream(os);
        builder.run();

        Files.write(new File("./test.pdf").toPath(), os.toByteArray());
        System.out.println( "Success! Yeah!" );
    }
}
