package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Darkspeaker_38436 : Card() {
    override val id = 38436
    override val name = "黑暗低语者"
    override val description = "<b>战吼：</b>与另一个友方随从交换属性值。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "即便是上古之神也会有休息的片刻，这时候就轮到黑暗低语者来继续向艾泽拉斯的生灵们循环播放恼人的低语了。"
    override val artist = "Phroilan Gardner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a2d72fe95e8e13b8061d04df70e351f437e0fb4eef74188658f31d3f1c2de8cc.png"
}
