package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TargetDummy_2061 : Card() {
    override val id = 2061
    override val name = "活动假人"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = null
    override var health: Int? = 2
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "它被许多工程师认为是工程学造福艾泽拉斯冒险者的起点。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c0d18f0b3f5c63fe673c098fc206f03bcb4305cc40266ac931a5e71ad8e6057d.png"
}
