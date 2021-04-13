package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Meteor_41878 : Card() {
    override val id = 41878
    override val name = "陨石术"
    override val description = "对一个随从造成 15点伤害，并对其相邻的随从造成 3点伤害。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Ungoro
    override val background = "引导时请注意落点的选择。"
    override val artist = "Matt Gaser"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d3bfceec630b42b74ce2bc9042c5b3eafcc660b3754a66f38fbf1bf723994592.png"
}
