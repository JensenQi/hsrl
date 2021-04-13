package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneWatcher_52654 : Card() {
    override val id = 52654
    override val name = "奥术守望者"
    override val description = "除非你拥有<b>法术伤害</b>， 否则无法进行攻击。"
    override var cost: Int? = 3
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "他的守望已然结束……除非你拥有法术伤害。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e56e341a1f7b754a323fb5b2189063d6d42bf17e3b9921d5d00ec18ee4947f48.png"
}
