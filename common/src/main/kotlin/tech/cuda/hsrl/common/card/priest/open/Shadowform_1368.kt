package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shadowform_1368 : Card() {
    override val id = 1368
    override val name = "暗影形态"
    override val description = "你的英雄技能变为“造成2点伤害”。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy3
    override val background = "当一道光亮照射在暗影牧师身上...他们的影子会投射在哪里？"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7fcf59589be3326eac0c32157cc3da1daa3e671df0d8f76930f5a0e644f1374a.png"
}
