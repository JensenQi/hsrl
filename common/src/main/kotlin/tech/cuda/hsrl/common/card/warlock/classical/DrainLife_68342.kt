package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DrainLife_68342 : Card() {
    override val id = 68342
    override val name = "吸取生命"
    override val description = "造成 2点伤害，为你的英雄恢复 2点生命值。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "“我只是减少了你一年的寿命而已。”"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7875c554959e30e96165dae64db2f35129846324b2faa0fbbac14bbad30bca0d.png"
}
