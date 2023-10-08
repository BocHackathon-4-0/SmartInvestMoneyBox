package boc.hackathon.kubaras.data

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import retrofit2.Retrofit
import retrofit2.http.GET

val retrofit: Retrofit = Retrofit.Builder()
    .baseUrl("http://localhost:8080/")
    .addConverterFactory(Json.asConverterFactory(MediaType.get("application/json")))
    .build()


var service: TransactionServiceApi = retrofit.create(TransactionServiceApi::class.java)


interface TransactionServiceApi {
    @GET("account/savingbox")
    suspend fun listRepos(): TransactionData
}