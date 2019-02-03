package com.percival.bethany.wildlifeappusingmvvm.data

import com.google.gson.annotations.SerializedName

data class Kingdom(@SerializedName("KingdomName") val kingdomName: String,
                   @SerializedName("KingdomCommonName") val kingdomCommonName: String,
                   @SerializedName("ClassNamesUrl") val classNamesUrl: String)