package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NetherspiteHistorian_39554 : Card() {
    override val id = 39554
    override val name = "虚空幽龙史学家"
    override val description = "<b>战吼：</b>如果你的手牌中有龙牌，便<b>发现</b>一张龙牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Karazhan
    override val background = "她会告诉你当年那些没挡着绿光的人，现在都回家带孩子去了！"
    override val artist = "Ralph Horsley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/24fe8adc376a28bbe412599d8860c54dff8f0058bf86aaf52524e1424ace21a7.png"
}
