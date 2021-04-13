package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IronbeakOwl_69762 : Card() {
    override val id = 69762
    override val name = "铁喙猫头鹰"
    override val description = "<b>战吼：</b> <b>沉默</b>一个随从。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "它们挥动翅膀的时候悄无声息，但是它们的嘶鸣却是...任何悄无声息的反义词都可以形容。"
    override val artist = "Trevor Jacobs"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/53fe3cdebdc5d220c23c2b2d6e5db37cc529d8fa64da30f9fa6c482355ccbdcc.png"
}
