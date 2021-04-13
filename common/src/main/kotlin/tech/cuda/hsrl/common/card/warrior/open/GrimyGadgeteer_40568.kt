package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrimyGadgeteer_40568 : Card() {
    override val id = 40568
    override val name = "污手玩具商"
    override val description = "在你的回合结束时，随机使你手牌中的一张随从牌获得+2/+2。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Msog
    override val background = "谁说玩具枪不能捅死人的，戳你试试！"
    override val artist = "Wayne Reynolds"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cd3a7e7daa00c4f846e40a3d5d05ff8a592079404f72f3fa0c7c60daa376b71f.png"
}
