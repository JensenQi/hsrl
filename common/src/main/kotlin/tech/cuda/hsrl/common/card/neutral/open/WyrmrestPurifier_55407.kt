package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WyrmrestPurifier_55407 : Card() {
    override val id = 55407
    override val name = "龙眠净化者"
    override val description = "<b>战吼：</b> 将你牌库中的所有中立卡牌随机变形成为你的职业的卡牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "她能让你的牌库保持专业水准。"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1cbec4a1fc33e49ea96dacc95461c4f2ac9817253cd583c6ec878c3d645cd4a0.png"
}
