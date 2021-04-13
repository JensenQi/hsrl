package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shadowflame_69914 : Card() {
    override val id = 69914
    override val name = "暗影烈焰"
    override val description = "消灭一个友方随从，对所有敌方随从造成等同于其攻击力的伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "始于一个强大的随从，终于一场华丽的浩劫。多么有趣！"
    override val artist = "Dave Kendall"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/91e2cef631fa4a459f838c30a56213e003b4f0bed307e20d4d87febd180c201c.png"
}
