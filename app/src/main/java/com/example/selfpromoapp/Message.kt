package com.example.selfpromoapp

import java.io.Serializable

data class Message(
    //parameters, the things that we want to passing in
    val contactName: String,
    val contactNumber: String,
    val myDisplayName: String,
    val includeJunior: Boolean,
    val jobTitle: String?,
    val immediateStart: Boolean,
    val startDate: String?
) : Serializable {

    fun getFullJobDescription() = if(includeJunior) "a Junior $jobTitle" else "an $jobTitle"

    fun getAvailability() = if (immediateStart) "immediately" else "from $startDate"
}
