package com.rahulraghuwanshi.translator_kmm.translate.domain.translate

enum class TranslateError {
    SERVICE_UNAVAILABLE, // when we can't reach to the server.
    CLIENT_ERROR, // when client made a wrong request.
    SERVER_ERROR, // when server receive request but there is an issue from server side like crash etc.
    UNKNOWN_ERROR // when error is not identify.
}

// custom exception.
//class TranslateException(val error: TranslateError) : Exception(
//    message = "An error occurred when translating: $error"
//)
class TranslateException(val error: TranslateError) : Exception(
   "An error occurred when translating: $error"
)