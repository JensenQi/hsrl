package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JadeBehemoth_40797 : Card() {
    override val id = 40797
    override val name = "青玉巨兽"
    override val description = "<b>嘲讽，战吼：</b>召唤一个 的<b>青玉魔像</b>。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Msog
    override val background = "如何为其称重，这是一个问题。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/df810f834573e59621273d84daae484cf8b5d7f5a6a659f579ccee770627d7af.png"
}
