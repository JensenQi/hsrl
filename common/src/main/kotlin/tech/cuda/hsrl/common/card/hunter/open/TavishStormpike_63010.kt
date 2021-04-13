package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TavishStormpike_63010 : Card() {
    override val id = 63010
    override val name = "塔维什·雷矛"
    override val description = "在一只友方野兽攻击后，从你的牌库中召唤一只法力值消耗减少（1）点的野兽。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“快，宝贝儿！敌人数量太多了！到处都是蛇！它们看起来是有点萌，但那毕竟是凶猛的蛇！”——塔维什·雷矛"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/396072d5f5104dd3ce15e9a9836754b1b4f6d81158852224368fc4d0c2ed29ba.png"
}
