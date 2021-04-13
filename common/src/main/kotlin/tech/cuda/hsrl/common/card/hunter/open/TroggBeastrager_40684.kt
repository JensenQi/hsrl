package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TroggBeastrager_40684 : Card() {
    override val id = 40684
    override val name = "穴居人驯兽师"
    override val description = "<b>战吼：</b>随机使你手牌中的一张野兽牌获得+1/+1。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Msog
    override val background = "加基森动物园因为性格问题拒绝了他的入职申请，对此他一直耿耿于怀。"
    override val artist = "Adam Byrne"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ce5ce2805f2c45969af9f153738df88e7dcf11efa92ba29b5e9c730cc3ee0119.png"
}
