package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IceWalker_42716 : Card() {
    override val id = 42716
    override val name = "寒冰行者"
    override val description = "你的英雄技能还会 <b>冻结</b>目标。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Kotf
    override val background = "你管他叫行者？他连个脚都没有！"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d6805eb46010bc4306bba0813c313e6e6fbc4ba797ab0d2096eefd026ba7799b.png"
}
