package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CthunTheShattered_61503 : Card() {
    override val id = 61503
    override val name = "克苏恩，破碎之劫"
    override val description = "<b>对战开始时：</b>破碎成片。<b>战吼：</b>造成30点伤害，随机分配到所有敌人身上。"
    override var cost: Int? = 10
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "我抽到的是，被封印的黑暗大古神！"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7d35e9bb77773bd03b7eacf9db4f98ab97b1c9117832b73ea07d931815f3d189.png"
}
