package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MurlocTidehunter_69557 : Card() {
    override val id = 69557
    override val name = "鱼人猎潮者"
    override val description = "<b>战吼：</b>召唤一个1/1的鱼人斥候。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "“死亡之潮升涌而起！”"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3318a0f019bf493c072c557c9dbca62aa81dc75649cd45f866176b70146c06ee.png"
}
