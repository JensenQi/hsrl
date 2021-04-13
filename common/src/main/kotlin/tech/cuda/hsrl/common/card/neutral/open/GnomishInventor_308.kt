package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GnomishInventor_308 : Card() {
    override val id = 308
    override val name = "侏儒发明家"
    override val description = "<b>战吼：</b>抽一张牌。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "她从来不知道她想发明的是什么，她只知道要发明很棒的东西！"
    override val artist = "Court Jones"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8e4304fc5c52f9cc4892d2316353b05bbb36c5751517e77403a4c9b5e4886deb.png"
}
