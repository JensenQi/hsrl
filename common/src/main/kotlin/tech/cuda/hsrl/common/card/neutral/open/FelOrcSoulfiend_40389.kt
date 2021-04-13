package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FelOrcSoulfiend_40389 : Card() {
    override val id = 40389
    override val name = "邪兽人噬魂魔"
    override val description = "在你的回合开始时，对该随从造成2点 伤害。"
    override var cost: Int? = 3
    override var health: Int? = 7
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "医生说他的灵魂之所以这么灼热是因为溃疡。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cad9d034e7b907ae215e1898618d007a2af95614723b36d2717cf692d72b0f75.png"
}
