package API

import java.util.UUID

class LoginAPI {
    fun validateUser(username: String, password: String): String? {
        return if (password == "admin" && username == "admin"){
            UUID.randomUUID().toString()
        } else {
            null
        }
    }
}