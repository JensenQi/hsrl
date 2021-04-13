package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MechanicalWhelp_47924 : Card() {
    override val id = 47924
    override val name = "机械雏龙"
    override val description = "<b>亡语：</b>召唤一个7/7的机械巨龙。"
    override var cost: Int? = 6
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "既然它不是你造的，也不是我造的，那它妈是从哪里来的？"
    override val artist = "Jiajun Tian"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6a892a8cdeab203491ea764e8650c9b34710cbda450fb55d875f2e9294741e54.png"
}
