package com.vald3nir.data.rest.interfaces

import com.vald3nir.data.rest.model.CheckInRequestBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface CheckInService {

    @POST("checkin")
    suspend fun makeCheckIn(@Body requestBody: CheckInRequestBody): Response<Void>


}