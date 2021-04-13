package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class YoungDragonhawk_69759 : Card() {
    override val id = 69759
    override val name = "幼龙鹰"
    override val description = "<b>风怒</b>"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "无论是战士还是诗人，都能从美丽的龙鹰身上获取战斗或是写作的灵感。"
    override val artist = "Greg Hildebrandt"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/19d31388278fac2c8e68a1f3064bac641940b69152d72cff47d8c5f73453f0b0.png"
}
