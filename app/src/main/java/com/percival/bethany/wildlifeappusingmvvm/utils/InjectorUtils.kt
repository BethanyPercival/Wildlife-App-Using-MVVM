package com.percival.bethany.wildlifeappusingmvvm.utils

import com.percival.bethany.wildlif.KingdomViewModelFactory
import com.percival.bethany.wildlifeappusingmvvm.data.FakeDatabase
import com.percival.bethany.wildlifeappusingmvvm.data.KingdomRepository

object InjectorUtils {
    fun provideKingdomsViewModelFactory(): KingdomViewModelFactory {
        val kingdomRepository = KingdomRepository.getInstance(FakeDatabase.getInstance().kingdomDao)
        return KingdomViewModelFactory(kingdomRepository)
    }
}