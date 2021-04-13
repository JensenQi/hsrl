package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TwistingNether_69635 : Card() {
    override val id = 69635
    override val name = "扭曲虚空"
    override val description = "消灭所有随从。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Core
    override val background = "扭曲虚空浩渺无际，充满着魔法、幻象和被放逐的生命体。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c454bed4969b2acdab429b555d9e9ffda4002d58d4b3df8aef6bb5122b82f50d.png"
}
