package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RiverCrocolisk_68381 : Card() {
    override val id = 68381
    override val name = "淡水鳄"
    override val description = ""
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "“左撇子”爱德华·史密斯曾经试着从一条淡水鳄的嘴里把行李夺回来。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d57543325c257fcbec4f15969cdc9262699547dacf0841964bcf82c44f2059f7.png"
}
