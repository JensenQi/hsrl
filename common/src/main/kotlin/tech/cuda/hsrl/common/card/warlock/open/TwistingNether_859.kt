package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TwistingNether_859 : Card() {
    override val id = 859
    override val name = "扭曲虚空"
    override val description = "消灭所有随从。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy3
    override val background = "扭曲虚空浩渺无际，充满着魔法、幻象和被放逐的生命体。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/10d95aa897f2e8483f09a35b67b831bd4dcf9937693668875528eb48ce562554.png"
}
