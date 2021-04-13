package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LearnDraconic_55281 : Card() {
    override val id = 55281
    override val name = "学习龙语"
    override val description = "<b>支线任务：</b> 消耗8点法力值用于法术牌上。<b>奖励：</b>召唤一条6/6的龙。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.DescentOfDragons
    override val background = "直到拿起初阶法术教材，雷诺才意识到自己不会龙语。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ca524de15e0e17e03b7eb6e011aa196993feca46b83fd90952da45c8f00a09f1.png"
}
