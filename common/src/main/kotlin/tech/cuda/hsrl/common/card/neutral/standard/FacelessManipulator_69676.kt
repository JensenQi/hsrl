package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FacelessManipulator_69676 : Card() {
    override val id = 69676
    override val name = "无面操纵者"
    override val description = "<b>战吼：</b>选择一个随从，成为它的复制。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "作为尤格萨隆的仆从，无面者们以人们的恐惧为食，而现在他们的菜谱中包括你对“不小心把好牌分解掉”的担心和忧虑。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/02cdd08cbb2d7b0bf152f111b609ebb27d9b2c899b2366dc33b4ff743aa0b13c.png"
}
