package com.rahulraghuwanshi.translator_kmm.core.domain.util

fun interface DisposableHandle : kotlinx.coroutines.DisposableHandle

// What does this function interface does?
// It's basically a quick way to do some like this :

// fun DisposableHandle(block: () -> Unit): DisposableHandle{
//     return object : kotlinx.coroutines.DisposableHandle{
//         override fun dispose() {
//             block()
//         }
//     }
// }