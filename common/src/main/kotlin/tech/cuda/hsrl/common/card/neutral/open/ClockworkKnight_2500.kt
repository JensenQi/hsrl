package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ClockworkKnight_2500 : Card() {
    override val id = 2500
    override val name = "发条骑士"
    override val description = "<b>战吼：</b>使一个友方机械获得+1/+1。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "要让他活蹦乱跳，得拧上好久的发条。"
    override val artist = "Skan Srisuwan"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d5d3a397d6f8601b633c75320771cc8b9c0daedf8f887b8f9d7e3c30207b4c9b.png"
}
