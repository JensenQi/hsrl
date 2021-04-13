package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IronbeakOwl_69650 : Card() {
    override val id = 69650
    override val name = "铁喙猫头鹰"
    override val description = "<b>战吼：</b> <b>沉默</b>一个随从。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "它们挥动翅膀的时候悄无声息，但是它们的嘶鸣却是...任何悄无声息的反义词都可以形容。"
    override val artist = "Trevor Jacobs"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dc7f4fcc523159642ac4331ead01cbe6499b41d75a1744cd34613778058f20b0.png"
}
