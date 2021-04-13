package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ElementalEvocation_50120 : Card() {
    override val id = 50120
    override val name = "元素唤醒"
    override val description = "在本回合中，你使用的下一张元素牌的法力值消耗减少（2）点。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.RastakhansRumble
    override val background = "诀窍就是用打火机油。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/392c90249ea4a58aeb08e91ce67df15ee8542b2b6a07d1531a6ff3372bc2c57e.png"
}
