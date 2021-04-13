package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shadowform_69991 : Card() {
    override val id = 69991
    override val name = "暗影形态"
    override val description = "你的英雄技能变为“造成2点伤害”。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Core
    override val background = "当一道光亮照射在暗影牧师身上...他们的影子会投射在哪里？"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2a942671c6be4f042080667a3ca3b9401417aaa48b1ac7b4e40356a4fd7e27b2.png"
}
