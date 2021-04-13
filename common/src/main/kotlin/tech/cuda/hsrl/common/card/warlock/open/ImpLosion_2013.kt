package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ImpLosion_2013 : Card() {
    override val id = 2013
    override val name = "小鬼爆破"
    override val description = "对一个随从造成 2- 4点伤害。每造成1点伤害，便召唤一个1/1的小鬼。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Gvg
    override val background = "榴散弹的弹片伤害远远超出爆炸本身，至于这些小鬼，他们可能是更加致命的弹片。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ed60aaf5019d40a5b9cf04e6833794148a6492e01c3be0d2568acd338e3bd6cb.png"
}
