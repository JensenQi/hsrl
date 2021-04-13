package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GeosculptorYip_46442 : Card() {
    override val id = 46442
    override val name = "地塑师伊普"
    override val description = "在你的回合结束时，随机召唤一个法力值消耗等同于你的护甲值<i>（最高不超过10点）</i>的随从。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "曾经用耳屎和强大的野心制造出一对手套。"
    override val artist = "Mike Azevedo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b3858aef1a27249a7adf4ed552e06dc5eb1211fd4c6f4c3fde2a05588287d5a8.png"
}
