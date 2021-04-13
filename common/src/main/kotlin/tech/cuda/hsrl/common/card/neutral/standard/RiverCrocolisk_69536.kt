package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RiverCrocolisk_69536 : Card() {
    override val id = 69536
    override val name = "淡水鳄"
    override val description = ""
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "“左撇子”爱德华·史密斯曾经试着从一条淡水鳄的嘴里把行李夺回来。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e103bf5882882e4b45f8cd2a4893a6d78fb0d826c434d2fecf4f629664718073.png"
}
