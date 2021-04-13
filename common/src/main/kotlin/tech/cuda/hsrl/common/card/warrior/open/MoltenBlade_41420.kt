package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MoltenBlade_41420 : Card() {
    override val id = 41420
    override val name = "熔岩之刃"
    override val description = "如果这张牌在你的手牌中，每个回合都会变成一张新的武器牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Ungoro
    override val background = "造型很酷，但是要怎么拿起来呢？"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/68e805abd146763d1372a5f9b06e34f5ff54fe37fb01c3ae34b6b40111e295d6.png"
}
