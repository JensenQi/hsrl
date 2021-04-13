package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TwilightSummoner_38833 : Card() {
    override val id = 38833
    override val name = "暮光召唤师"
    override val description = "<b>亡语：</b>召唤一个5/5的无面破坏者。"
    override var cost: Int? = 4
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "如果你杀死他，他会变得更强，强到你无法想象。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6eea115a3f0468b9e445c07dbb2b47e449139e9cc4ba3221ddf94a11d5e4df21.png"
}
