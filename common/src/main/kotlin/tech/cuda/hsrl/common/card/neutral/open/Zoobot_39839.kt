package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Zoobot_39839 : Card() {
    override val id = 39839
    override val name = "机械动物管理员"
    override val description = "<b>战吼：</b>随机使一个友方野兽，龙和鱼人获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Karazhan
    override val background = "猜猜鱼人在哪里？<咔嚓>"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6c2e21b856a8d6d7059696f5b889de1c5abb7ba042bba26b14b41bc400c26d31.png"
}
