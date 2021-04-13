package tech.cuda.hsrl.common.card.mage.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Pyroblast_69905 : Card() {
    override val id = 69905
    override val name = "炎爆术"
    override val description = "造成 10点伤害。"
    override var cost: Int? = 10
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ClassicCards
    override val background = "抽到这张牌的时候，发出一阵邪恶的狂笑吧。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/84b581fcb41dba8849800ae5f9c6ccb5cd838bcdbd858ca0870d55b0d0e965b5.png"
}
