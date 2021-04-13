package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RustyRecycler_47888 : Card() {
    override val id = 47888
    override val name = "生锈的回收机器人"
    override val description = "<b>嘲讽，吸血</b>"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "他有只蟑螂小伙伴，还有个会飞的女朋友。"
    override val artist = "Sean McNally"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1404fade238541caf931aab0744bed77c7f119196b16038b6e36b8e05b1c8360.png"
}
