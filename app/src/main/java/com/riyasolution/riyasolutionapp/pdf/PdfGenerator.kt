package com.riyasolution.riyasolutionapp.pdf

import android.content.Context
import com.itextpdf.html2pdf.HtmlConverter
import java.io.File
import java.io.FileOutputStream

object PdfGenerator {
    fun generatePdfFromHtml(context: Context, htmlContent: String, fileName: String): File {
        val outputDir = File(context.cacheDir, "pdfs")
        if (!outputDir.exists()) {
            outputDir.mkdirs()
        }
        val outputFile = File(outputDir, fileName)
        FileOutputStream(outputFile).use { outputStream ->
            HtmlConverter.convertToPdf(htmlContent, outputStream)
        }
        return outputFile
    }
}
