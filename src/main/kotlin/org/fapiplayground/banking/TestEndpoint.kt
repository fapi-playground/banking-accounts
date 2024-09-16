package org.fapiplayground.banking

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestEndpoint {
    @GetMapping("/test")
    fun test(): ResponseEntity<TestResponse> {
        return ResponseEntity.ok(TestResponse(message = "Hello World!"))
    }

    data class TestResponse(
        val message: String,
    )
}