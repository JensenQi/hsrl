package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MimironsHead_2079 : Card() {
    override val id = 2079
    override val name = "米米尔隆的头部"
    override val description = "在你的回合开始时，如果你控制至少三个机械，则消灭这些机械，并将其组合成V-07-TR-0N。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "别按那个最大的红色按钮！"
    override val artist = "Trent Kaniuga"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d3258b59dc8918805a036e6f8ae9827b236e6ce298c85b759bacf15b3c3c95fc.png"
}
