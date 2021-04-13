package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GildedGargoyle_46495 : Card() {
    override val id = 46495
    override val name = "镀金的石像鬼"
    override val description = "<b>亡语：</b>将一个幸运币置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "你听到石像鬼身体里有硬币的叮当声……这意味着什么？"
    override val artist = "E. M. Gist"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1cdc327adef42b2a7df12824ae7de49094014f94a8e113e1b53c57faedd5c598.png"
}
