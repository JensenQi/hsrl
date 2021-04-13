package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FeralGibberer_45547 : Card() {
    override val id = 45547
    override val name = "凶猛的聒噪怪"
    override val description = "在该随从攻击一方英雄后，将一张它的复制置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "肯定不是有文化的聒噪怪。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bab1b80443a545109c4c4a25ab2fd6bd7da364f3b5797d7ff7a68af5d39d6ebb.png"
}
