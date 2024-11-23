package ec.edu.moster.servicios

import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface SoapService {

    @POST("WS_CONVUNI_SOAPJAVA/WSConvUni")
    @Headers("Content-Type: text/xml;charset=UTF-8")
    fun cmAM(@Body requestBody: RequestBody): Call<String>

    @POST("WS_CONVUNI_SOAPJAVA/WSConvUni")
    @Headers("Content-Type: text/xml;charset=UTF-8")
    fun cmAMm(@Body requestBody: RequestBody): Call<String>

    @POST("WS_CONVUNI_SOAPJAVA/WSConvUni")
    @Headers("Content-Type: text/xml;charset=UTF-8")
    fun cmAKm(@Body requestBody: RequestBody): Call<String>

    @POST("WS_CONVUNI_SOAPJAVA/WSConvUni")
    @Headers("Content-Type: text/xml;charset=UTF-8")
    fun cmAPies(@Body requestBody: RequestBody): Call<String>

    @POST("WS_CONVUNI_SOAPJAVA/WSConvUni")
    @Headers("Content-Type: text/xml;charset=UTF-8")
    fun cmAPulgadas(@Body requestBody: RequestBody): Call<String>

    @POST("WS_CONVUNI_SOAPJAVA/WSConvUni")
    @Headers("Content-Type: text/xml;charset=UTF-8")
    fun cmAYardas(@Body requestBody: RequestBody): Call<String>
}
