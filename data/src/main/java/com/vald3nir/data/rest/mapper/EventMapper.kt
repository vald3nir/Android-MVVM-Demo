package com.vald3nir.data.rest.mapper

import com.vald3nir.data.models.Event
import com.vald3nir.data.rest.model.EventResponseBody
import com.vald3nir.data.rest.model.ListEventsResponseBody
import java.text.SimpleDateFormat
import java.util.*


fun ListEventsResponseBody.toListEvents() =
    map {
        Event(
            eventID = it.id,
            description = it.description,
            title = it.title,
            price = it.price?.toFloat(),
            date = it.date?.toDate(),
            image = it.image,
            latitude = it.latitude?.toFloat(),
            longitude = it.longitude?.toFloat(),
        )
    }

fun EventResponseBody.toEvent() =
    Event(
        eventID = id,
        description = description,
        title = title,
        price = price?.toFloat(),
        date = date?.toDate(),
        image = image,
        latitude = latitude?.toFloat(),
        longitude = longitude?.toFloat(),
    )

fun Int.toDate(): String {
    val formatter = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
    val calendar = Calendar.getInstance()
    calendar.timeInMillis = this.toLong()
    return formatter.format(calendar.time)
}
