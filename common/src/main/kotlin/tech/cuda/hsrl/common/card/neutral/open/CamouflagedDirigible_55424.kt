package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CamouflagedDirigible_55424 : Card() {
    override val id = 55424
    override val name = "迷彩飞艇"
    override val description = "<b>战吼：</b>直到你的下个回合，使你的其他机械获得<b>潜行</b>。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "“你看那朵云像什么？” “忧郁。”"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c92ef2cb2ae0917106a392cc7d34a1244f931a4247a15b508f118cbd326bb98e.png"
}
