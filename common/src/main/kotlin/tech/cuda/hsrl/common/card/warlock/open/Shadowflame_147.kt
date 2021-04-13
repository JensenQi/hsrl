package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shadowflame_147 : Card() {
    override val id = 147
    override val name = "暗影烈焰"
    override val description = "消灭一个友方随从，对所有敌方随从造成等同于其攻击力的伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy3
    override val background = "始于一个强大的随从，终于一场华丽的浩劫。多么有趣！"
    override val artist = "Dave Kendall"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f0e8dc6f1e0ce19f1beb0b68e13e2715e0e407d33f782fe4b5f3c84ed13d3c6d.png"
}
