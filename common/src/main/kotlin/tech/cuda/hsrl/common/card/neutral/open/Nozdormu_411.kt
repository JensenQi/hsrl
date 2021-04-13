package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Nozdormu_411 : Card() {
    override val id = 411
    override val name = "诺兹多姆"
    override val description = "所有玩家 只有15秒的时间来进行他们的回合。"
    override var cost: Int? = 9
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "没时间写什么卡牌趣文了。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d8066eccfc88baafcccd80d759fee1a900021e2c40be9e15119d2fc107961343.png"
}
