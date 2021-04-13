package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkestHour_51966 : Card() {
    override val id = 51966
    override val name = "至暗时刻"
    override val description = "消灭所有友方随从。每消灭一个随从，便随机从你的牌库中召唤一个随从。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.RiseOfShadows
    override val background = "最黑暗的时刻就是你开灯之前的时刻。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/53c74b76a9f139e5c18f631011ac4c2737b230557044f543ccc0258499937184.png"
}
