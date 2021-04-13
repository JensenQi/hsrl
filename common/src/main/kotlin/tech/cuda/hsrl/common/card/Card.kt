package tech.cuda.hsrl.common.card

import tech.cuda.hsrl.common.enum.*

abstract class Card {
    abstract val id: Int
    abstract val name: String
    abstract val description: String
    abstract var cost: Int?
    abstract var health: Int?
    abstract var attack: Int?
    abstract val minionType: MinionType?
    abstract val type: CardType
    abstract val rarity: CardRarity
    abstract val cardSet: CardSet
    abstract val cardClass: CardClass
    
    abstract val isClassic: Boolean
    abstract val isStandard: Boolean

    abstract val background: String
    abstract val artist: String
    abstract val image: String
}
