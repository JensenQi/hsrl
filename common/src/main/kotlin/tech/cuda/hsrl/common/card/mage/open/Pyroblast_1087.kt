package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Pyroblast_1087 : Card() {
    override val id = 1087
    override val name = "炎爆术"
    override val description = "造成 10点伤害。"
    override var cost: Int? = 10
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Legacy3
    override val background = "抽到这张牌的时候，发出一阵邪恶的狂笑吧。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1ec607bbee6a679bd4f84786ec6fece63f54a3d59d6779de87ffab27b581bbb9.png"
}
