package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MurlocTidehunter_68468 : Card() {
    override val id = 68468
    override val name = "鱼人猎潮者"
    override val description = "<b>战吼：</b>召唤一个1/1的鱼人斥候。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "“死亡之潮升涌而起！”"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5623a0e23c8e49a7f86012f5fd134d46f2ffa75566dcf2de9eb860e31cd901e6.png"
}
