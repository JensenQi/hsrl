package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RagnarosTheFirelord_69912 : Card() {
    override val id = 69912
    override val name = "炎魔之王拉格纳罗斯"
    override val description = "无法攻击。在你的回合结束时，随机对一个敌人造成8点伤害。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "拉格纳罗斯是由黑铁矮人召唤出来的，而这些矮人最终也成为了炎魔之王的奴隶。所以召唤拉格纳罗斯往往得不到你想要的结果。"
    override val artist = "Greg Staples"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bef0ba5dead1314c6fd2d0fce94978c5ca7aba57e470eda475017f7368287bca.png"
}
