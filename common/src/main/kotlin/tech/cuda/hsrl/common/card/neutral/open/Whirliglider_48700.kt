package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Whirliglider_48700 : Card() {
    override val id = 48700
    override val name = "旋翼滑翔者"
    override val description = "<b>战吼：</b>召唤一个0/2的地精炸弹。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "希望她能平安抵达投弹点。"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8fce412cae4421adf83e6bed738b91365cf359c984e5d7b159e84443d5539d09.png"
}
