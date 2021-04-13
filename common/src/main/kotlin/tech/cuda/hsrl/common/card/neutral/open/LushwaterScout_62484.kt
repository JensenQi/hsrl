package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LushwaterScout_62484 : Card() {
    override val id = 62484
    override val name = "甜水鱼人斥候"
    override val description = "在你召唤一个鱼人后，使其获得+1攻击力和<b>突袭</b>。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "只会吹两首曲子：《小螺号》和《小腥腥》。"
    override val artist = "Ishmael Hoover"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/036d51299555f355e74bb7e37ff780709e319ea89ca11a36fd5d68ee08cd5978.png"
}
