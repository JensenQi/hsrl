package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KezanMystic_2042 : Card() {
    override val id = 2042
    override val name = "科赞秘术师"
    override val description = "<b>战吼：</b>随机获得一个敌方<b>奥秘</b>的控制权。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "她们看上去很聪明，很有学问，但实际上，她们只是讨厌别人有秘密瞒着她们而已。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/32b26d1d449f68446112b46e9774cf617be7b3acd42b8d2983f9061d9bf5f83c.png"
}
