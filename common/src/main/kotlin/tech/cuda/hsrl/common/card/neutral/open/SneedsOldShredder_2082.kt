package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SneedsOldShredder_2082 : Card() {
    override val id = 2082
    override val name = "斯尼德的伐木机"
    override val description = "<b>亡语：</b>随机召唤一个<b>传说</b>随从。"
    override var cost: Int? = 8
    override var health: Int? = 7
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "当斯尼德在死亡矿井被击败后，他的伐木机在一次拍卖中被一位匿名买家收购。（可能是霍格。）"
    override val artist = "Christopher Moeller"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/01aafa44c965b73f90a1e09068cadda134d42a041e2a9fdcea7c27feedea3c76.png"
}
