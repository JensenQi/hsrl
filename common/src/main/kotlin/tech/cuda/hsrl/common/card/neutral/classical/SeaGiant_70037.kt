package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SeaGiant_70037 : Card() {
    override val id = 70037
    override val name = "海巨人"
    override val description = "战场上每有一个其他随从，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 10
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "嗨，巨人！"
    override val artist = "Svetlin Velinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bf62493b8bbf6811287502df3da90a3efa909c8f8f6cc295570110391c3d617c.png"
}
