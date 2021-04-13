package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TwistingNether_69918 : Card() {
    override val id = 69918
    override val name = "扭曲虚空"
    override val description = "消灭所有随从。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "扭曲虚空浩渺无际，充满着魔法、幻象和被放逐的生命体。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1e431e97d6eba5175addbe936f223fca2d5f93e674a73e78510b37d4252f5e80.png"
}
