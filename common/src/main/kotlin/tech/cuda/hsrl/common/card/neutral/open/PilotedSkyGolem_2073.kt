package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PilotedSkyGolem_2073 : Card() {
    override val id = 2073
    override val name = "载人飞天魔像"
    override val description = "<b>亡语：</b>随机召唤一个法力值消耗为（4）的随从。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "地精科技的巅峰之作。魔像内装饰豪华，配备速溶咖啡机以及足浴按摩器。"
    override val artist = "Michael Phillippi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4213d6fafb8bb6cd76a829ea42c12210514718e4915469830cdd7b6cf52e1da5.png"
}
