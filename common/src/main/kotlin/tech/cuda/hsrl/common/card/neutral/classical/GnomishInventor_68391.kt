package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GnomishInventor_68391 : Card() {
    override val id = 68391
    override val name = "侏儒发明家"
    override val description = "<b>战吼：</b>抽一张牌。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "她从来不知道她想发明的是什么，她只知道要发明很棒的东西！"
    override val artist = "Court Jones"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/71e4c69264733741e074c5d262ce4f7a28dd9b26f9fff84089e4c61209688a9a.png"
}
