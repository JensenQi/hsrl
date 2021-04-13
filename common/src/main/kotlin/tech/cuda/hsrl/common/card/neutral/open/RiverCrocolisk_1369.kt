package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RiverCrocolisk_1369 : Card() {
    override val id = 1369
    override val name = "淡水鳄"
    override val description = ""
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "“左撇子”爱德华·史密斯曾经试着从一条淡水鳄的嘴里把行李夺回来。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/870484b444d5a3d2f3445e9c3c9cda189c2b3a35ba8dca13baac9445721a6cbe.png"
}
