package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PrinceKeleseth_45340 : Card() {
    override val id = 45340
    override val name = "凯雷塞斯王子"
    override val description = "<b>战吼：</b>如果你的牌库里没有法力值消耗为（2）的牌，则你的牌库里所有随从牌获得+1/+1。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "三个王子站在一起，一个想要支援兄弟。"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e57b5ec975c7a0b7db9d4dfc5762e3f8ba350864d904c9f31c25b0a5b135875e.png"
}
