package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SweepingStrikes_51737 : Card() {
    override val id = 51737
    override val name = "横扫攻击"
    override val description = "使一个随从获得 “同时对其攻击目标相邻的随从造成伤害。”"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.RiseOfShadows
    override val background = "一扫倾人树，再扫倾人城。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/99b35b6ed0d499f68816fd3f04cdddc4bbf575b8e8c83cdf5c3e1e62261fa044.png"
}
