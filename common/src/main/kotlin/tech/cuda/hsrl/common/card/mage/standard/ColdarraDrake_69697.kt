package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ColdarraDrake_69697 : Card() {
    override val id = 69697
    override val name = "考达拉幼龙"
    override val description = "你可以使用任意次数的英雄技能。"
    override var cost: Int? = 6
    override var health: Int? = 7
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Core
    override val background = "其实本次大赛明令禁止龙型生物参加，但是没几个人敢去劝阻。"
    override val artist = "Christopher Moeller"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a0b7c625009fc3352b07a33e679a4ded1b514e335b3e7080143b5843525d276c.png"
}
