package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GoldenScarab_54264 : Card() {
    override val id = 54264
    override val name = "金甲虫"
    override val description = "<b>战吼：发现</b>一张 法力值消耗为（4）的卡牌。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "射程远，威力大，就是不对空。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/84a321c6340b872965ccb5250c75184ead3ca23be902dcd859682976e3121a00.png"
}
