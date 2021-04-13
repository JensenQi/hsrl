package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AncientWatcher_69826 : Card() {
    override val id = 69826
    override val name = "上古看守者"
    override val description = "无法攻击。"
    override var cost: Int? = 2
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "为什么在你走动的时候，会感觉它的眼珠也在跟着你动？"
    override val artist = "Richard Wright"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cf73d3457678f9c4ac8d75c40cee238d733bb36d1dfa08f41b6bcbc93244a5e0.png"
}
