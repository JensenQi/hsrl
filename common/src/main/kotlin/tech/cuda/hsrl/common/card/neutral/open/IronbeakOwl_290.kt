package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IronbeakOwl_290 : Card() {
    override val id = 290
    override val name = "铁喙猫头鹰"
    override val description = "<b>战吼：</b> <b>沉默</b>一个随从。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "它们挥动翅膀的时候悄无声息，但是它们的嘶鸣却是...任何悄无声息的反义词都可以形容。"
    override val artist = "Trevor Jacobs"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/050cff3821b3b7aadc3be0f191d34921a9008aed93ed09653c137a086eaf6b1a.png"
}
