package com.rahulraghuwanshi.translator_kmm.translate.data.remote

import io.ktor.client.*

expect class HttpClientFactory {
    fun create(): HttpClient
}