package ec.edu.moster.modelo

import okhttp3.RequestBody
import okhttp3.MediaType
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserFactory
import java.io.StringReader
import java.math.BigDecimal
import java.math.RoundingMode

class ConversionModel {

    fun createSoapRequest(conversionType: String, value: String): RequestBody {
        val soapRequest = """
           <?xml version="1.0" encoding="UTF-8"?>
           <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.moster.edu.ec/">
              <soapenv:Header/>
              <soapenv:Body>
                 <ws:$conversionType>
                    <cm>$value</cm>
                 </ws:$conversionType>
              </soapenv:Body>
           </soapenv:Envelope>
       """.trimIndent()

        // Crear el RequestBody usando el método anterior
        return RequestBody.create(MediaType.parse("text/xml; charset=utf-8"), soapRequest)
    }

    fun parseSoapResponse(response: String): String {
        val factory = XmlPullParserFactory.newInstance()
        val parser = factory.newPullParser()
        parser.setInput(StringReader(response))

        var result = ""
        var eventType = parser.eventType
        while (eventType != XmlPullParser.END_DOCUMENT) {
            if (eventType == XmlPullParser.START_TAG && parser.name == "return") {
                parser.next()
                result = parser.text ?: ""
            }
            eventType = parser.next()
        }

        return try {
            val bigDecimalResult = BigDecimal(result).setScale(5, RoundingMode.HALF_UP)
            bigDecimalResult.stripTrailingZeros().toPlainString()
        } catch (e: NumberFormatException) {
            result
        }
    }
}
