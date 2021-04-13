package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShipsCannon_2043 : Card() {
    override val id = 2043
    override val name = "船载火炮"
    override val description = "在你召唤一个海盗后，随机对一个敌人造成2点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "如果你听到有人喊道：“海盗船开炮了！”，那么就算你没有被炸死，也会被浑身弄湿。"
    override val artist = "Warren Mahy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ad5eda7a5fb1b084a090f0feed106d06e3983923b1f1bdd765c5ba2f80aef8c6.png"
}
