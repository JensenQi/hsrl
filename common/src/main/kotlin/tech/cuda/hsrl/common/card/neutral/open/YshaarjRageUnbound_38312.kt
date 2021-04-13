package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class YshaarjRageUnbound_38312 : Card() {
    override val id = 38312
    override val name = "亚煞极"
    override val description = "在你的回合结束时，将一个随从从你的牌库置入战场。"
    override var cost: Int? = 10
    override var health: Int? = 10
    override var attack: Int? = 10
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "如果亚煞极没那么“怒发冲冠”时，它会扎个马尾辫做一些户外运动。"
    override val artist = "Samwise"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cbfc3313538847360d8b0d5a871fdd1e417e58c54b8d83d7ced06602f7dd7453.png"
}
