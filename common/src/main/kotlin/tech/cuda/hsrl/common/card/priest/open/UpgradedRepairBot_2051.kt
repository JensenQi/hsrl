package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UpgradedRepairBot_2051 : Card() {
    override val id = 2051
    override val name = "高级修理机器人"
    override val description = "<b>战吼：</b>使一个友方机械获得+4生命值。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Gvg
    override val background = "其实他和旧的型号没有任何不同，但是在被贴上了“高级”标签之后，他的售价就能翻一倍。"
    override val artist = "Nutchapol Thitinunthakorn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5e176b4aaf84a811305332ae7bcbbfc2883ed84683123d08b198c32b342c5939.png"
}
