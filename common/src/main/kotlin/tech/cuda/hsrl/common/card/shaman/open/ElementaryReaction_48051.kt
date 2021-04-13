package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ElementaryReaction_48051 : Card() {
    override val id = 48051
    override val name = "元素反应"
    override val description = "抽一张牌。如果你在上个回合使用过元素牌，则复制抽到的牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.BoomsdayProject
    override val background = "哎哟我这暴脾气。"
    override val artist = "Wayne Wu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/488de6d629288e27cf1a53e0aecb1d433d5c01d9ec6c04db77a492c4a93a9c36.png"
}
