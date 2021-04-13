package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OnyxMagescribe_58971 : Card() {
    override val id = 58971
    override val name = "黑岩法术抄写员"
    override val description = "<b>法术迸发：</b>随机将两张你职业的法术牌置入你的手牌。"
    override var cost: Int? = 6
    override var health: Int? = 9
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "舍不得法术，套不着法术。"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4d86670e15ae3eeee205f378626b208eac24c9b15d7740bfc4222e1e2ebe6709.png"
}
