package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Nozdormu_69976 : Card() {
    override val id = 69976
    override val name = "诺兹多姆"
    override val description = "所有玩家 只有15秒的时间来进行他们的回合。"
    override var cost: Int? = 9
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "没时间写什么卡牌趣文了。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/219e10ae012b0465195bd8ff6eb640452f03c8dc2b1f9f14f69a63a6eeea695b.png"
}
