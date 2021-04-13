package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MogorsChampion_2491 : Card() {
    override val id = 2491
    override val name = "穆戈尔的勇士"
    override val description = "50%几率攻击错误的敌人。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "这位勇士师从高人，唯一没学好的就是如何选择目标。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6bead9dd85e04d55ad3c512896e6cb72010890be877a46dbd061af0041654b0b.png"
}
