package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheForestsAid_52819 : Card() {
    override val id = 52819
    override val name = "森林的援助"
    override val description = "<b>双生法术</b> 召唤五个2/2的 树人。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.RiseOfShadows
    override val background = "来自深山老林的纯天然野生援助。"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c7a9f8aedf3572f4e7adf33ee951b79c885bafbe51c1fb18c879565fab0c7063.png"
}
