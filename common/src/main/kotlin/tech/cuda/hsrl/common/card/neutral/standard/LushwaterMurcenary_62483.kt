package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LushwaterMurcenary_62483 : Card() {
    override val id = 62483
    override val name = "甜水鱼人佣兵"
    override val description = "<b>战吼：</b>如果你控制一个鱼人，便获得+1/+1。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "你不能因为对面的鱼多就去投靠它们！"
    override val artist = "Anzka Nguyen"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/31b91559efcf0d382bc24e9300a3267eef434e77e38142b0f4ccec2a50571756.png"
}
