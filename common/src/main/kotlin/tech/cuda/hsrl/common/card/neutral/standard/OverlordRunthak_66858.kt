package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OverlordRunthak_66858 : Card() {
    override val id = 66858
    override val name = "伦萨克大王"
    override val description = "<b>突袭</b> 每当该随从攻击时，使你手牌中的所有随从牌获得+1/+1。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "扶助每一个盟友，痛击每一个对手。"
    override val artist = "Trent Kaniuga"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2aa30a6b7b0f86ae32c9469c80405378a971d47169bdc593f1c5cde89cd5dea0.png"
}
