package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RagnarosTheFirelord_374 : Card() {
    override val id = 374
    override val name = "炎魔之王拉格纳罗斯"
    override val description = "无法攻击。在你的回合结束时，随机对一个敌人造成8点伤害。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy4
    override val background = "拉格纳罗斯是由黑铁矮人召唤出来的，而这些矮人最终也成为了炎魔之王的奴隶。所以召唤拉格纳罗斯往往得不到你想要的结果。"
    override val artist = "Greg Staples"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/33cda3c873c620d2e82742afbb36f80cf5c86381a161f756d3c527255317fe95.png"
}
