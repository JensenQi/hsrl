package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ImpGangBoss_2288 : Card() {
    override val id = 2288
    override val name = "小鬼首领"
    override val description = "每当该随从受到伤害，召唤一个1/1的 小鬼。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Brm
    override val background = "每到夜深人静，他就会带着一群小鬼潜入暴风城，在法师塔的墙上到处涂鸦，比如写上一些“拉格纳罗斯最厉害！”之类的标语。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/79718cb7af1cf64a07f2820194479cffa88cc0801a8b0eebc07fa6d4236e30b9.png"
}
