package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnidentifiedContract_51827 : Card() {
    override val id = 51827
    override val name = "未鉴定的合约"
    override val description = "消灭一个随从。在你手牌中时获得额外效果。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.RiseOfShadows
    override val background = "甲方的需求总是不断在变。"
    override val artist = "Akkapoj T."
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/44af70bd9e87e2bd73b4564d2ac4019fd3d40dea31629abdfdd6a8cac54a1951.png"
}
