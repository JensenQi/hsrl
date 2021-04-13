package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Hailbringer_56118 : Card() {
    override val id = 56118
    override val name = "冰雹使者"
    override val description = "<b>战吼：</b>召唤两个1/1的可以<b>冻结</b>攻击目标的寒冰碎片。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "通晓各种迎冰待客之礼。"
    override val artist = "Max Grecke"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/22c8b9f3d1ff020258aadafc9158b8f233b56c5454c77a65e431859d23034ae3.png"
}
