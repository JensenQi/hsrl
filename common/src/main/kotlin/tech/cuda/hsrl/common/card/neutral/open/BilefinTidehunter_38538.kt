package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BilefinTidehunter_38538 : Card() {
    override val id = 38538
    override val name = "怒鳍猎潮者"
    override val description = "<b>战吼：</b>召唤一个1/1并具有<b>嘲讽</b>的软泥怪。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "用它的鳍制成的脚蹼质量出奇的好。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7e6214b6cad30b0612ee34084027ccdcd80702a97ea286e076c196dbc43c2e16.png"
}
