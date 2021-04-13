package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TwilightGeomancer_38864 : Card() {
    override val id = 38864
    override val name = "暮光地卜师"
    override val description = "<b>嘲讽</b>，<b>战吼：</b>使你的克苏恩获得<b>嘲讽</b><i>（无论它在哪里）。</i>"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "那里有块风水宝地，用来召唤克苏恩真是再合适不过了。"
    override val artist = "Eric Braddock"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dc7d23068902922cd9a64bf8415e407065f15e21efa6705032ff9958ef26cd00.png"
}
