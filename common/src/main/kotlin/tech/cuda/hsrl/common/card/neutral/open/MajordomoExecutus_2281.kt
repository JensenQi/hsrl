package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MajordomoExecutus_2281 : Card() {
    override val id = 2281
    override val name = "管理者埃克索图斯"
    override val description = "<b>亡语：</b> 用炎魔之王拉格纳罗斯替换你的英雄。"
    override var cost: Int? = 9
    override var health: Int? = 7
    override var attack: Int? = 9
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Brm
    override val background = "你觉得是埃克索图斯把你变成了拉格纳罗斯，但其实，拉格纳罗斯就在你心中。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ab2384236d02791f689a0891a86db648208be6747fa068b943a92dbf37719a44.png"
}
