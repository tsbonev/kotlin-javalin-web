package com.tsbonev.web.adapter.web

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class PageReader{

    companion object {
        fun readPage(path: String): String{

            val relativePath = "src/main/java/com/tsbonev/web/adapter/web/"

            val suffix = ".html"

            val file = File(relativePath + path + suffix)
            val reader = BufferedReader(FileReader(file))

            val html = StringBuilder()

            var line: String? = ""

            do{
                html.append(line)
                line = reader.readLine()
            }while (line != null)

            reader.close()

            return html.toString()
        }

    }

}